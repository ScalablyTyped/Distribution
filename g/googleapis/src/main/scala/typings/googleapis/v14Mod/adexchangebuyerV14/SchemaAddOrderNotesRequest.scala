package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddOrderNotesRequest extends StObject {
  
  /**
    * The list of notes to add.
    */
  var notes: js.UndefOr[js.Array[SchemaMarketplaceNote]] = js.undefined
}
object SchemaAddOrderNotesRequest {
  
  inline def apply(): SchemaAddOrderNotesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddOrderNotesRequest]
  }
  
  extension [Self <: SchemaAddOrderNotesRequest](x: Self) {
    
    inline def setNotes(value: js.Array[SchemaMarketplaceNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: SchemaMarketplaceNote*): Self = StObject.set(x, "notes", js.Array(value :_*))
  }
}
