package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChangeLogsListResponse extends StObject {
  
  /**
    * Change log collection.
    */
  var changeLogs: js.UndefOr[js.Array[SchemaChangeLog]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#changeLogsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaChangeLogsListResponse {
  
  inline def apply(): SchemaChangeLogsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangeLogsListResponse]
  }
  
  extension [Self <: SchemaChangeLogsListResponse](x: Self) {
    
    inline def setChangeLogs(value: js.Array[SchemaChangeLog]): Self = StObject.set(x, "changeLogs", value.asInstanceOf[js.Any])
    
    inline def setChangeLogsUndefined: Self = StObject.set(x, "changeLogs", js.undefined)
    
    inline def setChangeLogsVarargs(value: SchemaChangeLog*): Self = StObject.set(x, "changeLogs", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
