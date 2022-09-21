package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryResponse extends StObject {
  
  /**
    * This value specifies information about the data returned in the `rows` fields. Each item in the `columnHeaders` list identifies a field returned in the `rows` value, which contains a list of comma-delimited data. The `columnHeaders` list will begin with the dimensions specified in the API request, which will be followed by the metrics specified in the API request. The order of both dimensions and metrics will match the ordering in the API request. For example, if the API request contains the parameters `dimensions=ageGroup,gender&metrics=viewerPercentage`, the API response will return columns in this order: `ageGroup`, `gender`, `viewerPercentage`.
    */
  var columnHeaders: js.UndefOr[js.Array[SchemaResultTableColumnHeader]] = js.undefined
  
  /**
    * When set, indicates that the operation failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.undefined
  
  /**
    * This value specifies the type of data included in the API response. For the query method, the kind property value will be `youtubeAnalytics#resultTable`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list contains all rows of the result table. Each item in the list is an array that contains comma-delimited data corresponding to a single row of data. The order of the comma-delimited data fields will match the order of the columns listed in the `columnHeaders` field. If no data is available for the given query, the `rows` element will be omitted from the response. The response for a query with the `day` dimension will not contain rows for the most recent days.
    */
  var rows: js.UndefOr[js.Array[js.Array[Any]] | Null] = js.undefined
}
object SchemaQueryResponse {
  
  inline def apply(): SchemaQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryResponse]
  }
  
  extension [Self <: SchemaQueryResponse](x: Self) {
    
    inline def setColumnHeaders(value: js.Array[SchemaResultTableColumnHeader]): Self = StObject.set(x, "columnHeaders", value.asInstanceOf[js.Any])
    
    inline def setColumnHeadersUndefined: Self = StObject.set(x, "columnHeaders", js.undefined)
    
    inline def setColumnHeadersVarargs(value: SchemaResultTableColumnHeader*): Self = StObject.set(x, "columnHeaders", js.Array(value*))
    
    inline def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRows(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsNull: Self = StObject.set(x, "rows", null)
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
