package typings.iron.ironMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iron", "generateKey")
@js.native
object generateKey extends js.Object {
  def apply(password: String, options: GenerateKeyOptions): js.Promise[Key] = js.native
}

