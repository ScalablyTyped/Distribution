package typings.jose.joseMod.JWS

import typings.jose.joseBooleans.`false`
import typings.jose.joseMod.ConsumeKeyInput
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWS.verify")
@js.native
object verify_false extends js.Object {
  def apply(jws: String, key: ConsumeKeyInput, options: VerifyOptions[`false`, `false`]): Buffer = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInput, options: VerifyOptions[`false`, `false`]): Buffer = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInput, options: VerifyOptions[`false`, `false`]): Buffer = js.native
}

