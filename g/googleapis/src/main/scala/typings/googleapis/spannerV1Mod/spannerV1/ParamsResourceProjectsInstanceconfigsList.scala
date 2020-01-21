package typings.googleapis.spannerV1Mod.spannerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsInstanceconfigsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Number of instance configurations to be returned in the response. If 0 or
    * less, defaults to the server's maximum allowed page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If non-empty, `page_token` should contain a next_page_token from a
    * previous ListInstanceConfigsResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The name of the project for which a list of supported instance
    * configurations is requested. Values are of the form `projects/<project>`.
    */
  var parent: js.UndefOr[String] = js.native
}

