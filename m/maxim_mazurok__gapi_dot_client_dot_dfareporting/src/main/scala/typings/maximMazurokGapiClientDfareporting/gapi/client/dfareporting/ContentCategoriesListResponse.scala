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
  
  @scala.inline
  def apply(): ContentCategoriesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentCategoriesListResponse]
  }
  
  @scala.inline
  implicit class ContentCategoriesListResponseMutableBuilder[Self <: ContentCategoriesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentCategories(value: js.Array[ContentCategory]): Self = StObject.set(x, "contentCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentCategoriesUndefined: Self = StObject.set(x, "contentCategories", js.undefined)
    
    @scala.inline
    def setContentCategoriesVarargs(value: ContentCategory*): Self = StObject.set(x, "contentCategories", js.Array(value :_*))
    
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
