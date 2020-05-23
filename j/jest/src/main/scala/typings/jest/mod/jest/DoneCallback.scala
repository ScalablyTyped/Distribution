package typings.jest.mod.jest

import typings.jest.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoneCallback extends js.Object {
  def apply(args: js.Any*): js.Any = js.native
  def fail(): js.Any = js.native
  def fail(error: String): js.Any = js.native
  def fail(error: Message): js.Any = js.native
}

