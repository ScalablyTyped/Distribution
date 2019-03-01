package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HoverPieStates extends js.Object {
  /**
    * Options for the hovered series
    */
  var hover: js.UndefOr[highchartsLib.highchartsMod.HighchartsNs.PieStates] = js.undefined
}

object Anon_HoverPieStates {
  @scala.inline
  def apply(hover: highchartsLib.highchartsMod.HighchartsNs.PieStates = null): Anon_HoverPieStates = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    __obj.asInstanceOf[Anon_HoverPieStates]
  }
}

