package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A set of rules for responsive
    * settings. The rules are executed from the top down.
    */
  var rules: js.UndefOr[js.Array[ResponsiveRulesOptions]] = js.undefined
}

object ResponsiveOptions {
  @scala.inline
  def apply(rules: js.Array[ResponsiveRulesOptions] = null): ResponsiveOptions = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveOptions]
  }
}

