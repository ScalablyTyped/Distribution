package typings.googleapis.pubsubV1Mod.pubsubV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsSnapshotsCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional user-provided name for this snapshot. If the name is not
    * provided in the request, the server will assign a random name for this
    * snapshot on the same project as the subscription. Note that for REST API
    * requests, you must specify a name.  See the <a
    * href="https://cloud.google.com/pubsub/docs/admin#resource_names">
    * resource name rules</a>. Format is `projects/{project}/snapshots/{snap}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCreateSnapshotRequest] = js.native
}

