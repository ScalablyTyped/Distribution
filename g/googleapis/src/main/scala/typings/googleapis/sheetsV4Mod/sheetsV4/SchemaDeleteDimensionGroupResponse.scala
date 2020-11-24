package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of deleting a group.
  */
@js.native
trait SchemaDeleteDimensionGroupResponse extends js.Object {
  
  /**
    * All groups of a dimension after deleting a group from that dimension.
    */
  var dimensionGroups: js.UndefOr[js.Array[SchemaDimensionGroup]] = js.native
}
object SchemaDeleteDimensionGroupResponse {
  
  @scala.inline
  def apply(): SchemaDeleteDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDimensionGroupResponse]
  }
  
  @scala.inline
  implicit class SchemaDeleteDimensionGroupResponseOps[Self <: SchemaDeleteDimensionGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setDimensionGroupsVarargs(value: SchemaDimensionGroup*): Self = this.set("dimensionGroups", js.Array(value :_*))
    
    @scala.inline
    def setDimensionGroups(value: js.Array[SchemaDimensionGroup]): Self = this.set("dimensionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionGroups: Self = this.set("dimensionGroups", js.undefined)
  }
}
