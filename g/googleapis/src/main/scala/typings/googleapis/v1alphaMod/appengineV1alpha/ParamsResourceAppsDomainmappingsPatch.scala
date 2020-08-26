package typings.googleapis.v1alphaMod.appengineV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAppsDomainmappingsPatch extends StandardParameters {
  /**
    * Part of `name`. Name of the resource to update. Example:
    * apps/myapp/domainMappings/example.com.
    */
  var appsId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var domainMappingsId: js.UndefOr[String] = js.native
  /**
    * Whether a managed certificate should be provided by App Engine. If true,
    * a certificate ID must be manually set in the DomainMapping resource to
    * configure SSL for this domain. If false, a managed certificate will be
    * provisioned and a certificate ID will be automatically populated. Only
    * applicable if ssl_settings.certificate_id is specified in the update
    * mask.
    */
  var noManagedCertificate: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDomainMapping] = js.native
  /**
    * Standard field mask for the set of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object ParamsResourceAppsDomainmappingsPatch {
  @scala.inline
  def apply(): ParamsResourceAppsDomainmappingsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsDomainmappingsPatch]
  }
  @scala.inline
  implicit class ParamsResourceAppsDomainmappingsPatchOps[Self <: ParamsResourceAppsDomainmappingsPatch] (val x: Self) extends AnyVal {
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
    def setDomainMappingsId(value: String): Self = this.set("domainMappingsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainMappingsId: Self = this.set("domainMappingsId", js.undefined)
    @scala.inline
    def setNoManagedCertificate(value: Boolean): Self = this.set("noManagedCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoManagedCertificate: Self = this.set("noManagedCertificate", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaDomainMapping): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

