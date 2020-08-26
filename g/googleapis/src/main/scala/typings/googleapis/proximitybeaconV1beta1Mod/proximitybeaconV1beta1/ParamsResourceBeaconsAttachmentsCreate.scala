package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBeaconsAttachmentsCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Beacon on which the attachment should be created. A beacon name has the
    * format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast
    * by the beacon and N is a code for the beacon's type. Possible values are
    * `3` for Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for
    * AltBeacon. For Eddystone-EID beacons, you may use either the current EID
    * or the beacon's "stable" UID. Required.
    */
  var beaconName: js.UndefOr[String] = js.native
  /**
    * The project id of the project the attachment will belong to. If the
    * project id is not specified then the project making the request is used.
    * Optional.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBeaconAttachment] = js.native
}

object ParamsResourceBeaconsAttachmentsCreate {
  @scala.inline
  def apply(): ParamsResourceBeaconsAttachmentsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBeaconsAttachmentsCreate]
  }
  @scala.inline
  implicit class ParamsResourceBeaconsAttachmentsCreateOps[Self <: ParamsResourceBeaconsAttachmentsCreate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setBeaconName(value: String): Self = this.set("beaconName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeaconName: Self = this.set("beaconName", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaBeaconAttachment): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

