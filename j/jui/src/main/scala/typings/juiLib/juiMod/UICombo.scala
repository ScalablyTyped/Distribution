package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UICombo extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_Flex): this.type = js.native
  def fold(): scala.Unit = js.native
  /**
       * Gets the data of the button currently selected
       *
       */
  def getData(): js.Object = js.native
  /**
       * Gets the markup text of the button currently selected
       *
       */
  def getText(): java.lang.String = js.native
  /**
       * Gets the value of the button currently selected
       *
       */
  def getValue(): js.Any = js.native
  def open(e: js.Any): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  /**
       * Selects a button of a specified index
       *
       */
  def setIndex(index: scala.Double): scala.Unit = js.native
  /**
       * Selects a button having a specified value
       *
       */
  def setValue(value: js.Any): scala.Unit = js.native
}

