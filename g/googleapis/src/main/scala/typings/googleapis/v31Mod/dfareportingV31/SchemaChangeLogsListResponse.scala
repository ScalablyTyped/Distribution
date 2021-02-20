package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Change Log List Response
  */
@js.native
trait SchemaChangeLogsListResponse extends StObject {
  
  /**
    * Change log collection.
    */
  var changeLogs: js.UndefOr[js.Array[SchemaChangeLog]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#changeLogsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaChangeLogsListResponse {
  
  @scala.inline
  def apply(): SchemaChangeLogsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangeLogsListResponse]
  }
  
  @scala.inline
  implicit class SchemaChangeLogsListResponseMutableBuilder[Self <: SchemaChangeLogsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeLogs(value: js.Array[SchemaChangeLog]): Self = StObject.set(x, "changeLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeLogsUndefined: Self = StObject.set(x, "changeLogs", js.undefined)
    
    @scala.inline
    def setChangeLogsVarargs(value: SchemaChangeLog*): Self = StObject.set(x, "changeLogs", js.Array(value :_*))
    
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
