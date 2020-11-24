package typings.jose.mod.JWE

import typings.jose.anon.DecryptOptionscompletetru
import typings.jose.mod.ConsumeKeyInput
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWE.decrypt")
@js.native
object decrypt extends js.Object {
  
  def apply(jwe: String, key: ConsumeKeyInput): Buffer = js.native
  def apply(jwe: String, key: ConsumeKeyInput, options: DecryptOptionscompletetru): completeDecrypt = js.native
  def apply(jwe: String, key: ConsumeKeyInput, options: DecryptOptions): Buffer = js.native
  def apply(jwe: FlattenedJWE, key: ConsumeKeyInput): Buffer = js.native
  def apply(jwe: FlattenedJWE, key: ConsumeKeyInput, options: DecryptOptionscompletetru): completeDecrypt = js.native
  def apply(jwe: FlattenedJWE, key: ConsumeKeyInput, options: DecryptOptions): Buffer = js.native
  def apply(jwe: GeneralJWE, key: ConsumeKeyInput): Buffer = js.native
  def apply(jwe: GeneralJWE, key: ConsumeKeyInput, options: DecryptOptionscompletetru): completeDecrypt = js.native
  def apply(jwe: GeneralJWE, key: ConsumeKeyInput, options: DecryptOptions): Buffer = js.native
}
