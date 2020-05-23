package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridResizingMethods extends js.Object {
  def changeGlobalLanguage(): Unit = js.native
  def changeGlobalRegional(): Unit = js.native
  def destroy(): Unit = js.native
  /**
    * Resizes a column to a specified width in pixels, percents or auto if no width is specified.
    *
    * @param column An identifier for the column. If a number is provided it will be used as a columnIndex else if a strings is provided it will be used as a columnKey.
    * @param width Width of the column in pixels or percents. If no width or "*" is specified the column will be auto-sized to the width of the data in it (including header and footer cells).
    */
  def resize(column: js.Object): Unit = js.native
  def resize(column: js.Object, width: js.Object): Unit = js.native
}

