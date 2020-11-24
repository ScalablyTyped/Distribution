package typings.jose.mod.JWK

import typings.jose.joseStrings.oct
import typings.jose.mod.BasicParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWK.generate")
@js.native
object generate_oct extends js.Object {
  
  def apply(kty: oct): js.Promise[OctKey] = js.native
  def apply(kty: oct, bitlength: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[OctKey] = js.native
  def apply(kty: oct, bitlength: Double): js.Promise[OctKey] = js.native
  def apply(kty: oct, bitlength: Double, parameters: BasicParameters): js.Promise[OctKey] = js.native
}
