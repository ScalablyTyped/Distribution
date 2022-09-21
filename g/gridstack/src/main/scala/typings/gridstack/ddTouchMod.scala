package typings.gridstack

import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ddTouchMod {
  
  @JSImport("gridstack/dist/dd-touch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gridstack/dist/dd-touch", "isTouch")
  @js.native
  val isTouch: Boolean = js.native
  
  inline def pointerdown(e: PointerEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerdown")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def pointerenter(e: PointerEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerenter")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def pointerleave(e: PointerEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerleave")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def touchend(e: TouchEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("touchend")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def touchmove(e: TouchEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("touchmove")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def touchstart(e: TouchEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("touchstart")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
