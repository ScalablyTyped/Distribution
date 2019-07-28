package typings.leaflet

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.leafletMod.DomEventNs.EventHandlerFn
import typings.leaflet.leafletMod.Point
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDomEvent extends js.Object {
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def disableClickPropagation(el: HTMLElement): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def disableScrollPropagation(el: HTMLElement): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def getMousePosition(ev: MouseEvent): Point = js.native
  def getMousePosition(ev: MouseEvent, container: HTMLElement): Point = js.native
  def getWheelDelta(ev: Event): Double = js.native
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def preventDefault(ev: Event): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def stop(ev: Event): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def stopPropagation(ev: Event): /* import warning: ImportType.apply Failed type conversion: typeof DomEvent */ js.Any = js.native
}

