package typings.jose.joseMod.JWK

import typings.jose.joseMod.keyObjectTypes
import typings.jose.joseMod.keyOperation
import typings.jose.joseMod.keyType
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.Key")
@js.native
class Key () extends js.Object {
  var alg: js.UndefOr[String] = js.native
  var key_ops: js.UndefOr[js.Array[keyOperation]] = js.native
  var kid: String = js.native
  var kty: keyType = js.native
  var `private`: Boolean = js.native
  var public: Boolean = js.native
  var secret: Boolean = js.native
  var thumbprint: String = js.native
  var `type`: keyObjectTypes = js.native
  var use: js.UndefOr[typings.jose.joseMod.use] = js.native
  var x5c: js.UndefOr[js.Array[String]] = js.native
  var x5t: js.UndefOr[String] = js.native
  var `x5t#S256`: js.UndefOr[String] = js.native
  def algorithms(): Set[String] = js.native
  def algorithms(operation: keyOperation): Set[String] = js.native
  def toPEM(): String = js.native
  def toPEM(`private`: Boolean): String = js.native
  def toPEM(`private`: Boolean, encoding: pemEncodingOptions): String = js.native
}

