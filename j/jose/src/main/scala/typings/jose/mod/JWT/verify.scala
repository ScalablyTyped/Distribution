package typings.jose.mod.JWT

import typings.jose.anon.VerifyOptionscompletetrueAlgorithms
import typings.jose.mod.ConsumeKeyInput
import typings.jose.mod.ConsumeKeyInputWithNone
import typings.jose.mod.EmbeddedVerifyKeys
import typings.jose.mod.JWK.Key
import typings.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWT.verify")
@js.native
object verify extends js.Object {
  
  def apply(jwt: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): js.Object = js.native
  def apply(
    jwt: String,
    key: ConsumeKeyInput | EmbeddedVerifyKeys,
    options: VerifyOptionscompletetrueAlgorithms
  ): completeResult[Key] = js.native
  def apply(jwt: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys, options: VerifyOptions): js.Object = js.native
  def apply(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueAlgorithms): completeResult[NoneKey] = js.native
}
