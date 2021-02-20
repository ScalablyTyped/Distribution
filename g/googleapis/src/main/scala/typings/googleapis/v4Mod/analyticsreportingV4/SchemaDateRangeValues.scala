package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to return a list of metrics for a single DateRange / dimension
  * combination
  */
@js.native
trait SchemaDateRangeValues extends StObject {
  
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
  implicit class SchemaDateRangeValuesMutableBuilder[Self <: SchemaDateRangeValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPivotValueRegions(value: js.Array[SchemaPivotValueRegion]): Self = StObject.set(x, "pivotValueRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotValueRegionsUndefined: Self = StObject.set(x, "pivotValueRegions", js.undefined)
    
    @scala.inline
    def setPivotValueRegionsVarargs(value: SchemaPivotValueRegion*): Self = StObject.set(x, "pivotValueRegions", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
