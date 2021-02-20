package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGetOrderNotesResponse extends StObject {
  
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
  implicit class SchemaGetOrderNotesResponseMutableBuilder[Self <: SchemaGetOrderNotesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotes(value: js.Array[SchemaMarketplaceNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: SchemaMarketplaceNote*): Self = StObject.set(x, "notes", js.Array(value :_*))
  }
}
