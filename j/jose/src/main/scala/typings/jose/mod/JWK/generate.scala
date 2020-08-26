package typings.jose.mod.JWK

import typings.jose.mod.BasicParameters
import typings.jose.mod.Curves
import typings.jose.mod.keyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generate")
@js.native
object generate extends js.Object {
  def apply(kty: keyType): js.Promise[Key] = js.native
  def apply(
    kty: keyType,
    crvOrSize: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    `private`: Boolean
  ): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[Key] = js.native
  def apply(
    kty: keyType,
    crvOrSize: js.UndefOr[scala.Nothing],
    parameters: BasicParameters,
    `private`: Boolean
  ): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Double): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Double, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Double, parameters: BasicParameters): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Double, parameters: BasicParameters, `private`: Boolean): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Curves): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Curves, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Curves, parameters: BasicParameters): js.Promise[Key] = js.native
  def apply(kty: keyType, crvOrSize: Curves, parameters: BasicParameters, `private`: Boolean): js.Promise[Key] = js.native
}

