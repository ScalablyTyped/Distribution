package typings.ionicCore

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardMod {
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "KEYBOARD_DID_CLOSE")
  @js.native
  val KEYBOARD_DID_CLOSE: /* "ionKeyboardDidHide" */ String = js.native
  
  @JSImport("@ionic/core/dist/types/utils/keyboard/keyboard", "KEYBOARD_DID_OPEN")
  @js.native
  val KEYBOARD_DID_OPEN: /* "ionKeyboardDidShow" */ String = js.native
  
  inline def copyVisualViewport(visualViewport: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("copyVisualViewport")(visualViewport.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def keyboardDidClose(win: Window): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("keyboardDidClose")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keyboardDidOpen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("keyboardDidOpen")().asInstanceOf[Boolean]
  
  inline def keyboardDidResize(win: Window): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("keyboardDidResize")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resetKeyboardAssist(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetKeyboardAssist")().asInstanceOf[Unit]
  
  inline def setKeyboardClose(win: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setKeyboardClose")(win.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setKeyboardOpen(win: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setKeyboardOpen")(win.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setKeyboardOpen(win: Window, ev: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setKeyboardOpen")(win.asInstanceOf[js.Any], ev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def startKeyboardAssist(win: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startKeyboardAssist")(win.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def trackViewportChanges(win: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackViewportChanges")(win.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
