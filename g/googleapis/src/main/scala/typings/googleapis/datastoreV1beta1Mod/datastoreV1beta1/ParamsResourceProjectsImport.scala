package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsImport extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
  * Project ID against which to make the request.
  */
  var projectId: js.UndefOr[String] = js.native
  /**
  * Request body metadata
  */
  var requestBody: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1ImportEntitiesRequest] = js.native
}

