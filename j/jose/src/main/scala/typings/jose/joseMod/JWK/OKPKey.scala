package typings.jose.joseMod.JWK

import typings.jose.joseBooleans.`false`
import typings.jose.joseMod.JWKOKPKey
import typings.jose.joseMod.OKPCurve
import typings.jose.joseMod.asymmetricKeyObjectTypes
import typings.jose.joseStrings.OKP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.OKPKey")
@js.native
class OKPKey () extends Key {
  var crv: OKPCurve = js.native
  var d: js.UndefOr[String] = js.native
  @JSName("kty")
  var kty_OKPKey: OKP = js.native
  @JSName("secret")
  var secret_OKPKey: `false` = js.native
  @JSName("type")
  var type_OKPKey: asymmetricKeyObjectTypes = js.native
  var x: String = js.native
  def toJWK(): JWKOKPKey = js.native
  def toJWK(`private`: Boolean): JWKOKPKey = js.native
}

