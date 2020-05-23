package typings.kendoUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends Element {
  var children: js.Any = js.native
  @JSName("options")
  var options_Group: GroupOptions = js.native
  def append(elements: Element*): Unit = js.native
  def clear(): Unit = js.native
  def insert(position: Double, element: Element): Unit = js.native
  def remove(element: Element): Unit = js.native
  def removeAt(index: Double): Unit = js.native
}

