package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Targetable remarketing list response
  */
@js.native
trait SchemaTargetableRemarketingListsListResponse extends js.Object {
  
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
  implicit class SchemaTargetableRemarketingListsListResponseOps[Self <: SchemaTargetableRemarketingListsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTargetableRemarketingListsVarargs(value: SchemaTargetableRemarketingList*): Self = this.set("targetableRemarketingLists", js.Array(value :_*))
    
    @scala.inline
    def setTargetableRemarketingLists(value: js.Array[SchemaTargetableRemarketingList]): Self = this.set("targetableRemarketingLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetableRemarketingLists: Self = this.set("targetableRemarketingLists", js.undefined)
  }
}
