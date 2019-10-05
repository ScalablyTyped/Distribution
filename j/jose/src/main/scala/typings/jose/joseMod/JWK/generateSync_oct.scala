package typings.jose.joseMod.JWK

import typings.jose.joseMod.BasicParameters
import typings.jose.joseStrings.oct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generateSync")
@js.native
object generateSync_oct extends js.Object {
  def apply(kty: oct): OctKey = js.native
  def apply(kty: oct, bitlength: Double): OctKey = js.native
  def apply(kty: oct, bitlength: Double, parameters: BasicParameters): OctKey = js.native
}

