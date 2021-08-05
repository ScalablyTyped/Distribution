package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Change Log List Response
  */
trait SchemaChangeLogsListResponse extends StObject {
  
  /**
    * Change log collection.
    */
  var changeLogs: js.UndefOr[js.Array[SchemaChangeLog]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#changeLogsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaChangeLogsListResponse {
  
  inline def apply(): SchemaChangeLogsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangeLogsListResponse]
  }
  
  extension [Self <: SchemaChangeLogsListResponse](x: Self) {
    
    inline def setChangeLogs(value: js.Array[SchemaChangeLog]): Self = StObject.set(x, "changeLogs", value.asInstanceOf[js.Any])
    
    inline def setChangeLogsUndefined: Self = StObject.set(x, "changeLogs", js.undefined)
    
    inline def setChangeLogsVarargs(value: SchemaChangeLog*): Self = StObject.set(x, "changeLogs", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
