package typings.jose.mod.JWS

import typings.jose.anon.VerifyOptionscompletetrue
import typings.jose.mod.ConsumeKeyInput
import typings.jose.mod.ConsumeKeyInputWithNone
import typings.jose.mod.EmbeddedVerifyKeys
import typings.jose.mod.JWK.Key
import typings.jose.mod.NoneKey
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWS.verify")
@js.native
object verify extends js.Object {
  
  def apply(jws: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): Buffer = js.native
  def apply(jws: String, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrue): completeVerification[Key] = js.native
  def apply(jws: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys, options: VerifyOptions): Buffer = js.native
  def apply(jws: String, key: NoneKey, options: VerifyOptionscompletetrue): completeVerification[NoneKey] = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): Buffer = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrue): completeVerification[Key] = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys, options: VerifyOptions): Buffer = js.native
  def apply(jws: FlattenedJWS, key: NoneKey, options: VerifyOptionscompletetrue): completeVerification[NoneKey] = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): Buffer = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrue): completeVerification[Key] = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys, options: VerifyOptions): Buffer = js.native
  def apply(jws: GeneralJWS, key: NoneKey, options: VerifyOptionscompletetrue): completeVerification[NoneKey] = js.native
}
