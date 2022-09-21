package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemarketingListsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#remarketingListsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Remarketing list collection.
    */
  var remarketingLists: js.UndefOr[js.Array[SchemaRemarketingList]] = js.undefined
}
object SchemaRemarketingListsListResponse {
  
  inline def apply(): SchemaRemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemarketingListsListResponse]
  }
  
  extension [Self <: SchemaRemarketingListsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRemarketingLists(value: js.Array[SchemaRemarketingList]): Self = StObject.set(x, "remarketingLists", value.asInstanceOf[js.Any])
    
    inline def setRemarketingListsUndefined: Self = StObject.set(x, "remarketingLists", js.undefined)
    
    inline def setRemarketingListsVarargs(value: SchemaRemarketingList*): Self = StObject.set(x, "remarketingLists", js.Array(value*))
  }
}
