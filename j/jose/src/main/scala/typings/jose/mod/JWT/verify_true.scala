package typings.jose.mod.JWT

import typings.jose.joseBooleans.`true`
import typings.jose.mod.ConsumeKeyInput
import typings.jose.mod.EmbeddedVerifyKeys
import typings.jose.mod.JWK.Key
import typings.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.verify")
@js.native
object verify_true extends js.Object {
  def apply(jwt: String, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptions[`true`]): completeResult[Key] = js.native
  def apply(jwt: String, key: NoneKey, options: VerifyOptions[`true`]): completeResult[NoneKey] = js.native
}

