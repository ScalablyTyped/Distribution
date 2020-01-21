package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSitesReleasesCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The site that the release belongs to, in the format:
    * <code>sites/<var>site-name</var></code>
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRelease] = js.native
  /**
    * The unique identifier for a version, in the format:
    * <code>/sites/<var>site-name</var>/versions/<var>versionID</var></code>
    * The <var>site-name</var> in this version identifier must match the
    * <var>site-name</var> in the `parent` parameter. <br> <br>This query
    * parameter must be empty if the `type` field in the request body is
    * `SITE_DISABLE`.
    */
  var versionName: js.UndefOr[String] = js.native
}

