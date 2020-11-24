package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes a group over the specified range by decrementing the depth of the
  * dimensions in the range.  For example, assume the sheet has a depth-1 group
  * over B:E and a depth-2 group over C:D. Deleting a group over D:E leaves the
  * sheet with a depth-1 group over B:D and a depth-2 group over C:C.
  */
@js.native
trait SchemaDeleteDimensionGroupRequest extends js.Object {
  
  /**
    * The range of the group to be deleted.
    */
  var range: js.UndefOr[SchemaDimensionRange] = js.native
}
object SchemaDeleteDimensionGroupRequest {
  
  @scala.inline
  def apply(): SchemaDeleteDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDimensionGroupRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteDimensionGroupRequestOps[Self <: SchemaDeleteDimensionGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setRange(value: SchemaDimensionRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
