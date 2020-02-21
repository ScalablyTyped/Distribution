package typings.jose.mod.JWT

import typings.jose.joseBooleans.`false`
import typings.jose.joseBooleans.`true`
import typings.jose.joseStrings.logout_token
import typings.jose.mod.ConsumeKeyInput
import typings.jose.mod.ConsumeKeyInputWithNone
import typings.jose.mod.JWK.Key
import typings.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.LogoutToken")
@js.native
object LogoutToken extends js.Object {
  def verify(
    jwt: String,
    key: ConsumeKeyInputWithNone,
    options: VerifyOptions[`false`] with VerifyProfileOptions[logout_token]
  ): js.Object = js.native
  def verify(jwt: String, key: NoneKey, options: VerifyOptions[`true`] with VerifyProfileOptions[logout_token]): completeResult[NoneKey] = js.native
  @JSName("verify")
  def verify_completeResult(
    jwt: String,
    key: ConsumeKeyInput,
    options: VerifyOptions[`true`] with VerifyProfileOptions[logout_token]
  ): completeResult[Key] = js.native
}

