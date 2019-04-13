package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HoverBarStates extends js.Object {
  /**
    * Options for the hovered series
    */
  var hover: js.UndefOr[highchartsLib.highchartsMod.BarStates] = js.undefined
}

object Anon_HoverBarStates {
  @scala.inline
  def apply(hover: highchartsLib.highchartsMod.BarStates = null): Anon_HoverBarStates = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    __obj.asInstanceOf[Anon_HoverBarStates]
  }
}

