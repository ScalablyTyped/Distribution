package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesConfigsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The max number of items to include in the response list. Page size is 50
    * if not specified. Maximum value is 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The token of the page to retrieve.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the service.  See the
    * [overview](/service-management/overview) for naming requirements.  For
    * example: `example.googleapis.com`.
    */
  var serviceName: js.UndefOr[String] = js.native
}

