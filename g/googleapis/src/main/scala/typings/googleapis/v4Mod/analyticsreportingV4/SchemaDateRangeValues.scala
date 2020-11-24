package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to return a list of metrics for a single DateRange / dimension
  * combination
  */
@js.native
trait SchemaDateRangeValues extends js.Object {
  
  /**
    * The values of each pivot region.
    */
  var pivotValueRegions: js.UndefOr[js.Array[SchemaPivotValueRegion]] = js.native
  
  /**
    * Each value corresponds to each Metric in the request.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object SchemaDateRangeValues {
  
  @scala.inline
  def apply(): SchemaDateRangeValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateRangeValues]
  }
  
  @scala.inline
  implicit class SchemaDateRangeValuesOps[Self <: SchemaDateRangeValues] (val x: Self) extends AnyVal {
    
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
    def setPivotValueRegionsVarargs(value: SchemaPivotValueRegion*): Self = this.set("pivotValueRegions", js.Array(value :_*))
    
    @scala.inline
    def setPivotValueRegions(value: js.Array[SchemaPivotValueRegion]): Self = this.set("pivotValueRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotValueRegions: Self = this.set("pivotValueRegions", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
