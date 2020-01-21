package typings.jose.mod.JWK

import typings.jose.joseStrings.RSA
import typings.jose.mod.BasicParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generate")
@js.native
object generate_RSA extends js.Object {
  def apply(kty: RSA): js.Promise[RSAKey] = js.native
  def apply(kty: RSA, bitlength: Double): js.Promise[RSAKey] = js.native
  def apply(kty: RSA, bitlength: Double, parameters: BasicParameters): js.Promise[RSAKey] = js.native
  def apply(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): js.Promise[RSAKey] = js.native
}

