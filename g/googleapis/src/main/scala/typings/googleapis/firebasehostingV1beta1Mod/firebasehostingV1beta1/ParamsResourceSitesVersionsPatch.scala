package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSitesVersionsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The unique identifier for a version, in the format:
    * <code>sites/<var>site-name</var>/versions/<var>versionID</var></code>
    * This name is provided in the response body when you call the
    * [`CreateVersion`](../sites.versions/create) endpoint.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaVersion] = js.native
  /**
    * A set of field names from your [version](../sites.versions) that you want
    * to update. <br>A field will be overwritten if, and only if, it's in the
    * mask. <br>If a mask is not provided then a default mask of only
    * [`status`](../sites.versions#Version.FIELDS.status) will be used.
    */
  var updateMask: js.UndefOr[String] = js.native
}

