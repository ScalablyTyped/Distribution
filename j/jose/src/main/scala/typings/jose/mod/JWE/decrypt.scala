package typings.jose.mod.JWE

import typings.jose.mod.ConsumeKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWE.decrypt")
@js.native
object decrypt extends js.Object {
  def apply(jwe: String, key: ConsumeKeyInput): completeDecrypt = js.native
  def apply(jwe: FlattenedJWE, key: ConsumeKeyInput): completeDecrypt = js.native
  def apply(jwe: GeneralJWE, key: ConsumeKeyInput): completeDecrypt = js.native
}

