package typings.interactjsTypes

import typings.interactjsTypes.anon.Windowwrapargsanyanyundef
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowMod {
  
  @JSImport("@interactjs/utils/window", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWindow(node: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def init(window: Windowwrapargsanyanyundef): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@interactjs/utils/window", "realWindow")
  @js.native
  def realWindow: Window = js.native
  inline def realWindow_=(x: Window): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("realWindow")(x.asInstanceOf[js.Any])
  
  @JSImport("@interactjs/utils/window", "window")
  @js.native
  def window: Window = js.native
  inline def window_=(x: Window): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("window")(x.asInstanceOf[js.Any])
}
