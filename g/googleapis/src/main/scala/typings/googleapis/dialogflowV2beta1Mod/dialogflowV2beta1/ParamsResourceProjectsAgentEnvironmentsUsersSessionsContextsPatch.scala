package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The unique identifier of the context. Format:
    * `projects/<Project ID>/agent/sessions/<Session ID>/contexts/<Context
    * ID>`, or `projects/<Project ID>/agent/environments/<Environment
    * ID>/users/<User ID>/sessions/<Session ID>/contexts/<Context ID>`.  The
    * `Context ID` is always converted to lowercase, may only contain
    * characters in a-zA-Z0-9_-% and may be at most 250 bytes long.  If
    * `Environment ID` is not specified, we assume default 'draft' environment.
    * If `User ID` is not specified, we assume default '-' user.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  /**
    * Optional. The mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

