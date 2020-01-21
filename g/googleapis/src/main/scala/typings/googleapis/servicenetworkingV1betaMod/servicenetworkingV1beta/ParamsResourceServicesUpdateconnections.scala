package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesUpdateconnections extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If a previously defined allocated range is removed, force flag must be
    * set to true.
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * The service producer peering service that is managing peering
    * connectivity for a service producer organization. For Google services
    * that support this functionality, this is
    * `services/servicenetworking.googleapis.com`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaConnection] = js.native
  /**
    * The update mask. If this is omitted, it defaults to "*". You can only
    * update the listed peering ranges.
    */
  var updateMask: js.UndefOr[String] = js.native
}

