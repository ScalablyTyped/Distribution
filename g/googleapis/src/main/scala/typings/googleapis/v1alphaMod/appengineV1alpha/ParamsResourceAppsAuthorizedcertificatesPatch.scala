package typings.googleapis.v1alphaMod.appengineV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAppsAuthorizedcertificatesPatch extends StandardParameters {
  /**
    * Part of `name`. Name of the resource to update. Example:
    * apps/myapp/authorizedCertificates/12345.
    */
  var appsId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var authorizedCertificatesId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAuthorizedCertificate] = js.native
  /**
    * Standard field mask for the set of fields to be updated. Updates are only
    * supported on the certificate_raw_data and display_name fields.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object ParamsResourceAppsAuthorizedcertificatesPatch {
  @scala.inline
  def apply(): ParamsResourceAppsAuthorizedcertificatesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsAuthorizedcertificatesPatch]
  }
  @scala.inline
  implicit class ParamsResourceAppsAuthorizedcertificatesPatchOps[Self <: ParamsResourceAppsAuthorizedcertificatesPatch] (val x: Self) extends AnyVal {
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
    def setAppsId(value: String): Self = this.set("appsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsId: Self = this.set("appsId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setAuthorizedCertificatesId(value: String): Self = this.set("authorizedCertificatesId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizedCertificatesId: Self = this.set("authorizedCertificatesId", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaAuthorizedCertificate): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

