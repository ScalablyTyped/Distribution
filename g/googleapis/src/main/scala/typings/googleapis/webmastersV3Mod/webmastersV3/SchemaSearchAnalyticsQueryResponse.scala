package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of rows, one per result, grouped by key. Metrics in each row are
  * aggregated for all data grouped by that key either by page or property, as
  * specified by the aggregation type parameter.
  */
@js.native
trait SchemaSearchAnalyticsQueryResponse extends StObject {
  
  /**
    * How the results were aggregated.
    */
  var responseAggregationType: js.UndefOr[String] = js.native
  
  /**
    * A list of rows grouped by the key values in the order given in the query.
    */
  var rows: js.UndefOr[js.Array[SchemaApiDataRow]] = js.native
}
object SchemaSearchAnalyticsQueryResponse {
  
  @scala.inline
  def apply(): SchemaSearchAnalyticsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchAnalyticsQueryResponse]
  }
  
  @scala.inline
  implicit class SchemaSearchAnalyticsQueryResponseMutableBuilder[Self <: SchemaSearchAnalyticsQueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponseAggregationType(value: String): Self = StObject.set(x, "responseAggregationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseAggregationTypeUndefined: Self = StObject.set(x, "responseAggregationType", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[SchemaApiDataRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: SchemaApiDataRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
