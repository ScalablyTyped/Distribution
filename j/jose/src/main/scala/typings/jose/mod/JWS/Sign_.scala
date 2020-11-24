package typings.jose.mod.JWS

import typings.jose.joseStrings.compact
import typings.jose.joseStrings.flattened
import typings.jose.joseStrings.general
import typings.jose.mod.ProduceKeyInputWithNone
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWS.Sign")
@js.native
class Sign_ protected () extends js.Object {
  def this(payload: String) = this()
  def this(payload: js.Object) = this()
  def this(payload: Buffer) = this()
  
  def recipient(key: ProduceKeyInputWithNone): Unit = js.native
  def recipient(key: ProduceKeyInputWithNone, `protected`: js.UndefOr[scala.Nothing], header: js.Object): Unit = js.native
  def recipient(key: ProduceKeyInputWithNone, `protected`: js.Object): Unit = js.native
  def recipient(key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): Unit = js.native
  
  @JSName("sign")
  def sign_compact(serialization: compact): String = js.native
  @JSName("sign")
  def sign_flattened(serialization: flattened): FlattenedJWS = js.native
  @JSName("sign")
  def sign_general(serialization: general): GeneralJWS = js.native
}
