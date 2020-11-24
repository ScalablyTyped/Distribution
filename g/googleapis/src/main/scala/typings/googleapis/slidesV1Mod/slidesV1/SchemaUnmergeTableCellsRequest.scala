package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Unmerges cells in a Table.
  */
@js.native
trait SchemaUnmergeTableCellsRequest extends js.Object {
  
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The table range specifying which cells of the table to unmerge.  All
    * merged cells in this range will be unmerged, and cells that are already
    * unmerged will not be affected. If the range has no merged cells, the
    * request will do nothing. If there is text in any of the merged cells, the
    * text will remain in the upper-left (&quot;head&quot;) cell of the
    * resulting block of unmerged cells.
    */
  var tableRange: js.UndefOr[SchemaTableRange] = js.native
}
object SchemaUnmergeTableCellsRequest {
  
  @scala.inline
  def apply(): SchemaUnmergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnmergeTableCellsRequest]
  }
  
  @scala.inline
  implicit class SchemaUnmergeTableCellsRequestOps[Self <: SchemaUnmergeTableCellsRequest] (val x: Self) extends AnyVal {
    
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
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setTableRange(value: SchemaTableRange): Self = this.set("tableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRange: Self = this.set("tableRange", js.undefined)
  }
}
