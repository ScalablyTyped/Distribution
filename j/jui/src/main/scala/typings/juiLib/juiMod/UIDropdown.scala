package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDropdown extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_EventLeft): this.type = js.native
  def hide(): scala.Unit = js.native
  /**
       * Moves a dropdown to the specified coordinates
       *
       */
  def move(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  /**
       * Shows a dropdown at the specified coordinates
       *
       */
  def show(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
       * Changes the dropdown list
       *
       * @param nodes Dropdown list
       */
  def update(nodes: js.Array[_]): scala.Unit = js.native
}

