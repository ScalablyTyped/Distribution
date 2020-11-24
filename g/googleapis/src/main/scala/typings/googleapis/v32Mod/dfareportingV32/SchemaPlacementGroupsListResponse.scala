package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Placement Group List Response
  */
@js.native
trait SchemaPlacementGroupsListResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Placement group collection.
    */
  var placementGroups: js.UndefOr[js.Array[SchemaPlacementGroup]] = js.native
}
object SchemaPlacementGroupsListResponse {
  
  @scala.inline
  def apply(): SchemaPlacementGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementGroupsListResponse]
  }
  
  @scala.inline
  implicit class SchemaPlacementGroupsListResponseOps[Self <: SchemaPlacementGroupsListResponse] (val x: Self) extends AnyVal {
    
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
    def setPlacementGroupsVarargs(value: SchemaPlacementGroup*): Self = this.set("placementGroups", js.Array(value :_*))
    
    @scala.inline
    def setPlacementGroups(value: js.Array[SchemaPlacementGroup]): Self = this.set("placementGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementGroups: Self = this.set("placementGroups", js.undefined)
  }
}
