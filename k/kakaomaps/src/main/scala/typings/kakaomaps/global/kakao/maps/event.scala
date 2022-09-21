package typings.kakaomaps.global.kakao.maps

import typings.kakaomaps.kakao.maps.MouseEventListener
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object event {
  
  @JSGlobal("kakao.maps.event")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addListener(target: Any, `type`: String, handler: EventListener | MouseEventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def preventMap(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventMap")().asInstanceOf[Unit]
  
  inline def removeListener(target: Any, `type`: String, handler: EventListener | MouseEventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trigger(target: Any, `type`: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
