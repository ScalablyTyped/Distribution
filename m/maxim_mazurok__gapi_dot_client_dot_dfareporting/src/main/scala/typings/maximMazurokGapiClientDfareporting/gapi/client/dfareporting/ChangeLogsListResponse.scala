package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeLogsListResponse extends StObject {
  
  /** Change log collection. */
  var changeLogs: js.UndefOr[js.Array[ChangeLog]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#changeLogsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ChangeLogsListResponse {
  
  inline def apply(): ChangeLogsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeLogsListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeLogsListResponse] (val x: Self) extends AnyVal {
    
    inline def setChangeLogs(value: js.Array[ChangeLog]): Self = StObject.set(x, "changeLogs", value.asInstanceOf[js.Any])
    
    inline def setChangeLogsUndefined: Self = StObject.set(x, "changeLogs", js.undefined)
    
    inline def setChangeLogsVarargs(value: ChangeLog*): Self = StObject.set(x, "changeLogs", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
