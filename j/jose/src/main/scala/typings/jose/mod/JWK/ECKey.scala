package typings.jose.mod.JWK

import typings.jose.joseBooleans.`false`
import typings.jose.joseStrings.EC
import typings.jose.mod.ECCurve
import typings.jose.mod.JWKECKey
import typings.jose.mod.asymmetricKeyObjectTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ECKey extends Key {
  
  @JSName("crv")
  val crv_ECKey: ECCurve = js.native
  
  @JSName("dp")
  val dp_ECKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("dq")
  val dq_ECKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("e")
  val e_ECKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("k")
  val k_ECKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("kty")
  val kty_ECKey: EC = js.native
  
  @JSName("n")
  val n_ECKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("p")
  val p_ECKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("q")
  val q_ECKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("qi")
  val qi_ECKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("secret")
  val secret_ECKey: `false` = js.native
  
  def toJWK(): JWKECKey = js.native
  def toJWK(`private`: Boolean): JWKECKey = js.native
  
  @JSName("type")
  val type_ECKey: asymmetricKeyObjectTypes = js.native
  
  @JSName("x")
  val x_ECKey: String = js.native
  
  @JSName("y")
  val y_ECKey: String = js.native
}
