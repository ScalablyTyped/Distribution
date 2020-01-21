package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsConfigsVariablesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Filters variables by matching the specified filter. For example:
    * `projects/example-project/config/[CONFIG_NAME]/variables/example-variable`.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Specifies the number of results to return per page. If there are fewer
    * elements than the specified number, returns all elements.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Specifies a page token to use. Set `pageToken` to a `nextPageToken`
    * returned by a previous list request to get the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The path to the RuntimeConfig resource for which you want to list
    * variables. The configuration must exist beforehand; the path must be in
    * the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The flag indicates whether the user wants to return values of variables.
    * If true, then only those variables that user has IAM GetVariable
    * permission will be returned along with their values.
    */
  var returnValues: js.UndefOr[Boolean] = js.native
}

