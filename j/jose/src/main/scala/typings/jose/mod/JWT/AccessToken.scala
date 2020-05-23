package typings.jose.mod.JWT

import typings.jose.joseBooleans.`false`
import typings.jose.joseBooleans.`true`
import typings.jose.joseStrings.atPlussignJWT
import typings.jose.mod.ConsumeKeyInput
import typings.jose.mod.ConsumeKeyInputWithNone
import typings.jose.mod.EmbeddedVerifyKeys
import typings.jose.mod.JWK.Key
import typings.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.AccessToken")
@js.native
object AccessToken extends js.Object {
  def verify(
    jwt: String,
    key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
    options: VerifyOptions[`false`] with VerifyProfileOptions[atPlussignJWT]
  ): js.Object = js.native
  def verify(jwt: String, key: NoneKey, options: VerifyOptions[`true`] with VerifyProfileOptions[atPlussignJWT]): completeResult[NoneKey] = js.native
  @JSName("verify")
  def verify_completeResult(
    jwt: String,
    key: ConsumeKeyInput | EmbeddedVerifyKeys,
    options: VerifyOptions[`true`] with VerifyProfileOptions[atPlussignJWT]
  ): completeResult[Key] = js.native
}

