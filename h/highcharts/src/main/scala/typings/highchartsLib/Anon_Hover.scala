package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hover extends js.Object {
  /**
    * Attributes and styles applied when hovering.
    */
  var hover: js.UndefOr[highchartsLib.highchartsMod.ButtonTheme] = js.undefined
  /**
    * Attributes and styles applied when button is selected (tri-state).
    */
  var select: js.UndefOr[highchartsLib.highchartsMod.ButtonTheme] = js.undefined
}

object Anon_Hover {
  @scala.inline
  def apply(
    hover: highchartsLib.highchartsMod.ButtonTheme = null,
    select: highchartsLib.highchartsMod.ButtonTheme = null
  ): Anon_Hover = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[Anon_Hover]
  }
}

