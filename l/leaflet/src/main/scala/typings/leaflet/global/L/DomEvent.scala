package typings.leaflet.global.L

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.anon.TypeofDomEvent
import typings.leaflet.mod.DomEvent.EventHandlerFn
import typings.leaflet.mod.DomEvent.PropagableEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DomEvent {
  
  @JSGlobal("L.DomEvent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventMap.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  inline def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: Any): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], eventMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  inline def addListener(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], types.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  inline def addListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: Any): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(el.asInstanceOf[js.Any], types.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  
  inline def disableClickPropagation(el: HTMLElement): TypeofDomEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("disableClickPropagation")(el.asInstanceOf[js.Any]).asInstanceOf[TypeofDomEvent]
  
  inline def disableScrollPropagation(el: HTMLElement): TypeofDomEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("disableScrollPropagation")(el.asInstanceOf[js.Any]).asInstanceOf[TypeofDomEvent]
  
  inline def getMousePosition(ev: MouseEvent): typings.leaflet.mod.Point_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getMousePosition")(ev.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Point_]
  inline def getMousePosition(ev: MouseEvent, container: HTMLElement): typings.leaflet.mod.Point_ = (^.asInstanceOf[js.Dynamic].applyDynamic("getMousePosition")(ev.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Point_]
  
  inline def getPropagationPath(ev: Event): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropagationPath")(ev.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  
  inline def getWheelDelta(ev: Event): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWheelDelta")(ev.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  // tslint:disable:unified-signatures
  inline def off(el: HTMLElement): TypeofDomEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(el.asInstanceOf[js.Any]).asInstanceOf[TypeofDomEvent]
  inline def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(el.asInstanceOf[js.Any], eventMap.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  inline def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: Any): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(el.asInstanceOf[js.Any], eventMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  inline def off(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(el.asInstanceOf[js.Any], types.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  inline def off(el: HTMLElement, types: String, fn: EventHandlerFn, context: Any): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(el.asInstanceOf[js.Any], types.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  
  inline def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventMap.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  inline def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: Any): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], eventMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  inline def on(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], types.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  inline def on(el: HTMLElement, types: String, fn: EventHandlerFn, context: Any): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(el.asInstanceOf[js.Any], types.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  
  inline def preventDefault(ev: Event): TypeofDomEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")(ev.asInstanceOf[js.Any]).asInstanceOf[TypeofDomEvent]
  
  inline def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventMap.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  inline def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: Any): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], eventMap.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  inline def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], types.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  inline def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: Any): TypeofDomEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(el.asInstanceOf[js.Any], types.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[TypeofDomEvent]
  
  inline def stop(ev: PropagableEvent): TypeofDomEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(ev.asInstanceOf[js.Any]).asInstanceOf[TypeofDomEvent]
  
  // tslint:enable:unified-signatures
  inline def stopPropagation(ev: PropagableEvent): TypeofDomEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagation")(ev.asInstanceOf[js.Any]).asInstanceOf[TypeofDomEvent]
}
