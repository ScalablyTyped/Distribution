package typings.ionicCore

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/keyboard", JSImport.Namespace)
@js.native
object keyboardMod extends js.Object {
  val KEYBOARD_DID_CLOSE: /* "ionKeyboardDidHide" */ String = js.native
  val KEYBOARD_DID_OPEN: /* "ionKeyboardDidShow" */ String = js.native
  def copyLayoutViewport(win: Window): js.Any = js.native
  def copyVisualViewport(visualViewport: js.Any): js.Any = js.native
  def keyboardDidClose(win: Window): Boolean = js.native
  def keyboardDidOpen(): Boolean = js.native
  def keyboardDidResize(win: Window): Boolean = js.native
  def resetKeyboardAssist(): Unit = js.native
  def setKeyboardClose(win: Window): Unit = js.native
  def setKeyboardOpen(win: Window): Unit = js.native
  def setKeyboardOpen(win: Window, ev: js.Any): Unit = js.native
  def startKeyboardAssist(win: Window): Unit = js.native
  def trackViewportChanges(win: Window): Unit = js.native
}

