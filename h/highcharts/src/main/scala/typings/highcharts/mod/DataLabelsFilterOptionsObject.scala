package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLabelsFilterOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) The operator to compare by. Can be one of
    * `>`, `<`, `>=`, `<=`, `==`, and `===`.
    */
  var operator: js.UndefOr[OptionsOperatorValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The point property to filter by. Point
    * options are passed directly to properties, additionally there are `y`
    * value, `percentage` and others listed under Highcharts.Point members.
    */
  var property: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The value to compare against.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object DataLabelsFilterOptionsObject {
  @scala.inline
  def apply(
    operator: OptionsOperatorValue = null,
    property: String = null,
    value: js.UndefOr[Double] = js.undefined
  ): DataLabelsFilterOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLabelsFilterOptionsObject]
  }
}

