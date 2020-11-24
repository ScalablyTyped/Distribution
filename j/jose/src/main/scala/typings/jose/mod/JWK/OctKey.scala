package typings.jose.mod.JWK

import typings.jose.joseBooleans.`false`
import typings.jose.joseBooleans.`true`
import typings.jose.joseStrings.oct
import typings.jose.mod.JWKOctKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OctKey extends Key {
  
  @JSName("crv")
  val crv_OctKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("d")
  val d_OctKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("dp")
  val dp_OctKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("dq")
  val dq_OctKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("e")
  val e_OctKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("kty")
  val kty_OctKey: oct = js.native
  
  @JSName("n")
  val n_OctKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("p")
  val p_OctKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("private")
  val private_OctKey: `false` = js.native
  
  @JSName("public")
  val public_OctKey: `false` = js.native
  
  @JSName("q")
  val q_OctKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("qi")
  val qi_OctKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("secret")
  val secret_OctKey: `true` = js.native
  
  def toJWK(): JWKOctKey = js.native
  def toJWK(`private`: Boolean): JWKOctKey = js.native
  
  @JSName("type")
  val type_OctKey: typings.jose.joseStrings.secret = js.native
  
  @JSName("x")
  val x_OctKey: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("y")
  val y_OctKey: js.UndefOr[scala.Nothing] = js.native
}
