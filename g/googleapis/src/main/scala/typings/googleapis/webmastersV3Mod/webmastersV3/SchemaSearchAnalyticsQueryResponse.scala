package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchAnalyticsQueryResponse extends StObject {
  
  /**
    * How the results were aggregated.
    */
  var responseAggregationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of rows grouped by the key values in the order given in the query.
    */
  var rows: js.UndefOr[js.Array[SchemaApiDataRow]] = js.undefined
}
object SchemaSearchAnalyticsQueryResponse {
  
  inline def apply(): SchemaSearchAnalyticsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchAnalyticsQueryResponse]
  }
  
  extension [Self <: SchemaSearchAnalyticsQueryResponse](x: Self) {
    
    inline def setResponseAggregationType(value: String): Self = StObject.set(x, "responseAggregationType", value.asInstanceOf[js.Any])
    
    inline def setResponseAggregationTypeNull: Self = StObject.set(x, "responseAggregationType", null)
    
    inline def setResponseAggregationTypeUndefined: Self = StObject.set(x, "responseAggregationType", js.undefined)
    
    inline def setRows(value: js.Array[SchemaApiDataRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaApiDataRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
