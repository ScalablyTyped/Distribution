package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddOrderNotesResponse extends StObject {
  
  var notes: js.UndefOr[js.Array[SchemaMarketplaceNote]] = js.undefined
}
object SchemaAddOrderNotesResponse {
  
  @scala.inline
  def apply(): SchemaAddOrderNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddOrderNotesResponse]
  }
  
  @scala.inline
  implicit class SchemaAddOrderNotesResponseMutableBuilder[Self <: SchemaAddOrderNotesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotes(value: js.Array[SchemaMarketplaceNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: SchemaMarketplaceNote*): Self = StObject.set(x, "notes", js.Array(value :_*))
  }
}
