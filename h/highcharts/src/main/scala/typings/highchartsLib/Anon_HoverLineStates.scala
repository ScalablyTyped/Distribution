package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HoverLineStates extends js.Object {
  /**
    * Options for the hovered series
    */
  var hover: js.UndefOr[highchartsLib.highchartsMod.HighchartsNs.LineStates] = js.undefined
}

object Anon_HoverLineStates {
  @scala.inline
  def apply(hover: highchartsLib.highchartsMod.HighchartsNs.LineStates = null): Anon_HoverLineStates = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    __obj.asInstanceOf[Anon_HoverLineStates]
  }
}

