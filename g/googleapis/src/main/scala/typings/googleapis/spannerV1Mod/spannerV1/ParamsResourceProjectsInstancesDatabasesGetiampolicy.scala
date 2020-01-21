package typings.googleapis.spannerV1Mod.spannerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsInstancesDatabasesGetiampolicy extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGetIamPolicyRequest] = js.native
  /**
    * REQUIRED: The Cloud Spanner resource for which the policy is being
    * retrieved. The format is `projects/<project ID>/instances/<instance ID>`
    * for instance resources and `projects/<project ID>/instances/<instance
    * ID>/databases/<database ID>` for database resources.
    */
  var resource: js.UndefOr[String] = js.native
}

