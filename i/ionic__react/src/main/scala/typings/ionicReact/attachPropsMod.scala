package typings.ionicReact

import typings.std.DOMTokenList
import typings.std.Document_
import typings.std.Element
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/utils/attachProps", JSImport.Namespace)
@js.native
object attachPropsMod extends js.Object {
  def attachProps(node: HTMLElement, newProps: js.Any): Unit = js.native
  def attachProps(node: HTMLElement, newProps: js.Any, oldProps: js.Any): Unit = js.native
  def getClassName(classList: DOMTokenList, newProps: js.Any, oldProps: js.Any): String = js.native
  def isCoveredByReact(eventNameSuffix: String): Boolean = js.native
  def isCoveredByReact(eventNameSuffix: String, doc: Document_): Boolean = js.native
  def syncEvent(node: Element with AnonE, eventName: String): Unit = js.native
  def syncEvent(node: Element with AnonE, eventName: String, newEventHandler: js.Function1[/* e */ Event_, _]): Unit = js.native
}

