package typings.jose.joseMod.JWS

import typings.jose.joseBooleans.`true`
import typings.jose.joseMod.ConsumeKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWS.verify")
@js.native
object verify_true extends js.Object {
  def apply(jws: String, key: ConsumeKeyInput, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object] = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInput, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object] = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInput, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object] = js.native
}

