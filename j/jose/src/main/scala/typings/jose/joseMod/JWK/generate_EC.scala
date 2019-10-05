package typings.jose.joseMod.JWK

import typings.jose.joseMod.BasicParameters
import typings.jose.joseMod.ECCurve
import typings.jose.joseStrings.EC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generate")
@js.native
object generate_EC extends js.Object {
  def apply(kty: EC): js.Promise[ECKey] = js.native
  def apply(kty: EC, crv: ECCurve): js.Promise[ECKey] = js.native
  def apply(kty: EC, crv: ECCurve, parameters: BasicParameters): js.Promise[ECKey] = js.native
  def apply(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): js.Promise[ECKey] = js.native
}

