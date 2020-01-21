package typings.googleapis.redisV1Mod.redisV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsInstancesCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The logical name of the Redis instance in the customer project
    * with the following restrictions:  * Must contain only lowercase letters,
    * numbers, and hyphens. * Must start with a letter. * Must be between 1-40
    * characters. * Must end with a number or a letter. * Must be unique within
    * the customer project / location
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the instance location using the form:
    * `projects/{project_id}/locations/{location_id}` where `location_id`
    * refers to a GCP region
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInstance] = js.native
}

