package typings.atIonicReact

import typings.std.DOMTokenList
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/utils/attachEventProps", JSImport.Namespace)
@js.native
object distTypesComponentsUtilsAttachEventPropsMod extends js.Object {
  def attachEventProps(node: HTMLElement, newProps: js.Any): Unit = js.native
  def attachEventProps(node: HTMLElement, newProps: js.Any, oldProps: js.Any): Unit = js.native
  def getClassName(classList: DOMTokenList, newProps: js.Any, oldProps: js.Any): String = js.native
  def isCoveredByReact(eventNameSuffix: String): Boolean = js.native
  def isCoveredByReact(eventNameSuffix: String, doc: Document): Boolean = js.native
  def syncEvent(node: Element, eventName: String, newEventHandler: js.Function1[/* e */ Event, _]): Unit = js.native
}

