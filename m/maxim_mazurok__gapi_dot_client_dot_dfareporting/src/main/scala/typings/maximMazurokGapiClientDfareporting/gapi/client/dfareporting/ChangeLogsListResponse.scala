package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeLogsListResponse extends StObject {
  
  /** Change log collection. */
  var changeLogs: js.UndefOr[js.Array[ChangeLog]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#changeLogsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ChangeLogsListResponse {
  
  @scala.inline
  def apply(): ChangeLogsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeLogsListResponse]
  }
  
  @scala.inline
  implicit class ChangeLogsListResponseMutableBuilder[Self <: ChangeLogsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeLogs(value: js.Array[ChangeLog]): Self = StObject.set(x, "changeLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeLogsUndefined: Self = StObject.set(x, "changeLogs", js.undefined)
    
    @scala.inline
    def setChangeLogsVarargs(value: ChangeLog*): Self = StObject.set(x, "changeLogs", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
