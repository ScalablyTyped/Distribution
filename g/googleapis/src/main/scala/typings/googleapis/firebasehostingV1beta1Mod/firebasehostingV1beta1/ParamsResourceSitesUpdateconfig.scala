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

