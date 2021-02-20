package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetableRemarketingListsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#targetableRemarketingListsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Targetable remarketing list collection. */
  var targetableRemarketingLists: js.UndefOr[js.Array[TargetableRemarketingList]] = js.native
}
object TargetableRemarketingListsListResponse {
  
  @scala.inline
  def apply(): TargetableRemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetableRemarketingListsListResponse]
  }
  
  @scala.inline
  implicit class TargetableRemarketingListsListResponseMutableBuilder[Self <: TargetableRemarketingListsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTargetableRemarketingLists(value: js.Array[TargetableRemarketingList]): Self = StObject.set(x, "targetableRemarketingLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetableRemarketingListsUndefined: Self = StObject.set(x, "targetableRemarketingLists", js.undefined)
    
    @scala.inline
    def setTargetableRemarketingListsVarargs(value: TargetableRemarketingList*): Self = StObject.set(x, "targetableRemarketingLists", js.Array(value :_*))
  }
}
