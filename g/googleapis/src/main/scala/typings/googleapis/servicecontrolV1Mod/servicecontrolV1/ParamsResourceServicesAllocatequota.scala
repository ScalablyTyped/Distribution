package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesAllocatequota extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAllocateQuotaRequest] = js.native
  /**
    * Name of the service as specified in the service configuration. For
    * example, `"pubsub.googleapis.com"`.  See google.api.Service for the
    * definition of a service name.
    */
  var serviceName: js.UndefOr[String] = js.native
}

