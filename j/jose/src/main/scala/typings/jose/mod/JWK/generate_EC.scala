package typings.jose.mod.JWK

import typings.jose.joseStrings.EC
import typings.jose.mod.BasicParameters
import typings.jose.mod.ECCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generate")
@js.native
object generate_EC extends js.Object {
  def apply(kty: EC): js.Promise[ECKey] = js.native
  def apply(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[ECKey] = js.native
  def apply(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters): js.Promise[ECKey] = js.native
  def apply(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): js.Promise[ECKey] = js.native
  def apply(kty: EC, crv: ECCurve): js.Promise[ECKey] = js.native
  def apply(kty: EC, crv: ECCurve, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): js.Promise[ECKey] = js.native
  def apply(kty: EC, crv: ECCurve, parameters: BasicParameters): js.Promise[ECKey] = js.native
  def apply(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): js.Promise[ECKey] = js.native
}

