package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBeaconsAttachmentsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Beacon on which the attachment should be created. A beacon name has the
    * format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast
    * by the beacon and N is a code for the beacon's type. Possible values are
    * `3` for Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for
    * AltBeacon. For Eddystone-EID beacons, you may use either the current EID
    * or the beacon's "stable" UID. Required.
    */
  var beaconName: js.UndefOr[String] = js.undefined
  
  /**
    * The project id of the project the attachment will belong to. If the
    * project id is not specified then the project making the request is used.
    * Optional.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBeaconAttachment] = js.undefined
}
object ParamsResourceBeaconsAttachmentsCreate {
  
  @scala.inline
  def apply(): ParamsResourceBeaconsAttachmentsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBeaconsAttachmentsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceBeaconsAttachmentsCreateMutableBuilder[Self <: ParamsResourceBeaconsAttachmentsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBeaconName(value: String): Self = StObject.set(x, "beaconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconNameUndefined: Self = StObject.set(x, "beaconName", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaBeaconAttachment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
