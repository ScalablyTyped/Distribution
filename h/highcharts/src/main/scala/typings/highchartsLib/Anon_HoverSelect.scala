package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HoverSelect extends js.Object {
  var hover: js.UndefOr[highchartsLib.highchartsMod.HighchartsNs.MarkerHoverState] = js.undefined
  /**
    * The appearance of the point marker when selected. In order to allow a point to be selected, set the
    * series.allowPointSelect option to true.
    */
  var select: js.UndefOr[highchartsLib.highchartsMod.HighchartsNs.MarkerState] = js.undefined
}

object Anon_HoverSelect {
  @scala.inline
  def apply(
    hover: highchartsLib.highchartsMod.HighchartsNs.MarkerHoverState = null,
    select: highchartsLib.highchartsMod.HighchartsNs.MarkerState = null
  ): Anon_HoverSelect = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[Anon_HoverSelect]
  }
}

