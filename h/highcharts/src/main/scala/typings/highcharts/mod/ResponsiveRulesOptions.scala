package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveRulesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A full set of chart options to
    * apply as overrides to the general chart options. The chart options are
    * applied when the given rule is active.
    *
    * A special case is configuration objects that take arrays, for example
    * xAxis, yAxis or series. For these collections, an `id` option is used to
    * map the new option set to an existing object. If an existing object of
    * the same id is not found, the item of the same indexupdated. So for
    * example, setting `chartOptions` with two series items without an `id`,
    * will cause the existing chart's two series to be updated with respective
    * options.
    */
  var chartOptions: js.UndefOr[Options] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Under which conditions the rule
    * applies.
    */
  var condition: js.UndefOr[ResponsiveRulesConditionOptions] = js.undefined
}

object ResponsiveRulesOptions {
  @scala.inline
  def apply(chartOptions: Options = null, condition: ResponsiveRulesConditionOptions = null): ResponsiveRulesOptions = {
    val __obj = js.Dynamic.literal()
    if (chartOptions != null) __obj.updateDynamic("chartOptions")(chartOptions.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveRulesOptions]
  }
}

