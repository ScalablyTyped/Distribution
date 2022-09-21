package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRowsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is empty, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rows from the specified table.
    */
  var rows: js.UndefOr[js.Array[SchemaRow]] = js.undefined
}
object SchemaListRowsResponse {
  
  inline def apply(): SchemaListRowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRowsResponse]
  }
  
  extension [Self <: SchemaListRowsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRows(value: js.Array[SchemaRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
