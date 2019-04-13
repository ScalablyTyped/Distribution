package typings
package keyboardjsLib.keyboardjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Information and functions in the current callback.
	 */
@js.native
trait KeyEvent
  extends stdLib.KeyboardEvent {
  var pressedKeys: js.Array[java.lang.String] = js.native
  def preventRepeat(): scala.Unit = js.native
}

