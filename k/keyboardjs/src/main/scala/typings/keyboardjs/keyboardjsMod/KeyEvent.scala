package typings.keyboardjs.keyboardjsMod

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Information and functions in the current callback.
	 */
@js.native
trait KeyEvent extends KeyboardEvent {
  var pressedKeys: js.Array[String] = js.native
  def preventRepeat(): Unit = js.native
}

