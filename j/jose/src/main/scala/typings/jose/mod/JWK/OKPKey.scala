package typings.jose.mod.JWK

import typings.jose.joseBooleans.`false`
import typings.jose.joseStrings.OKP
import typings.jose.mod.JWKOKPKey
import typings.jose.mod.OKPCurve
import typings.jose.mod.asymmetricKeyObjectTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OKPKey extends Key {
  @JSName("crv")
  val crv_OKPKey: OKPCurve = js.native
  @JSName("dp")
  val dp_OKPKey: js.UndefOr[scala.Nothing] = js.native
  @JSName("dq")
  val dq_OKPKey: js.UndefOr[scala.Nothing] = js.native
  @JSName("e")
  val e_OKPKey: js.UndefOr[scala.Nothing] = js.native
  @JSName("k")
  val k_OKPKey: js.UndefOr[scala.Nothing] = js.native
  @JSName("kty")
  val kty_OKPKey: OKP = js.native
  @JSName("n")
  val n_OKPKey: js.UndefOr[scala.Nothing] = js.native
  @JSName("p")
  val p_OKPKey: js.UndefOr[scala.Nothing] = js.native
  @JSName("q")
  val q_OKPKey: js.UndefOr[scala.Nothing] = js.native
  @JSName("qi")
  val qi_OKPKey: js.UndefOr[scala.Nothing] = js.native
  @JSName("secret")
  val secret_OKPKey: `false` = js.native
  @JSName("type")
  val type_OKPKey: asymmetricKeyObjectTypes = js.native
  @JSName("x")
  val x_OKPKey: String = js.native
  @JSName("y")
  val y_OKPKey: js.UndefOr[scala.Nothing] = js.native
  def toJWK(): JWKOKPKey = js.native
  def toJWK(`private`: Boolean): JWKOKPKey = js.native
}

