package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Targetable remarketing list response
  */
@js.native
trait SchemaTargetableRemarketingListsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#targetableRemarketingListsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Targetable remarketing list collection.
    */
  var targetableRemarketingLists: js.UndefOr[js.Array[SchemaTargetableRemarketingList]] = js.native
}
object SchemaTargetableRemarketingListsListResponse {
  
  @scala.inline
  def apply(): SchemaTargetableRemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetableRemarketingListsListResponse]
  }
  
  @scala.inline
  implicit class SchemaTargetableRemarketingListsListResponseMutableBuilder[Self <: SchemaTargetableRemarketingListsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTargetableRemarketingLists(value: js.Array[SchemaTargetableRemarketingList]): Self = StObject.set(x, "targetableRemarketingLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetableRemarketingListsUndefined: Self = StObject.set(x, "targetableRemarketingLists", js.undefined)
    
    @scala.inline
    def setTargetableRemarketingListsVarargs(value: SchemaTargetableRemarketingList*): Self = StObject.set(x, "targetableRemarketingLists", js.Array(value :_*))
  }
}
