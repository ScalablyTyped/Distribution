package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsReposList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The project ID whose repos should be listed. Values are of the form
    * `projects/<project>`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Maximum number of repositories to return; between 1 and 500. If not set
    * or zero, defaults to 100 at the server.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Resume listing repositories where a prior ListReposResponse left off.
    * This is an opaque token that must be obtained from a recent, prior
    * ListReposResponse's next_page_token field.
    */
  var pageToken: js.UndefOr[String] = js.native
}

