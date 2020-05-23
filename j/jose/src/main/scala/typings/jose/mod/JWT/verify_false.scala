package typings.jose.mod.JWT

import typings.jose.joseBooleans.`false`
import typings.jose.mod.ConsumeKeyInputWithNone
import typings.jose.mod.EmbeddedVerifyKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.verify")
@js.native
object verify_false extends js.Object {
  def apply(jwt: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys, options: VerifyOptions[`false`]): js.Object = js.native
}

