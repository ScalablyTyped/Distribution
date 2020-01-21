package typings.googleapis.mlV1Mod.mlV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsJobsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The job name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudMlV1Job] = js.native
  /**
    * Required. Specifies the path, relative to `Job`, of the field to update.
    * To adopt etag mechanism, include `etag` field in the mask, and include
    * the `etag` value in your job resource.  For example, to change the labels
    * of a job, the `update_mask` parameter would be specified as `labels`,
    * `etag`, and the `PATCH` request body would specify the new value, as
    * follows:     {       "labels": {          "owner": "Google", "color":
    * "Blue"       }       "etag": "33a64df551425fcc55e4d42a148795d9f25f89d4"
    * } If `etag` matches the one on the server, the labels of the job will be
    * replaced with the given ones, and the server end `etag` will be
    * recalculated.  Currently the only supported update masks are `labels` and
    * `etag`.
    */
  var updateMask: js.UndefOr[String] = js.native
}

