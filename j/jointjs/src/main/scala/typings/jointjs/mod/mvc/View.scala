package typings.jointjs.mod.mvc

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.EventsHash
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.jointjs.anon.Override
import typings.jointjs.mod.Vectorizer
import typings.jointjs.mod.dia.Event
import typings.jointjs.mod.dia.MarkupJSON
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "mvc.View")
@js.native
class View[T /* <: Model[_, ModelSetOptions, js.Object] */] ()
  extends typings.backbone.mod.View[T] {
  def this(opt: ViewOptions[T]) = this()
  
  var DETACHABLE: Boolean = js.native
  
  var FLAG_INSERT: Double = js.native
  
  var FLAG_REMOVE: Double = js.native
  
  var UPDATE_PRIORITY: Double = js.native
  
  var childNodes: js.UndefOr[StringDictionary[Element] | Null] = js.native
  
  var children: js.UndefOr[MarkupJSON] = js.native
  
  def confirmUpdate(flag: Double, opt: StringDictionary[js.Any]): Double = js.native
  
  var defaultTheme: String = js.native
  
  def delegateDocumentEvents(): this.type = js.native
  def delegateDocumentEvents(events: js.UndefOr[scala.Nothing], data: viewEventData): this.type = js.native
  def delegateDocumentEvents(events: EventsHash): this.type = js.native
  def delegateDocumentEvents(events: EventsHash, data: viewEventData): this.type = js.native
  
  def delegateElementEvents(element: Element): this.type = js.native
  def delegateElementEvents(element: Element, events: js.UndefOr[scala.Nothing], data: viewEventData): this.type = js.native
  def delegateElementEvents(element: Element, events: EventsHash): this.type = js.native
  def delegateElementEvents(element: Element, events: EventsHash, data: viewEventData): this.type = js.native
  
  var documentEvents: js.UndefOr[EventsHash] = js.native
  
  def eventData(evt: Event): viewEventData = js.native
  def eventData(evt: Event, data: viewEventData): this.type = js.native
  
  def findAttribute(attributeName: String, node: Element): String | Null = js.native
  
  def getEventNamespace(): String = js.native
  
  /* protected */ def init(): Unit = js.native
  
  def isPropagationStopped(evt: Event): Boolean = js.native
  
  /* protected */ def onRemove(): Unit = js.native
  
  /* protected */ def onRender(): Unit = js.native
  
  /* protected */ def onSetTheme(oldTheme: String, newTheme: String): Unit = js.native
  
  var options: ViewOptions[T] = js.native
  
  def renderChildren(): this.type = js.native
  def renderChildren(children: MarkupJSON): this.type = js.native
  
  var requireSetThemeOverride: Boolean = js.native
  
  def setTheme(theme: String): this.type = js.native
  def setTheme(theme: String, opt: Override): this.type = js.native
  
  def stopPropagation(evt: Event): this.type = js.native
  
  var theme: String = js.native
  
  var themeClassNamePrefix: String = js.native
  
  def undelegateDocumentEvents(): this.type = js.native
  
  def undelegateElementEvents(element: Element): this.type = js.native
  
  def unmount(): Unit = js.native
  
  var vel: Vectorizer | Null = js.native
}
