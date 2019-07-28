package typings.gridstack.GridStackUINs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  /**
    * Sorts array of nodes
    *@param nodes array to sort
    *@param dir 1 for asc, -1 for desc (optional)
    *@param width width of the grid. If undefined the width will be calculated automatically (optional).
    **/
  def sort(nodes: js.Array[HTMLElement]): Unit = js.native
  def sort(nodes: js.Array[HTMLElement], dir: Double): Unit = js.native
  def sort(nodes: js.Array[HTMLElement], dir: Double, width: Double): Unit = js.native
}

