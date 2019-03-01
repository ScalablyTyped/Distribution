package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of rules for responsive settings. The rules are executed from the top down.
  */
trait RulesOptions extends js.Object {
  /**
    * A full set of chart options to apply as overrides to the general chart options.
    * The chart options are applied when the given rule is active.
    *
    * A special case is configuration objects that take arrays, for example xAxis, yAxis or series.
    * For these collections, an id option is used to map the new option set to an existing object.
    * If an existing object of the same id is not found, the item of the same indexupdated.
    * So for example, setting chartOptions with two series items without an id, will cause the existing
    * chart's two series to be updated with respective options.
    * @since 5.0.0
    */
  var chartOptions: js.UndefOr[Options] = js.undefined
  /**
    * Under which conditions the rule applies.
    * @since 5.0.0
    */
  var condition: js.UndefOr[ConditionOptions] = js.undefined
}

object RulesOptions {
  @scala.inline
  def apply(chartOptions: Options = null, condition: ConditionOptions = null): RulesOptions = {
    val __obj = js.Dynamic.literal()
    if (chartOptions != null) __obj.updateDynamic("chartOptions")(chartOptions)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    __obj.asInstanceOf[RulesOptions]
  }
}

