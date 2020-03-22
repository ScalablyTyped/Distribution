package typings.highcharts.accessibilityMod.highchartsAugmentingMod

import typings.highcharts.mod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
  /**
    * Dismiss popup content in chart, including export menu and tooltip.
    */
  def dismissPopupContent(): Unit
  /**
    * Apply context to a format string from lang options of the chart.
    *
    * @param langKey
    *        Key (using dot notation) into lang option structure.
    *
    * @param context
    *        Context to apply to the format string.
    *
    * @return The formatted string.
    */
  def langFormat(langKey: String, context: Dictionary[_]): String
}

object Chart {
  @scala.inline
  def apply(dismissPopupContent: () => Unit, langFormat: (String, Dictionary[_]) => String): Chart = {
    val __obj = js.Dynamic.literal(dismissPopupContent = js.Any.fromFunction0(dismissPopupContent), langFormat = js.Any.fromFunction2(langFormat))
  
    __obj.asInstanceOf[Chart]
  }
}

