package typings
package jointjsLib.jointjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "mvc")
@js.native
object mvcNs extends js.Object {
  @js.native
  class View[T /* <: backboneLib.backboneMod.Model */] ()
    extends backboneLib.backboneMod.View[T] {
    def this(opt: ViewOptions[T]) = this()
    var UPDATE_PRIORITY: scala.Double = js.native
    var childNodes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[stdLib.Element] | scala.Null] = js.native
    var children: js.UndefOr[jointjsLib.jointjsMod.diaNs.MarkupJSON] = js.native
    var defaultTheme: java.lang.String = js.native
    var documentEvents: js.UndefOr[backboneLib.backboneMod.EventsHash] = js.native
    var options: ViewOptions[T] = js.native
    var requireSetThemeOverride: scala.Boolean = js.native
    var theme: java.lang.String = js.native
    var themeClassNamePrefix: java.lang.String = js.native
    var vel: jointjsLib.jointjsMod.Vectorizer | scala.Null = js.native
    def confirmUpdate(flag: scala.Double, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Double = js.native
    def delegateDocumentEvents(): this.type = js.native
    def delegateDocumentEvents(events: backboneLib.backboneMod.EventsHash): this.type = js.native
    def delegateDocumentEvents(events: backboneLib.backboneMod.EventsHash, data: viewEventData): this.type = js.native
    def delegateElementEvents(element: stdLib.Element): this.type = js.native
    def delegateElementEvents(element: stdLib.Element, events: backboneLib.backboneMod.EventsHash): this.type = js.native
    def delegateElementEvents(element: stdLib.Element, events: backboneLib.backboneMod.EventsHash, data: viewEventData): this.type = js.native
    def eventData(evt: jqueryLib.JQueryNs.Event): viewEventData = js.native
    def eventData(evt: jqueryLib.JQueryNs.Event, data: viewEventData): this.type = js.native
    def findAttribute(attributeName: java.lang.String, node: stdLib.Element): java.lang.String | scala.Null = js.native
    def getEventNamespace(): java.lang.String = js.native
    /* protected */ def init(): scala.Unit = js.native
    def isPropagationStopped(evt: jqueryLib.JQueryNs.Event): scala.Boolean = js.native
    /* protected */ def onRemove(): scala.Unit = js.native
    /* protected */ def onRender(): scala.Unit = js.native
    /* protected */ def onSetTheme(oldTheme: java.lang.String, newTheme: java.lang.String): scala.Unit = js.native
    def renderChildren(): this.type = js.native
    def renderChildren(children: jointjsLib.jointjsMod.diaNs.MarkupJSON): this.type = js.native
    def setTheme(theme: java.lang.String): this.type = js.native
    def setTheme(theme: java.lang.String, opt: jointjsLib.Anon_Override): this.type = js.native
    def stopPropagation(evt: jqueryLib.JQueryNs.Event): this.type = js.native
    def undelegateDocumentEvents(): this.type = js.native
    def undelegateElementEvents(element: stdLib.Element): this.type = js.native
    def unmount(): scala.Unit = js.native
  }
  
  trait ViewOptions[T /* <: backboneLib.backboneMod.Model */]
    extends backboneLib.backboneMod.ViewOptions[T] {
    var theme: js.UndefOr[java.lang.String] = js.undefined
  }
  
  type viewEventData = org.scalablytyped.runtime.StringDictionary[js.Any]
}

