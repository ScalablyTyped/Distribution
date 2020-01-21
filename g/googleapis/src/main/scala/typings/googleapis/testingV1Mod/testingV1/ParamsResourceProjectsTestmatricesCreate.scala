package typings.googleapis.testingV1Mod.testingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsTestmatricesCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The GCE project under which this job will run.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTestMatrix] = js.native
  /**
    * A string id used to detect duplicated requests. Ids are automatically
    * scoped to a project, so users should ensure the ID is unique per-project.
    * A UUID is recommended.  Optional, but strongly recommended.
    */
  var requestId: js.UndefOr[String] = js.native
}

