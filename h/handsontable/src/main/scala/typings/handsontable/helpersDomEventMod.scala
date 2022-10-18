package typings.handsontable

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersDomEventMod {
  
  @JSImport("handsontable/helpers/dom/event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isImmediatePropagationStopped(event: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImmediatePropagationStopped")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLeftClick(event: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeftClick")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRightClick(event: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRightClick")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def stopImmediatePropagation(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopImmediatePropagation")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
