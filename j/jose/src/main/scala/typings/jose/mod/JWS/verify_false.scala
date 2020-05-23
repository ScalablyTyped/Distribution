package typings.jose.mod.JWS

import typings.jose.joseBooleans.`false`
import typings.jose.mod.ConsumeKeyInputWithNone
import typings.jose.mod.EmbeddedVerifyKeys
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWS.verify")
@js.native
object verify_false extends js.Object {
  def apply(
    jws: String,
    key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
    options: VerifyOptions[`false`, `false`]
  ): Buffer = js.native
  def apply(
    jws: FlattenedJWS,
    key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
    options: VerifyOptions[`false`, `false`]
  ): Buffer = js.native
  def apply(
    jws: GeneralJWS,
    key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
    options: VerifyOptions[`false`, `false`]
  ): Buffer = js.native
}

