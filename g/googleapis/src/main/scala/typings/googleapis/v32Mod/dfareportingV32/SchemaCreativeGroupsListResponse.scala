package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Group List Response
  */
@js.native
trait SchemaCreativeGroupsListResponse extends js.Object {
  
  /**
    * Creative group collection.
    */
  var creativeGroups: js.UndefOr[js.Array[SchemaCreativeGroup]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaCreativeGroupsListResponse {
  
  @scala.inline
  def apply(): SchemaCreativeGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeGroupsListResponse]
  }
  
  @scala.inline
  implicit class SchemaCreativeGroupsListResponseOps[Self <: SchemaCreativeGroupsListResponse] (val x: Self) extends AnyVal {
    
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
    def setCreativeGroupsVarargs(value: SchemaCreativeGroup*): Self = this.set("creativeGroups", js.Array(value :_*))
    
    @scala.inline
    def setCreativeGroups(value: js.Array[SchemaCreativeGroup]): Self = this.set("creativeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeGroups: Self = this.set("creativeGroups", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
