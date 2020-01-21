package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesConnectionsPatch extends StandardParameters {
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
    * The private service connection that connects to a service producer
    * organization. The name includes both the private service name and the VPC
    * network peering name in the format of
    * `services/{peering_service_name}/connections/{vpc_peering_name}`. For
    * Google services that support this functionality, this is
    * `services/servicenetworking.googleapis.com/connections/servicenetworking-googleapis-com`.
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

