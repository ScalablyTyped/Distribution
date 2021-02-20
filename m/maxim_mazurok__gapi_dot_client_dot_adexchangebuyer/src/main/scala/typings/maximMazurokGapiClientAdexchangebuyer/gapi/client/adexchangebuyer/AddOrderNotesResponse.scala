package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddOrderNotesResponse extends StObject {
  
  var notes: js.UndefOr[js.Array[MarketplaceNote]] = js.native
}
object AddOrderNotesResponse {
  
  @scala.inline
  def apply(): AddOrderNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOrderNotesResponse]
  }
  
  @scala.inline
  implicit class AddOrderNotesResponseMutableBuilder[Self <: AddOrderNotesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotes(value: js.Array[MarketplaceNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: MarketplaceNote*): Self = StObject.set(x, "notes", js.Array(value :_*))
  }
}
