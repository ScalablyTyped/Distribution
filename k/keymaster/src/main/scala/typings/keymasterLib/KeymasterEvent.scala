package typings
package keymasterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeymasterEvent extends js.Object {
  var key: java.lang.String = js.native
  @JSName("method")
  var method_Original: KeyHandler = js.native
  var mods: js.Array[scala.Double] = js.native
  var scope: java.lang.String = js.native
  var shortcut: java.lang.String = js.native
  def method(keyboardEvent: stdLib.KeyboardEvent, keymasterEvent: KeymasterEvent): scala.Unit = js.native
}

