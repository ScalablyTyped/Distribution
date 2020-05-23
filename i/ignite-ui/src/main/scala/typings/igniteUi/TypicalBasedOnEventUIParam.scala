package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypicalBasedOnEventUIParam extends js.Object {
  /**
    * Used to specify which columns changing will invalidate the series and cause it to be recalculated.
    */
  var basedOn: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to get the number of positions that should be calculated from the start.
    */
  var count: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to get the data to use for the calculation.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to get the beginning position that should be calculated from.
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to get the supporting calculations to use in the calculation.
    */
  var supportingCalculations: js.UndefOr[js.Any] = js.undefined
}

object TypicalBasedOnEventUIParam {
  @scala.inline
  def apply(
    basedOn: js.Any = null,
    chart: js.Any = null,
    count: js.Any = null,
    dataSource: js.Any = null,
    position: js.Any = null,
    series: js.Any = null,
    supportingCalculations: js.Any = null
  ): TypicalBasedOnEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (supportingCalculations != null) __obj.updateDynamic("supportingCalculations")(supportingCalculations.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypicalBasedOnEventUIParam]
  }
}

