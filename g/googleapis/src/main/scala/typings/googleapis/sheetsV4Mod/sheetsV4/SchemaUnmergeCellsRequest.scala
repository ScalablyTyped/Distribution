package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Unmerges cells in the given range.
  */
@js.native
trait SchemaUnmergeCellsRequest extends js.Object {
  
  /**
    * The range within which all cells should be unmerged. If the range spans
    * multiple merges, all will be unmerged. The range must not partially span
    * any merge.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}
object SchemaUnmergeCellsRequest {
  
  @scala.inline
  def apply(): SchemaUnmergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnmergeCellsRequest]
  }
  
  @scala.inline
  implicit class SchemaUnmergeCellsRequestOps[Self <: SchemaUnmergeCellsRequest] (val x: Self) extends AnyVal {
    
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
    def setRange(value: SchemaGridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
