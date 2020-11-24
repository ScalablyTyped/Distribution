package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remarketing list response
  */
@js.native
trait SchemaRemarketingListsListResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#remarketingListsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Remarketing list collection.
    */
  var remarketingLists: js.UndefOr[js.Array[SchemaRemarketingList]] = js.native
}
object SchemaRemarketingListsListResponse {
  
  @scala.inline
  def apply(): SchemaRemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemarketingListsListResponse]
  }
  
  @scala.inline
  implicit class SchemaRemarketingListsListResponseOps[Self <: SchemaRemarketingListsListResponse] (val x: Self) extends AnyVal {
    
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
    def setRemarketingListsVarargs(value: SchemaRemarketingList*): Self = this.set("remarketingLists", js.Array(value :_*))
    
    @scala.inline
    def setRemarketingLists(value: js.Array[SchemaRemarketingList]): Self = this.set("remarketingLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemarketingLists: Self = this.set("remarketingLists", js.undefined)
  }
}
