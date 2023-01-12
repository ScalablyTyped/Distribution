package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetableRemarketingListsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#targetableRemarketingListsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Targetable remarketing list collection. */
  var targetableRemarketingLists: js.UndefOr[js.Array[TargetableRemarketingList]] = js.undefined
}
object TargetableRemarketingListsListResponse {
  
  inline def apply(): TargetableRemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetableRemarketingListsListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetableRemarketingListsListResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTargetableRemarketingLists(value: js.Array[TargetableRemarketingList]): Self = StObject.set(x, "targetableRemarketingLists", value.asInstanceOf[js.Any])
    
    inline def setTargetableRemarketingListsUndefined: Self = StObject.set(x, "targetableRemarketingLists", js.undefined)
    
    inline def setTargetableRemarketingListsVarargs(value: TargetableRemarketingList*): Self = StObject.set(x, "targetableRemarketingLists", js.Array(value*))
  }
}
