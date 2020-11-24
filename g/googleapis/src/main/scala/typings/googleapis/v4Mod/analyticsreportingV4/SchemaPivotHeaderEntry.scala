package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The headers for the each of the metric column corresponding to the metrics
  * requested in the pivots section of the response.
  */
@js.native
trait SchemaPivotHeaderEntry extends js.Object {
  
  /**
    * The name of the dimensions in the pivot response.
    */
  var dimensionNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The values for the dimensions in the pivot.
    */
  var dimensionValues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The metric header for the metric in the pivot.
    */
  var metric: js.UndefOr[SchemaMetricHeaderEntry] = js.native
}
object SchemaPivotHeaderEntry {
  
  @scala.inline
  def apply(): SchemaPivotHeaderEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotHeaderEntry]
  }
  
  @scala.inline
  implicit class SchemaPivotHeaderEntryOps[Self <: SchemaPivotHeaderEntry] (val x: Self) extends AnyVal {
    
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
    def setDimensionNamesVarargs(value: String*): Self = this.set("dimensionNames", js.Array(value :_*))
    
    @scala.inline
    def setDimensionNames(value: js.Array[String]): Self = this.set("dimensionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionNames: Self = this.set("dimensionNames", js.undefined)
    
    @scala.inline
    def setDimensionValuesVarargs(value: String*): Self = this.set("dimensionValues", js.Array(value :_*))
    
    @scala.inline
    def setDimensionValues(value: js.Array[String]): Self = this.set("dimensionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionValues: Self = this.set("dimensionValues", js.undefined)
    
    @scala.inline
    def setMetric(value: SchemaMetricHeaderEntry): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
  }
}
