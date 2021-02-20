package typings.leaflet.mod

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.anon.TypeofDomEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DomEvent {
  
  @JSImport("leaflet", "DomEvent.addListener")
  @js.native
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  @JSImport("leaflet", "DomEvent.addListener")
  @js.native
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  @JSImport("leaflet", "DomEvent.addListener")
  @js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  @JSImport("leaflet", "DomEvent.addListener")
  @js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  
  @JSImport("leaflet", "DomEvent.disableClickPropagation")
  @js.native
  def disableClickPropagation(el: HTMLElement): TypeofDomEvent = js.native
  
  @JSImport("leaflet", "DomEvent.disableScrollPropagation")
  @js.native
  def disableScrollPropagation(el: HTMLElement): TypeofDomEvent = js.native
  
  @JSImport("leaflet", "DomEvent.getMousePosition")
  @js.native
  def getMousePosition(ev: MouseEvent): Point_ = js.native
  @JSImport("leaflet", "DomEvent.getMousePosition")
  @js.native
  def getMousePosition(ev: MouseEvent, container: HTMLElement): Point_ = js.native
  
  @JSImport("leaflet", "DomEvent.getWheelDelta")
  @js.native
  def getWheelDelta(ev: Event): Double = js.native
  
  @JSImport("leaflet", "DomEvent.off")
  @js.native
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  @JSImport("leaflet", "DomEvent.off")
  @js.native
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  @JSImport("leaflet", "DomEvent.off")
  @js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  @JSImport("leaflet", "DomEvent.off")
  @js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  
  @JSImport("leaflet", "DomEvent.on")
  @js.native
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  @JSImport("leaflet", "DomEvent.on")
  @js.native
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  @JSImport("leaflet", "DomEvent.on")
  @js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  @JSImport("leaflet", "DomEvent.on")
  @js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  
  @JSImport("leaflet", "DomEvent.preventDefault")
  @js.native
  def preventDefault(ev: Event): TypeofDomEvent = js.native
  
  @JSImport("leaflet", "DomEvent.removeListener")
  @js.native
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  @JSImport("leaflet", "DomEvent.removeListener")
  @js.native
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  @JSImport("leaflet", "DomEvent.removeListener")
  @js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  @JSImport("leaflet", "DomEvent.removeListener")
  @js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  
  @JSImport("leaflet", "DomEvent.stop")
  @js.native
  def stop(ev: PropagableEvent): TypeofDomEvent = js.native
  
  @JSImport("leaflet", "DomEvent.stopPropagation")
  @js.native
  def stopPropagation(ev: PropagableEvent): TypeofDomEvent = js.native
  
  type EventHandlerFn = js.Function1[/* event */ Event, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.leaflet.mod.LeafletMouseEvent
    - typings.leaflet.mod.LeafletKeyboardEvent
    - typings.leaflet.mod.LeafletEvent
    - typings.std.Event
  */
  type PropagableEvent = _PropagableEvent | Event
  
  trait _PropagableEvent extends StObject
  object _PropagableEvent {
    
    @scala.inline
    def LeafletEvent(layer: js.Any, propagatedFrom: js.Any, sourceTarget: js.Any, target: js.Any, `type`: String): typings.leaflet.mod.LeafletEvent = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.leaflet.mod.LeafletEvent]
    }
    
    @scala.inline
    def LeafletKeyboardEvent(
      layer: js.Any,
      originalEvent: KeyboardEvent,
      propagatedFrom: js.Any,
      sourceTarget: js.Any,
      target: js.Any,
      `type`: String
    ): typings.leaflet.mod.LeafletKeyboardEvent = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.leaflet.mod.LeafletKeyboardEvent]
    }
    
    @scala.inline
    def LeafletMouseEvent(
      containerPoint: Point_,
      latlng: LatLng_,
      layer: js.Any,
      layerPoint: Point_,
      originalEvent: MouseEvent,
      propagatedFrom: js.Any,
      sourceTarget: js.Any,
      target: js.Any,
      `type`: String
    ): typings.leaflet.mod.LeafletMouseEvent = {
      val __obj = js.Dynamic.literal(containerPoint = containerPoint.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], layerPoint = layerPoint.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.leaflet.mod.LeafletMouseEvent]
    }
  }
}
