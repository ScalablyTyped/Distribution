package typings.highcharts.modulesAccessibilityMod.highchartsMod

import typings.highcharts.highchartsMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
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
  def apply(langFormat: (String, Dictionary[_]) => String): Chart = {
    val __obj = js.Dynamic.literal(langFormat = js.Any.fromFunction2(langFormat))
  
    __obj.asInstanceOf[Chart]
  }
}

