package typings.jose.joseMod.JWE

import typings.jose.joseMod.ConsumeKeyInput
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWE.decrypt")
@js.native
object decrypt extends js.Object {
  def apply(jwe: String, key: ConsumeKeyInput): Buffer = js.native
  def apply(jwe: FlattenedJWE, key: ConsumeKeyInput): Buffer = js.native
  def apply(jwe: GeneralJWE, key: ConsumeKeyInput): Buffer = js.native
}

