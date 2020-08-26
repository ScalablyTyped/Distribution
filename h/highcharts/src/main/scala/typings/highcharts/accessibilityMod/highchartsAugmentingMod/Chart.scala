package typings.highcharts.accessibilityMod.highchartsAugmentingMod

import typings.highcharts.mod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart extends js.Object {
  /**
    * Dismiss popup content in chart, including export menu and tooltip.
    */
  def dismissPopupContent(): Unit = js.native
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
  def langFormat(langKey: String, context: Dictionary[_]): String = js.native
}

object Chart {
  @scala.inline
  def apply(dismissPopupContent: () => Unit, langFormat: (String, Dictionary[_]) => String): Chart = {
    val __obj = js.Dynamic.literal(dismissPopupContent = js.Any.fromFunction0(dismissPopupContent), langFormat = js.Any.fromFunction2(langFormat))
    __obj.asInstanceOf[Chart]
  }
  @scala.inline
  implicit class ChartOps[Self <: Chart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDismissPopupContent(value: () => Unit): Self = this.set("dismissPopupContent", js.Any.fromFunction0(value))
    @scala.inline
    def setLangFormat(value: (String, Dictionary[_]) => String): Self = this.set("langFormat", js.Any.fromFunction2(value))
  }
  
}

