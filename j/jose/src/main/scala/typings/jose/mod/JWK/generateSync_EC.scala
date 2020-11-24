package typings.jose.mod.JWK

import typings.jose.joseStrings.EC
import typings.jose.mod.BasicParameters
import typings.jose.mod.ECCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWK.generateSync")
@js.native
object generateSync_EC extends js.Object {
  
  def apply(kty: EC): ECKey = js.native
  def apply(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: js.UndefOr[scala.Nothing], `private`: Boolean): ECKey = js.native
  def apply(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters): ECKey = js.native
  def apply(kty: EC, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): ECKey = js.native
  def apply(kty: EC, crv: ECCurve): ECKey = js.native
  def apply(kty: EC, crv: ECCurve, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): ECKey = js.native
  def apply(kty: EC, crv: ECCurve, parameters: BasicParameters): ECKey = js.native
  def apply(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): ECKey = js.native
}
