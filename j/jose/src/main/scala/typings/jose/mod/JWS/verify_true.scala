package typings.jose.mod.JWS

import typings.jose.joseBooleans.`true`
import typings.jose.mod.ConsumeKeyInput
import typings.jose.mod.JWK.Key
import typings.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWS.verify")
@js.native
object verify_true extends js.Object {
  def apply(jws: String, key: ConsumeKeyInput, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object, Key] = js.native
  def apply(jws: String, key: NoneKey, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object, NoneKey] = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInput, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object, Key] = js.native
  def apply(jws: FlattenedJWS, key: NoneKey, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object, NoneKey] = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInput, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object, Key] = js.native
  def apply(jws: GeneralJWS, key: NoneKey, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object, NoneKey] = js.native
}

