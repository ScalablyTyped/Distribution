package typings.ionicCore

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardMod {
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "KEYBOARD_DID_CLOSE")
  @js.native
  val KEYBOARD_DID_CLOSE: /* "ionKeyboardDidHide" */ String = js.native
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "KEYBOARD_DID_OPEN")
  @js.native
  val KEYBOARD_DID_OPEN: /* "ionKeyboardDidShow" */ String = js.native
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "copyVisualViewport")
  @js.native
  def copyVisualViewport(visualViewport: js.Any): js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "keyboardDidClose")
  @js.native
  def keyboardDidClose(win: Window): Boolean = js.native
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "keyboardDidOpen")
  @js.native
  def keyboardDidOpen(): Boolean = js.native
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "keyboardDidResize")
  @js.native
  def keyboardDidResize(win: Window): Boolean = js.native
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "resetKeyboardAssist")
  @js.native
  def resetKeyboardAssist(): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "setKeyboardClose")
  @js.native
  def setKeyboardClose(win: Window): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "setKeyboardOpen")
  @js.native
  def setKeyboardOpen(win: Window): Unit = js.native
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "setKeyboardOpen")
  @js.native
  def setKeyboardOpen(win: Window, ev: js.Any): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "startKeyboardAssist")
  @js.native
  def startKeyboardAssist(win: Window): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "trackViewportChanges")
  @js.native
  def trackViewportChanges(win: Window): Unit = js.native
}
