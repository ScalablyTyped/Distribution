package typings.jose.mod.JWK

import typings.jose.joseStrings.OKP
import typings.jose.mod.BasicParameters
import typings.jose.mod.OKPCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generateSync")
@js.native
object generateSync_OKP extends js.Object {
  def apply(kty: OKP): OKPKey = js.native
  def apply(
    kty: OKP,
    crv: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    `private`: Boolean
  ): OKPKey = js.native
  def apply(kty: OKP, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters): OKPKey = js.native
  def apply(kty: OKP, crv: js.UndefOr[scala.Nothing], parameters: BasicParameters, `private`: Boolean): OKPKey = js.native
  def apply(kty: OKP, crv: OKPCurve): OKPKey = js.native
  def apply(kty: OKP, crv: OKPCurve, parameters: js.UndefOr[scala.Nothing], `private`: Boolean): OKPKey = js.native
  def apply(kty: OKP, crv: OKPCurve, parameters: BasicParameters): OKPKey = js.native
  def apply(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): OKPKey = js.native
}

