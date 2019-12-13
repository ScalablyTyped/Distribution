package typings.jose.joseMod.JWE

import typings.jose.joseMod.ConsumeKeyInput
import typings.jose.joseNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWE.decrypt")
@js.native
object decrypt_true extends js.Object {
  def apply(jwe: String, key: ConsumeKeyInput, options: DecryptOptions[`true`]): completeDecrypt = js.native
  def apply(jwe: FlattenedJWE, key: ConsumeKeyInput, options: DecryptOptions[`true`]): completeDecrypt = js.native
  def apply(jwe: GeneralJWE, key: ConsumeKeyInput, options: DecryptOptions[`true`]): completeDecrypt = js.native
}

