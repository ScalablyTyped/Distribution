package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UITab extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_EventTpl): this.type = js.native
  /**
       * Gets the index of the currently enabled tab
       *
       */
  def activeIndex(): scala.Double = js.native
  /**
       * Adds a tab to the last node
       *
       */
  def append(node: js.Object): scala.Unit = js.native
  /**
       * Disables the tab at a specified index
       *
       */
  def disable(index: scala.Double): scala.Unit = js.native
  /**
       * Enables the tab at a specified index
       *
       */
  def enable(index: scala.Double): scala.Unit = js.native
  /**
       * Adds a tab at a specified index
       *
       */
  def insert(index: scala.Double, node: js.Object): scala.Unit = js.native
  /**
       * Changes a specified tab to a tab at a target index
       *
       */
  def move(index: scala.Double, targetIndex: scala.Double): scala.Unit = js.native
  /**
       * Adds a tab to the first node
       *
       */
  def prepend(node: js.Object): scala.Unit = js.native
  /**
       * Removes a tab at a specified index
       *
       */
  def remove(index: scala.Double): scala.Unit = js.native
  /**
       * Enables the tab at a specified index
       *
       */
  def show(index: scala.Double): scala.Unit = js.native
  /**
       * Changes the tab list
       *
       */
  def update(nodes: js.Array[_]): scala.Unit = js.native
}

