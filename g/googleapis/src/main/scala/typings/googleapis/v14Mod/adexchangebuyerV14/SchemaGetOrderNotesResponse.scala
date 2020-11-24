package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGetOrderNotesResponse extends js.Object {
  
  /**
    * The list of matching notes. The notes for a proposal are ordered from
    * oldest to newest. If the notes span multiple proposals, they will be
    * grouped by proposal, with the notes for the most recently modified
    * proposal appearing first.
    */
  var notes: js.UndefOr[js.Array[SchemaMarketplaceNote]] = js.native
}
object SchemaGetOrderNotesResponse {
  
  @scala.inline
  def apply(): SchemaGetOrderNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOrderNotesResponse]
  }
  
  @scala.inline
  implicit class SchemaGetOrderNotesResponseOps[Self <: SchemaGetOrderNotesResponse] (val x: Self) extends AnyVal {
    
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
    def setNotesVarargs(value: SchemaMarketplaceNote*): Self = this.set("notes", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Array[SchemaMarketplaceNote]): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
  }
}
