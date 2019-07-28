package typings.jui.juiMod

import typings.jui.Anon_Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UICombo extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Anon_Bottom): this.type = js.native
  def fold(): Unit = js.native
  /**
    * Gets the data of the button currently selected
    *
    */
  def getData(): js.Object = js.native
  /**
    * Gets the markup text of the button currently selected
    *
    */
  def getText(): String = js.native
  /**
    * Gets the value of the button currently selected
    *
    */
  def getValue(): js.Any = js.native
  def open(e: js.Any): Unit = js.native
  def reload(): Unit = js.native
  /**
    * Selects a button of a specified index
    *
    */
  def setIndex(index: Double): Unit = js.native
  /**
    * Selects a button having a specified value
    *
    */
  def setValue(value: js.Any): Unit = js.native
}

