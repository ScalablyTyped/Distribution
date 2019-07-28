package typings.jointjs.jointjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.backboneMod.EventsHash
import typings.backbone.backboneMod.Model
import typings.jointjs.Anon_Override
import typings.jointjs.jointjsMod.diaNs.MarkupJSON
import typings.jointjs.jointjsMod.mvcNs.ViewOptions
import typings.jointjs.jointjsMod.mvcNs.viewEventData
import typings.jquery.JQueryNs.Event
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "mvc")
@js.native
object mvcNs extends js.Object {
  @js.native
  class View[T /* <: Model */] ()
    extends typings.backbone.backboneMod.View[T] {
    def this(opt: ViewOptions[T]) = this()
    var UPDATE_PRIORITY: Double = js.native
    var childNodes: js.UndefOr[StringDictionary[Element] | Null] = js.native
    var children: js.UndefOr[MarkupJSON] = js.native
    var defaultTheme: String = js.native
    var documentEvents: js.UndefOr[EventsHash] = js.native
    var options: ViewOptions[T] = js.native
    var requireSetThemeOverride: Boolean = js.native
    var theme: String = js.native
    var themeClassNamePrefix: String = js.native
    var vel: Vectorizer | Null = js.native
    def confirmUpdate(flag: Double, opt: StringDictionary[js.Any]): Double = js.native
    def delegateDocumentEvents(): this.type = js.native
    def delegateDocumentEvents(events: EventsHash): this.type = js.native
    def delegateDocumentEvents(events: EventsHash, data: viewEventData): this.type = js.native
    def delegateElementEvents(element: Element): this.type = js.native
    def delegateElementEvents(element: Element, events: EventsHash): this.type = js.native
    def delegateElementEvents(element: Element, events: EventsHash, data: viewEventData): this.type = js.native
    def eventData(evt: Event): viewEventData = js.native
    def eventData(evt: Event, data: viewEventData): this.type = js.native
    def findAttribute(attributeName: String, node: Element): String | Null = js.native
    def getEventNamespace(): String = js.native
    /* protected */ def init(): Unit = js.native
    def isPropagationStopped(evt: Event): Boolean = js.native
    /* protected */ def onRemove(): Unit = js.native
    /* protected */ def onRender(): Unit = js.native
    /* protected */ def onSetTheme(oldTheme: String, newTheme: String): Unit = js.native
    def renderChildren(): this.type = js.native
    def renderChildren(children: MarkupJSON): this.type = js.native
    def setTheme(theme: String): this.type = js.native
    def setTheme(theme: String, opt: Anon_Override): this.type = js.native
    def stopPropagation(evt: Event): this.type = js.native
    def undelegateDocumentEvents(): this.type = js.native
    def undelegateElementEvents(element: Element): this.type = js.native
    def unmount(): Unit = js.native
  }
  
  trait ViewOptions[T /* <: Model */]
    extends typings.backbone.backboneMod.ViewOptions[T] {
    var theme: js.UndefOr[String] = js.undefined
  }
  
  type viewEventData = StringDictionary[js.Any]
}

