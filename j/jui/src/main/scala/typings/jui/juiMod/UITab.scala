package typings.jui.juiMod

import typings.jui.Anon_Drag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UITab extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Anon_Drag): this.type = js.native
  /**
    * Gets the index of the currently enabled tab
    *
    */
  def activeIndex(): Double = js.native
  /**
    * Adds a tab to the last node
    *
    */
  def append(node: js.Object): Unit = js.native
  /**
    * Disables the tab at a specified index
    *
    */
  def disable(index: Double): Unit = js.native
  /**
    * Enables the tab at a specified index
    *
    */
  def enable(index: Double): Unit = js.native
  /**
    * Adds a tab at a specified index
    *
    */
  def insert(index: Double, node: js.Object): Unit = js.native
  /**
    * Changes a specified tab to a tab at a target index
    *
    */
  def move(index: Double, targetIndex: Double): Unit = js.native
  /**
    * Adds a tab to the first node
    *
    */
  def prepend(node: js.Object): Unit = js.native
  /**
    * Removes a tab at a specified index
    *
    */
  def remove(index: Double): Unit = js.native
  /**
    * Enables the tab at a specified index
    *
    */
  def show(index: Double): Unit = js.native
  /**
    * Changes the tab list
    *
    */
  def update(nodes: js.Array[_]): Unit = js.native
}

