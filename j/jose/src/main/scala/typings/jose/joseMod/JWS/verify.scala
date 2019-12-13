package typings.jose.joseMod.JWS

import typings.jose.joseMod.ConsumeKeyInput
import typings.jose.joseNumbers.`false`
import typings.jose.joseNumbers.`true`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWS.verify")
@js.native
object verify extends js.Object {
  def apply(jws: String, key: ConsumeKeyInput): Buffer = js.native
  def apply(jws: String, key: ConsumeKeyInput, options: VerifyOptions[`false`, `true`]): String | js.Object = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInput): Buffer = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInput, options: VerifyOptions[`false`, `true`]): String | js.Object = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInput): Buffer = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInput, options: VerifyOptions[`false`, `true`]): String | js.Object = js.native
}

