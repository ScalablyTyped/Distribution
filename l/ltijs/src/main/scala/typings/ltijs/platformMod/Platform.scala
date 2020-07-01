package typings.ltijs.platformMod

import typings.ltijs.ltijsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Platform extends js.Object {
  def platformAccessToken(scopes: String): js.Promise[String | `false`] = js.native
  def platformAccessTokenEndpoint(): js.Promise[String | Boolean] = js.native
  def platformAccessTokenEndpoint(accesstokenEndpoint: String): js.Promise[String | Boolean] = js.native
  def platformAuthConfig(method: String, key: String): js.Promise[PlatformAuthConfig | Boolean] = js.native
  def platformAuthEndpoint(): js.Promise[String | Boolean] = js.native
  def platformAuthEndpoint(authEndpoint: String): js.Promise[String | Boolean] = js.native
  def platformClientId(): js.Promise[String | Boolean] = js.native
  def platformClientId(clientId: String): js.Promise[String | Boolean] = js.native
  def platformKid(): String = js.native
  def platformName(): js.Promise[String | Boolean] = js.native
  def platformName(name: String): js.Promise[String | Boolean] = js.native
  def platformPrivateKey(): js.Promise[String | `false`] = js.native
  def platformPublicKey(): js.Promise[String | `false`] = js.native
  def platformUrl(): js.Promise[String | Boolean] = js.native
  def platformUrl(url: String): js.Promise[String | Boolean] = js.native
  def remove(): js.Promise[Boolean] = js.native
}

