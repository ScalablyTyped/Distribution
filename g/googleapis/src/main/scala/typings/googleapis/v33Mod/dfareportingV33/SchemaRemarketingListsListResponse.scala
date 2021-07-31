package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remarketing list response
  */
trait SchemaRemarketingListsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#remarketingListsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Remarketing list collection.
    */
  var remarketingLists: js.UndefOr[js.Array[SchemaRemarketingList]] = js.undefined
}
object SchemaRemarketingListsListResponse {
  
  @scala.inline
  def apply(): SchemaRemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemarketingListsListResponse]
  }
  
  @scala.inline
  implicit class SchemaRemarketingListsListResponseMutableBuilder[Self <: SchemaRemarketingListsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRemarketingLists(value: js.Array[SchemaRemarketingList]): Self = StObject.set(x, "remarketingLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarketingListsUndefined: Self = StObject.set(x, "remarketingLists", js.undefined)
    
    @scala.inline
    def setRemarketingListsVarargs(value: SchemaRemarketingList*): Self = StObject.set(x, "remarketingLists", js.Array(value :_*))
  }
}
