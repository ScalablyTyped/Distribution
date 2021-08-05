package typings.materialUiCore

import typings.materialUiCore.anon.FocusVisibleCheckTime
import typings.std.Element
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusVisibleMod {
  
  @JSImport("@material-ui/core/ButtonBase/focusVisible", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectFocusVisible(instance: FocusVisibleCheckTime, element: Element, cb: js.Function0[Unit], attempt: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectFocusVisible")(instance.asInstanceOf[js.Any], element.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], attempt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def focusKeyPressed(pressed: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusKeyPressed")(pressed.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def listenForFocusKeys(window: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("listenForFocusKeys")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
