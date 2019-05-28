package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "DomEvent")
@js.native
object DomEventNs extends js.Object {
  def addListener(el: stdLib.HTMLElement, eventMap: org.scalablytyped.runtime.StringDictionary[EventHandlerFn]): leafletLib.TypeofDomEvent = js.native
  def addListener(
    el: stdLib.HTMLElement,
    eventMap: org.scalablytyped.runtime.StringDictionary[EventHandlerFn],
    context: js.Any
  ): leafletLib.TypeofDomEvent = js.native
  def addListener(el: stdLib.HTMLElement, types: java.lang.String, fn: EventHandlerFn): leafletLib.TypeofDomEvent = js.native
  def addListener(el: stdLib.HTMLElement, types: java.lang.String, fn: EventHandlerFn, context: js.Any): leafletLib.TypeofDomEvent = js.native
  def disableClickPropagation(el: stdLib.HTMLElement): leafletLib.TypeofDomEvent = js.native
  def disableScrollPropagation(el: stdLib.HTMLElement): leafletLib.TypeofDomEvent = js.native
  def getMousePosition(ev: stdLib.MouseEvent): leafletLib.leafletMod.Point = js.native
  def getMousePosition(ev: stdLib.MouseEvent, container: stdLib.HTMLElement): leafletLib.leafletMod.Point = js.native
  def getWheelDelta(ev: stdLib.Event): scala.Double = js.native
  def off(el: stdLib.HTMLElement, eventMap: org.scalablytyped.runtime.StringDictionary[EventHandlerFn]): leafletLib.TypeofDomEvent = js.native
  def off(
    el: stdLib.HTMLElement,
    eventMap: org.scalablytyped.runtime.StringDictionary[EventHandlerFn],
    context: js.Any
  ): leafletLib.TypeofDomEvent = js.native
  def off(el: stdLib.HTMLElement, types: java.lang.String, fn: EventHandlerFn): leafletLib.TypeofDomEvent = js.native
  def off(el: stdLib.HTMLElement, types: java.lang.String, fn: EventHandlerFn, context: js.Any): leafletLib.TypeofDomEvent = js.native
  def on(el: stdLib.HTMLElement, eventMap: org.scalablytyped.runtime.StringDictionary[EventHandlerFn]): leafletLib.TypeofDomEvent = js.native
  def on(
    el: stdLib.HTMLElement,
    eventMap: org.scalablytyped.runtime.StringDictionary[EventHandlerFn],
    context: js.Any
  ): leafletLib.TypeofDomEvent = js.native
  def on(el: stdLib.HTMLElement, types: java.lang.String, fn: EventHandlerFn): leafletLib.TypeofDomEvent = js.native
  def on(el: stdLib.HTMLElement, types: java.lang.String, fn: EventHandlerFn, context: js.Any): leafletLib.TypeofDomEvent = js.native
  def preventDefault(ev: stdLib.Event): leafletLib.TypeofDomEvent = js.native
  def removeListener(el: stdLib.HTMLElement, eventMap: org.scalablytyped.runtime.StringDictionary[EventHandlerFn]): leafletLib.TypeofDomEvent = js.native
  def removeListener(
    el: stdLib.HTMLElement,
    eventMap: org.scalablytyped.runtime.StringDictionary[EventHandlerFn],
    context: js.Any
  ): leafletLib.TypeofDomEvent = js.native
  def removeListener(el: stdLib.HTMLElement, types: java.lang.String, fn: EventHandlerFn): leafletLib.TypeofDomEvent = js.native
  def removeListener(el: stdLib.HTMLElement, types: java.lang.String, fn: EventHandlerFn, context: js.Any): leafletLib.TypeofDomEvent = js.native
  def stop(ev: stdLib.Event): leafletLib.TypeofDomEvent = js.native
  def stopPropagation(ev: stdLib.Event): leafletLib.TypeofDomEvent = js.native
  type EventHandlerFn = js.Function1[/* event */ stdLib.Event, scala.Unit]
}

