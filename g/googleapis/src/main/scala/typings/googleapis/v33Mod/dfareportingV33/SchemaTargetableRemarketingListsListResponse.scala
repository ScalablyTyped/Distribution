package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetableRemarketingListsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#targetableRemarketingListsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Targetable remarketing list collection.
    */
  var targetableRemarketingLists: js.UndefOr[js.Array[SchemaTargetableRemarketingList]] = js.undefined
}
object SchemaTargetableRemarketingListsListResponse {
  
  inline def apply(): SchemaTargetableRemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetableRemarketingListsListResponse]
  }
  
  extension [Self <: SchemaTargetableRemarketingListsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTargetableRemarketingLists(value: js.Array[SchemaTargetableRemarketingList]): Self = StObject.set(x, "targetableRemarketingLists", value.asInstanceOf[js.Any])
    
    inline def setTargetableRemarketingListsUndefined: Self = StObject.set(x, "targetableRemarketingLists", js.undefined)
    
    inline def setTargetableRemarketingListsVarargs(value: SchemaTargetableRemarketingList*): Self = StObject.set(x, "targetableRemarketingLists", js.Array(value*))
  }
}
