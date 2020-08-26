package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents fields that are compatible to be selected for a report of type
  * &quot;CROSS_DIMENSION_REACH&quot;.
  */
@js.native
trait SchemaCrossDimensionReachReportCompatibleFields extends js.Object {
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;breakdown&quot; section of the report.
    */
  var breakdown: js.UndefOr[js.Array[SchemaDimension]] = js.native
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;dimensionFilters&quot; section of the report.
    */
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimension]] = js.native
  /**
    * The kind of resource this is, in this case
    * dfareporting#crossDimensionReachReportCompatibleFields.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metrics which are compatible to be selected in the
    * &quot;metricNames&quot; section of the report.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
  /**
    * Metrics which are compatible to be selected in the
    * &quot;overlapMetricNames&quot; section of the report.
    */
  var overlapMetrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
}

object SchemaCrossDimensionReachReportCompatibleFields {
  @scala.inline
  def apply(): SchemaCrossDimensionReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCrossDimensionReachReportCompatibleFields]
  }
  @scala.inline
  implicit class SchemaCrossDimensionReachReportCompatibleFieldsOps[Self <: SchemaCrossDimensionReachReportCompatibleFields] (val x: Self) extends AnyVal {
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
    def setBreakdownVarargs(value: SchemaDimension*): Self = this.set("breakdown", js.Array(value :_*))
    @scala.inline
    def setBreakdown(value: js.Array[SchemaDimension]): Self = this.set("breakdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakdown: Self = this.set("breakdown", js.undefined)
    @scala.inline
    def setDimensionFiltersVarargs(value: SchemaDimension*): Self = this.set("dimensionFilters", js.Array(value :_*))
    @scala.inline
    def setDimensionFilters(value: js.Array[SchemaDimension]): Self = this.set("dimensionFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionFilters: Self = this.set("dimensionFilters", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetricsVarargs(value: SchemaMetric*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[SchemaMetric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setOverlapMetricsVarargs(value: SchemaMetric*): Self = this.set("overlapMetrics", js.Array(value :_*))
    @scala.inline
    def setOverlapMetrics(value: js.Array[SchemaMetric]): Self = this.set("overlapMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlapMetrics: Self = this.set("overlapMetrics", js.undefined)
  }
  
}

