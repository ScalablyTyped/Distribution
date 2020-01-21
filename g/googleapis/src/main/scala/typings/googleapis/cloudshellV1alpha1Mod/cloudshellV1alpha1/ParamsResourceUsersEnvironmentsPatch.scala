package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceUsersEnvironmentsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name of the resource to be updated, for example
    * `users/me/environments/default` or
    * `users/someone@example.com/environments/default`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEnvironment] = js.native
  /**
    * Mask specifying which fields in the environment should be updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

