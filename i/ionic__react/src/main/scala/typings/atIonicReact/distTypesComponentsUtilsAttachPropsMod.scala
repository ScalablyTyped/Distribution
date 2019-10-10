package typings.atIonicReact

import typings.std.DOMTokenList
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/utils/attachProps", JSImport.Namespace)
@js.native
object distTypesComponentsUtilsAttachPropsMod extends js.Object {
  def attachProps(node: HTMLElement, newProps: js.Any): Unit = js.native
  def attachProps(node: HTMLElement, newProps: js.Any, oldProps: js.Any): Unit = js.native
  def getClassName(classList: DOMTokenList, newProps: js.Any, oldProps: js.Any): String = js.native
  def isCoveredByReact(eventNameSuffix: String): Boolean = js.native
  def isCoveredByReact(eventNameSuffix: String, doc: Document): Boolean = js.native
  def syncEvent(node: Element with Anon_E, eventName: String): Unit = js.native
  def syncEvent(node: Element with Anon_E, eventName: String, newEventHandler: js.Function1[/* e */ Event, _]): Unit = js.native
}

