package typings.jose.mod.JWT

import typings.jose.mod.ConsumeKeyInputWithNone
import typings.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.verify")
@js.native
object verify extends js.Object {
  def apply(jwt: String, key: ConsumeKeyInputWithNone): js.Object = js.native
  def apply(jwt: String, key: NoneKey): completeResult[NoneKey] = js.native
}

