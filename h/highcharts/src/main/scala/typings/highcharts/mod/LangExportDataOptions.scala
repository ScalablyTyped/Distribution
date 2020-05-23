package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangExportDataOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The category column title when
    * axis type set to "datetime".
    */
  var categoryDatetimeHeader: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The category column title.
    */
  var categoryHeader: js.UndefOr[String] = js.undefined
}

object LangExportDataOptions {
  @scala.inline
  def apply(categoryDatetimeHeader: String = null, categoryHeader: String = null): LangExportDataOptions = {
    val __obj = js.Dynamic.literal()
    if (categoryDatetimeHeader != null) __obj.updateDynamic("categoryDatetimeHeader")(categoryDatetimeHeader.asInstanceOf[js.Any])
    if (categoryHeader != null) __obj.updateDynamic("categoryHeader")(categoryHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangExportDataOptions]
  }
}

