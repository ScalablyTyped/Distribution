package typings.jose.joseMod.JWK

import typings.jose.joseMod.BasicParameters
import typings.jose.joseMod.OKPCurve
import typings.jose.joseStrings.OKP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generateSync")
@js.native
object generateSync_OKP extends js.Object {
  def apply(kty: OKP): OKPKey = js.native
  def apply(kty: OKP, crv: OKPCurve): OKPKey = js.native
  def apply(kty: OKP, crv: OKPCurve, parameters: BasicParameters): OKPKey = js.native
  def apply(kty: OKP, crv: OKPCurve, parameters: BasicParameters, `private`: Boolean): OKPKey = js.native
}

