package typings.jose.mod.JWK

import typings.jose.mod.ECCurve
import typings.jose.mod.OKPCurve
import typings.jose.mod._ProduceKeyInput
import typings.jose.mod.keyObjectTypes
import typings.jose.mod.keyOperation
import typings.jose.mod.keyType
import typings.node.cryptoMod.KeyObject
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends _ProduceKeyInput {
  
  val alg: js.UndefOr[String] = js.native
  
  def algorithms(): Set[String] = js.native
  def algorithms(operation: keyOperation): Set[String] = js.native
  
  val crv: js.UndefOr[ECCurve | OKPCurve] = js.native
  
  val d: js.UndefOr[String] = js.native
  
  val dp: js.UndefOr[String] = js.native
  
  val dq: js.UndefOr[String] = js.native
  
  val e: js.UndefOr[String] = js.native
  
  val k: js.UndefOr[String] = js.native
  
  val keyObject: KeyObject = js.native
  
  val key_ops: js.UndefOr[js.Array[keyOperation]] = js.native
  
  val kid: String = js.native
  
  val kty: keyType = js.native
  
  val n: js.UndefOr[String] = js.native
  
  val p: js.UndefOr[String] = js.native
  
  val `private`: Boolean = js.native
  
  val public: Boolean = js.native
  
  val q: js.UndefOr[String] = js.native
  
  val qi: js.UndefOr[String] = js.native
  
  val secret: Boolean = js.native
  
  val thumbprint: String = js.native
  
  def toPEM(): String = js.native
  def toPEM(`private`: js.UndefOr[scala.Nothing], encoding: pemEncodingOptions): String = js.native
  def toPEM(`private`: Boolean): String = js.native
  def toPEM(`private`: Boolean, encoding: pemEncodingOptions): String = js.native
  
  val `type`: keyObjectTypes = js.native
  
  val use: js.UndefOr[typings.jose.mod.use] = js.native
  
  val x: js.UndefOr[String] = js.native
  
  val x5c: js.UndefOr[js.Array[String]] = js.native
  
  val x5t: js.UndefOr[String] = js.native
  
  @JSName("x5t#S256")
  val x5tNumbersignS256: js.UndefOr[String] = js.native
  
  val y: js.UndefOr[String] = js.native
}
