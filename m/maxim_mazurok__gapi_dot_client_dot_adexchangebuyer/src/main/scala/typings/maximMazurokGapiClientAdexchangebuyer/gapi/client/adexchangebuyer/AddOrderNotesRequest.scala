package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOrderNotesRequest extends StObject {
  
  /** The list of notes to add. */
  var notes: js.UndefOr[js.Array[MarketplaceNote]] = js.undefined
}
object AddOrderNotesRequest {
  
  inline def apply(): AddOrderNotesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOrderNotesRequest]
  }
  
  extension [Self <: AddOrderNotesRequest](x: Self) {
    
    inline def setNotes(value: js.Array[MarketplaceNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: MarketplaceNote*): Self = StObject.set(x, "notes", js.Array(value*))
  }
}
