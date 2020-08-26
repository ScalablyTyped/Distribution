package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryConfig extends js.Object {
  var dimensionFilters: js.UndefOr[js.Array[DimensionFilters]] = js.native
  var end: js.UndefOr[QueryDateTypes] = js.native
  var frequency: js.UndefOr[typings.itunesconnectanalytics.mod.frequency] = js.native
  var group: js.UndefOr[QueryGroup] = js.native
  var measures: js.UndefOr[
    typings.itunesconnectanalytics.mod.measures | js.Array[typings.itunesconnectanalytics.mod.measures]
  ] = js.native
  var start: js.UndefOr[QueryDateTypes] = js.native
}

object QueryConfig {
  @scala.inline
  def apply(): QueryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryConfig]
  }
  @scala.inline
  implicit class QueryConfigOps[Self <: QueryConfig] (val x: Self) extends AnyVal {
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
    def setDimensionFiltersVarargs(value: DimensionFilters*): Self = this.set("dimensionFilters", js.Array(value :_*))
    @scala.inline
    def setDimensionFilters(value: js.Array[DimensionFilters]): Self = this.set("dimensionFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionFilters: Self = this.set("dimensionFilters", js.undefined)
    @scala.inline
    def setEnd(value: QueryDateTypes): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFrequency(value: frequency): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    @scala.inline
    def setGroup(value: QueryGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setMeasuresVarargs(value: measures*): Self = this.set("measures", js.Array(value :_*))
    @scala.inline
    def setMeasures(value: measures | js.Array[measures]): Self = this.set("measures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasures: Self = this.set("measures", js.undefined)
    @scala.inline
    def setStart(value: QueryDateTypes): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

