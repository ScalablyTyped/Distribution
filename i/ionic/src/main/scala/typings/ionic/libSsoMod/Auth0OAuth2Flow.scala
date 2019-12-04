package typings.ionic.libSsoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/sso", "Auth0OAuth2Flow")
@js.native
class Auth0OAuth2Flow protected () extends OAuth2Flow {
  def this(
    hasEmailConnectionAudienceAuthorizationUrlTokenUrlClientIdOptions: Auth0OAuth2FlowOptions,
    e: OAuth2FlowDeps
  ) = this()
  val audience: String = js.native
  val connection: String = js.native
  val email: String = js.native
}

