package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the list of reports.
  */
trait SchemaReportList extends StObject {
  
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The reports returned in this response.
    */
  var items: js.UndefOr[js.Array[SchemaReport]] = js.undefined
  
  /**
    * The kind of list this is, in this case dfareporting#reportList.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Continuation token used to page through reports. To retrieve the next
    * page of results, set the next request&#39;s &quot;pageToken&quot; to the
    * value of this field. The page token is only valid for a limited amount of
    * time and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaReportList {
  
  inline def apply(): SchemaReportList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportList]
  }
  
  extension [Self <: SchemaReportList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaReport]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaReport*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
