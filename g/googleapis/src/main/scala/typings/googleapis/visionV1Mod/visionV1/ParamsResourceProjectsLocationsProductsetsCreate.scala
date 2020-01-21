package typings.googleapis.visionV1Mod.visionV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsProductsetsCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The project in which the ProductSet should be created.  Format is
    * `projects/PROJECT_ID/locations/LOC_ID`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * A user-supplied resource id for this ProductSet. If set, the server will
    * attempt to use this value as the resource id. If it is already in use, an
    * error is returned with code ALREADY_EXISTS. Must be at most 128
    * characters long. It cannot contain the character `/`.
    */
  var productSetId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProductSet] = js.native
}

