package typings.materialDom

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dom/keyboard", JSImport.Namespace)
@js.native
object keyboardMod extends js.Object {
  def isNavigationEvent(evt: KeyboardEvent): Boolean = js.native
  def normalizeKey(evt: KeyboardEvent): String = js.native
  @js.native
  object KEY extends js.Object {
    var ARROW_DOWN: String = js.native
    var ARROW_LEFT: String = js.native
    var ARROW_RIGHT: String = js.native
    var ARROW_UP: String = js.native
    var BACKSPACE: String = js.native
    var DELETE: String = js.native
    var END: String = js.native
    var ENTER: String = js.native
    var ESCAPE: String = js.native
    var HOME: String = js.native
    var PAGE_DOWN: String = js.native
    var PAGE_UP: String = js.native
    var SPACEBAR: String = js.native
    var UNKNOWN: String = js.native
  }
  
}

