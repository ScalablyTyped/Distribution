package typings.keymaster

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeymasterEvent extends js.Object {
  var key: String = js.native
  @JSName("method")
  var method_Original: KeyHandler = js.native
  var mods: js.Array[Double] = js.native
  var scope: String = js.native
  var shortcut: String = js.native
  def method(keyboardEvent: KeyboardEvent, keymasterEvent: KeymasterEvent): Unit = js.native
}

