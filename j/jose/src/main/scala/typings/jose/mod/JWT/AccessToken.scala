package typings.jose.mod.JWT

import typings.jose.anon.VerifyOptionscompletetrueComplete
import typings.jose.mod.ConsumeKeyInput
import typings.jose.mod.ConsumeKeyInputWithNone
import typings.jose.mod.EmbeddedVerifyKeys
import typings.jose.mod.JWK.Key
import typings.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWT.AccessToken")
@js.native
object AccessToken extends js.Object {
  
  def verify(
    jwt: String,
    key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
    options: VerifyOptions with AccessTokenVerifyOptions
  ): js.Object = js.native
  def verify(jwt: String, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrueComplete): completeResult[Key] = js.native
  def verify(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueComplete): completeResult[NoneKey] = js.native
}
