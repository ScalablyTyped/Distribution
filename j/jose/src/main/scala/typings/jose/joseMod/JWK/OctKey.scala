package typings.jose.joseMod.JWK

import typings.jose.joseMod.JWKOctKey
import typings.jose.joseNumbers.`false`
import typings.jose.joseNumbers.`true`
import typings.jose.joseStrings.oct
import typings.jose.joseStrings.secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.OctKey")
@js.native
class OctKey () extends Key {
  var k: js.UndefOr[String] = js.native
  @JSName("kty")
  var kty_OctKey: oct = js.native
  @JSName("private")
  var private_OctKey: `false` = js.native
  @JSName("public")
  var public_OctKey: `false` = js.native
  @JSName("secret")
  var secret_OctKey: `true` = js.native
  @JSName("type")
  var type_OctKey: secret = js.native
  def toJWK(): JWKOctKey = js.native
  def toJWK(`private`: Boolean): JWKOctKey = js.native
}

