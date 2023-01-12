package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOrderNotesResponse extends StObject {
  
  var notes: js.UndefOr[js.Array[MarketplaceNote]] = js.undefined
}
object AddOrderNotesResponse {
  
  inline def apply(): AddOrderNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOrderNotesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddOrderNotesResponse] (val x: Self) extends AnyVal {
    
    inline def setNotes(value: js.Array[MarketplaceNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: MarketplaceNote*): Self = StObject.set(x, "notes", js.Array(value*))
  }
}
