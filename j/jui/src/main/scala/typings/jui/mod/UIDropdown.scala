package typings.jui.mod

import typings.jui.anon.Close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDropdown extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Close): this.type = js.native
  def hide(): Unit = js.native
  /**
    * Moves a dropdown to the specified coordinates
    *
    */
  def move(x: Double, y: Double): Unit = js.native
  def reload(): Unit = js.native
  /**
    * Shows a dropdown at the specified coordinates
    *
    */
  def show(x: Double, y: Double): Unit = js.native
  /**
    * Changes the dropdown list
    *
    * @param nodes Dropdown list
    */
  def update(nodes: js.Array[_]): Unit = js.native
}

