package typings.jose.mod.JWT

import typings.jose.anon.VerifyOptionscompletetrueAudience
import typings.jose.mod.ConsumeKeyInput
import typings.jose.mod.ConsumeKeyInputWithNone
import typings.jose.mod.EmbeddedVerifyKeys
import typings.jose.mod.JWK.Key
import typings.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWT.IdToken")
@js.native
object IdToken extends js.Object {
  
  def verify(
    jwt: String,
    key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
    options: VerifyOptions with IdTokenVerifyOptions
  ): js.Object = js.native
  def verify(jwt: String, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrueAudience): completeResult[Key] = js.native
  def verify(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueAudience): completeResult[NoneKey] = js.native
}
