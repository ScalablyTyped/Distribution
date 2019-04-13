package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HoverSelect extends js.Object {
  var hover: js.UndefOr[highchartsLib.highchartsMod.MarkerHoverState] = js.undefined
  /**
    * The appearance of the point marker when selected. In order to allow a point to be selected, set the
    * series.allowPointSelect option to true.
    */
  var select: js.UndefOr[highchartsLib.highchartsMod.MarkerState] = js.undefined
}

object Anon_HoverSelect {
  @scala.inline
  def apply(
    hover: highchartsLib.highchartsMod.MarkerHoverState = null,
    select: highchartsLib.highchartsMod.MarkerState = null
  ): Anon_HoverSelect = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[Anon_HoverSelect]
  }
}

