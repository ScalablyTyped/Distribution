package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditAllOrderDealsResponse extends StObject {
  
  /** List of all deals in the proposal after edit. */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.native
  
  /** The latest revision number after the update has been applied. */
  var orderRevisionNumber: js.UndefOr[String] = js.native
}
object EditAllOrderDealsResponse {
  
  @scala.inline
  def apply(): EditAllOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditAllOrderDealsResponse]
  }
  
  @scala.inline
  implicit class EditAllOrderDealsResponseMutableBuilder[Self <: EditAllOrderDealsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeals(value: js.Array[MarketplaceDeal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    @scala.inline
    def setDealsVarargs(value: MarketplaceDeal*): Self = StObject.set(x, "deals", js.Array(value :_*))
    
    @scala.inline
    def setOrderRevisionNumber(value: String): Self = StObject.set(x, "orderRevisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderRevisionNumberUndefined: Self = StObject.set(x, "orderRevisionNumber", js.undefined)
  }
}
