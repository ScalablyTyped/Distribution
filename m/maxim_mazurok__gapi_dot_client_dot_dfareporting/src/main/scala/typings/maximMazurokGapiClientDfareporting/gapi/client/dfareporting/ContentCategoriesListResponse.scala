package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentCategoriesListResponse extends StObject {
  
  /** Content category collection. */
  var contentCategories: js.UndefOr[js.Array[ContentCategory]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#contentCategoriesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ContentCategoriesListResponse {
  
  inline def apply(): ContentCategoriesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentCategoriesListResponse]
  }
  
  extension [Self <: ContentCategoriesListResponse](x: Self) {
    
    inline def setContentCategories(value: js.Array[ContentCategory]): Self = StObject.set(x, "contentCategories", value.asInstanceOf[js.Any])
    
    inline def setContentCategoriesUndefined: Self = StObject.set(x, "contentCategories", js.undefined)
    
    inline def setContentCategoriesVarargs(value: ContentCategory*): Self = StObject.set(x, "contentCategories", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
