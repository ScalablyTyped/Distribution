package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The headers for the each of the metric column corresponding to the metrics
  * requested in the pivots section of the response.
  */
trait SchemaPivotHeaderEntry extends StObject {
  
  /**
    * The name of the dimensions in the pivot response.
    */
  var dimensionNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The values for the dimensions in the pivot.
    */
  var dimensionValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The metric header for the metric in the pivot.
    */
  var metric: js.UndefOr[SchemaMetricHeaderEntry] = js.undefined
}
object SchemaPivotHeaderEntry {
  
  @scala.inline
  def apply(): SchemaPivotHeaderEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotHeaderEntry]
  }
  
  @scala.inline
  implicit class SchemaPivotHeaderEntryMutableBuilder[Self <: SchemaPivotHeaderEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionNames(value: js.Array[String]): Self = StObject.set(x, "dimensionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionNamesUndefined: Self = StObject.set(x, "dimensionNames", js.undefined)
    
    @scala.inline
    def setDimensionNamesVarargs(value: String*): Self = StObject.set(x, "dimensionNames", js.Array(value :_*))
    
    @scala.inline
    def setDimensionValues(value: js.Array[String]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    @scala.inline
    def setDimensionValuesVarargs(value: String*): Self = StObject.set(x, "dimensionValues", js.Array(value :_*))
    
    @scala.inline
    def setMetric(value: SchemaMetricHeaderEntry): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}
