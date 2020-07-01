package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryConfig extends js.Object {
  var dimensionFilters: js.UndefOr[js.Array[DimensionFilters]] = js.undefined
  var end: js.UndefOr[QueryDateTypes] = js.undefined
  var frequency: js.UndefOr[typings.itunesconnectanalytics.mod.frequency] = js.undefined
  var group: js.UndefOr[QueryGroup] = js.undefined
  var measures: js.UndefOr[
    typings.itunesconnectanalytics.mod.measures | js.Array[typings.itunesconnectanalytics.mod.measures]
  ] = js.undefined
  var start: js.UndefOr[QueryDateTypes] = js.undefined
}

object QueryConfig {
  @scala.inline
  def apply(
    dimensionFilters: js.Array[DimensionFilters] = null,
    end: QueryDateTypes = null,
    frequency: frequency = null,
    group: QueryGroup = null,
    measures: measures | js.Array[measures] = null,
    start: QueryDateTypes = null
  ): QueryConfig = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryConfig]
  }
}

