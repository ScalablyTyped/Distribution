package typings.googleapis.testingV1Mod.testingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTestenvironmentcatalogGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The type of environment that should be listed.
    */
  var environmentType: js.UndefOr[String] = js.native
  /**
    * For authorization, the cloud project requesting the
    * TestEnvironmentCatalog.
    */
  var projectId: js.UndefOr[String] = js.native
}

