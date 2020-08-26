package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSitesUpdateconfig extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The site for which to update the SiteConfig, in the format:
    * <code>sites/<var>site-name</var>/config</code>
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSiteConfig] = js.native
  /**
    * A set of field names from your [site configuration](../sites.SiteConfig)
    * that you want to update. <br>A field will be overwritten if, and only if,
    * it's in the mask. <br>If a mask is not provided then a default mask of
    * only [`max_versions`](../sites.SiteConfig.max_versions) will be used.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object ParamsResourceSitesUpdateconfig {
  @scala.inline
  def apply(): ParamsResourceSitesUpdateconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesUpdateconfig]
  }
  @scala.inline
  implicit class ParamsResourceSitesUpdateconfigOps[Self <: ParamsResourceSitesUpdateconfig] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaSiteConfig): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

