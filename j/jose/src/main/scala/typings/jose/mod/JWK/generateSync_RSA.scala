package typings.jose.mod.JWK

import typings.jose.joseStrings.RSA
import typings.jose.mod.BasicParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generateSync")
@js.native
object generateSync_RSA extends js.Object {
  def apply(kty: RSA): RSAKey = js.native
  def apply(
    kty: RSA,
    bitlength: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    `private`: Boolean
  ): RSAKey = js.native
  def apply(kty: RSA, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters): RSAKey = js.native
  def apply(kty: RSA, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): RSAKey = js.native
  def apply(kty: RSA, bitlength: Double): RSAKey = js.native
  def apply(kty: RSA, bitlength: Double, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): RSAKey = js.native
  def apply(kty: RSA, bitlength: Double, parameters: BasicParameters): RSAKey = js.native
  def apply(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): RSAKey = js.native
}

