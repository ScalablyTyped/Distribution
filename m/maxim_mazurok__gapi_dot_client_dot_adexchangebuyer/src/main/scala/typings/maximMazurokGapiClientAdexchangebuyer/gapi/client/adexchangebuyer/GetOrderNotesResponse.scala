package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrderNotesResponse extends StObject {
  
  /**
    * The list of matching notes. The notes for a proposal are ordered from oldest to newest. If the notes span multiple proposals, they will be grouped by proposal, with the notes for
    * the most recently modified proposal appearing first.
    */
  var notes: js.UndefOr[js.Array[MarketplaceNote]] = js.undefined
}
object GetOrderNotesResponse {
  
  @scala.inline
  def apply(): GetOrderNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrderNotesResponse]
  }
  
  @scala.inline
  implicit class GetOrderNotesResponseMutableBuilder[Self <: GetOrderNotesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotes(value: js.Array[MarketplaceNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: MarketplaceNote*): Self = StObject.set(x, "notes", js.Array(value :_*))
  }
}
