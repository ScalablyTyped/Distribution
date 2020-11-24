package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents fields that are compatible to be selected for a report of type
  * &quot;STANDARD&quot;.
  */
@js.native
trait SchemaReportCompatibleFields extends js.Object {
  
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;dimensionFilters&quot; section of the report.
    */
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimension]] = js.native
  
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;dimensions&quot; section of the report.
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.native
  
  /**
    * The kind of resource this is, in this case
    * dfareporting#reportCompatibleFields.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Metrics which are compatible to be selected in the
    * &quot;metricNames&quot; section of the report.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
  
  /**
    * Metrics which are compatible to be selected as activity metrics to pivot
    * on in the &quot;activities&quot; section of the report.
    */
  var pivotedActivityMetrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
}
object SchemaReportCompatibleFields {
  
  @scala.inline
  def apply(): SchemaReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportCompatibleFields]
  }
  
  @scala.inline
  implicit class SchemaReportCompatibleFieldsOps[Self <: SchemaReportCompatibleFields] (val x: Self) extends AnyVal {
    
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
    def setDimensionFiltersVarargs(value: SchemaDimension*): Self = this.set("dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setDimensionFilters(value: js.Array[SchemaDimension]): Self = this.set("dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionFilters: Self = this.set("dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: SchemaDimension*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[SchemaDimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
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
    def setPivotedActivityMetricsVarargs(value: SchemaMetric*): Self = this.set("pivotedActivityMetrics", js.Array(value :_*))
    
    @scala.inline
    def setPivotedActivityMetrics(value: js.Array[SchemaMetric]): Self = this.set("pivotedActivityMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotedActivityMetrics: Self = this.set("pivotedActivityMetrics", js.undefined)
  }
}
