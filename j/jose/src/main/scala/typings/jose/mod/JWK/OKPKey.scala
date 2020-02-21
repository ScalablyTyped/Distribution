package typings.jose.mod.JWK

import typings.jose.joseBooleans.`false`
import typings.jose.joseStrings.OKP
import typings.jose.mod.JWKOKPKey
import typings.jose.mod.OKPCurve
import typings.jose.mod.asymmetricKeyObjectTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OKPKey extends Key {
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

