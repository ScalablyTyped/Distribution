package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePipelinesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Pipelines with names that match this prefix should be returned.  If
    * unspecified, all pipelines in the project, up to `pageSize`, will be
    * returned.
    */
  var namePrefix: js.UndefOr[String] = js.native
  /**
    * Number of pipelines to return at once. Defaults to 256, and max is 2048.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Token to use to indicate where to start getting results. If unspecified,
    * returns the first page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The name of the project to search for pipelines. Caller must
    * have READ access to this project.
    */
  var projectId: js.UndefOr[String] = js.native
}

