package typings
package juiDashGridLib.juiDashGridMod

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
  var index: scala.Double = js.native
  /** TD element of all rows belonging to a specified column */
  var list: js.Array[_] = js.native
  /**
       * Column name
       * @default null
       */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
       * Column sort state
       * @default "asc"
       */
  var order: juiDashGridLib.juiDashGridLibStrings.asc | juiDashGridLib.juiDashGridLibStrings.desc = js.native
  /**
       * The current column state
       * @default "show"
       */
  var `type`: juiDashGridLib.juiDashGridLibStrings.show | juiDashGridLib.juiDashGridLibStrings.hide | juiDashGridLib.juiDashGridLibStrings.resize = js.native
  /**
       * Column width
       * @default null
       */
  var width: js.UndefOr[scala.Double] = js.native
  def apply(index: java.lang.String): this.type = js.native
  def apply(index: scala.Double): this.type = js.native
  def hide(): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

