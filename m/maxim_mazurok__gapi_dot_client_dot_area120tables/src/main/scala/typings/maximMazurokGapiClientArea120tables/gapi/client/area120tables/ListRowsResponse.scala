package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRowsResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is empty, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The rows from the specified table. */
  var rows: js.UndefOr[js.Array[Row]] = js.undefined
}
object ListRowsResponse {
  
  inline def apply(): ListRowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRowsResponse]
  }
  
  extension [Self <: ListRowsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
