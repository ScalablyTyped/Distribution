package typings.iron.ironMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iron", "decrypt")
@js.native
object decrypt extends js.Object {
  def apply(password: String, options: GenerateKeyOptions, data: String): js.Promise[Buffer] = js.native
}

