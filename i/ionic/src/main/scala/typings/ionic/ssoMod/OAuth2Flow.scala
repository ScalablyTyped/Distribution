package typings.ionic.ssoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/sso", "OAuth2Flow")
@js.native
abstract class OAuth2Flow protected () extends js.Object {
  def this(hasAuthorizationUrlTokenUrlClientIdRedirectHostRedirectPort: OAuth2FlowOptions, e: OAuth2FlowDeps) = this()
  val authorizationUrl: String = js.native
  val clientId: String = js.native
  val e: OAuth2FlowDeps = js.native
  val redirectHost: String = js.native
  val redirectPort: Double = js.native
  val tokenUrl: String = js.native
  /* protected */ def base64URLEncode(buffer: Buffer): String = js.native
  /* protected */ def generateAuthorizationParameters(challenge: String): AuthorizationParameters = js.native
  /* protected */ def generateChallenge(verifier: String): String = js.native
  /* protected */ def generateTokenParameters(authorizationCode: String, verifier: String): TokenParameters = js.native
  /* protected */ def generateVerifier(): String = js.native
  /* protected */ def getAccessToken(authorizationCode: String, verifier: String): js.Promise[String] = js.native
  /* protected */ def getAuthorizationCode(): js.Promise[String] = js.native
  /* protected */ def getSuccessHtml(): js.Promise[String] = js.native
  def redirectUrl(): String = js.native
  def run(): js.Promise[String] = js.native
}

