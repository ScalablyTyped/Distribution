package typings.juiDashGrid.juiDashGridMod

import typings.juiDashGrid.juiDashGridStrings.asc
import typings.juiDashGrid.juiDashGridStrings.desc
import typings.juiDashGrid.juiDashGridStrings.hide
import typings.juiDashGrid.juiDashGridStrings.resize
import typings.juiDashGrid.juiDashGridStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumn extends js.Object {
  /** Data from all rows belonging for a specified column */
  var data: js.Array[_] = js.native
  /**
    * TH element of a specified column
    * @default null
    */
  var element: js.Any = js.native
  /** Column index */
  var index: Double = js.native
  /** TD element of all rows belonging to a specified column */
  var list: js.Array[_] = js.native
  /**
    * Column name
    * @default null
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Column sort state
    * @default "asc"
    */
  var order: asc | desc = js.native
  /**
    * The current column state
    * @default "show"
    */
  var `type`: show | hide | resize = js.native
  /**
    * Column width
    * @default null
    */
  var width: js.UndefOr[Double] = js.native
  def apply(index: String): this.type = js.native
  def apply(index: Double): this.type = js.native
  def hide(): Unit = js.native
  def show(): Unit = js.native
}

