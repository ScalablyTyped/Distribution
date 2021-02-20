package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A row in the report.
  */
@js.native
trait SchemaReportRow extends StObject {
  
  /**
    * List of requested dimensions.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of metrics for each requested DateRange.
    */
  var metrics: js.UndefOr[js.Array[SchemaDateRangeValues]] = js.native
}
object SchemaReportRow {
  
  @scala.inline
  def apply(): SchemaReportRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportRow]
  }
  
  @scala.inline
  implicit class SchemaReportRowMutableBuilder[Self <: SchemaReportRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[SchemaDateRangeValues]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: SchemaDateRangeValues*): Self = StObject.set(x, "metrics", js.Array(value :_*))
  }
}
