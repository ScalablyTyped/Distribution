package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditAllOrderDealsResponse extends StObject {
  
  /** List of all deals in the proposal after edit. */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
  
  /** The latest revision number after the update has been applied. */
  var orderRevisionNumber: js.UndefOr[String] = js.undefined
}
object EditAllOrderDealsResponse {
  
  inline def apply(): EditAllOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditAllOrderDealsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditAllOrderDealsResponse] (val x: Self) extends AnyVal {
    
    inline def setDeals(value: js.Array[MarketplaceDeal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    inline def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    inline def setDealsVarargs(value: MarketplaceDeal*): Self = StObject.set(x, "deals", js.Array(value*))
    
    inline def setOrderRevisionNumber(value: String): Self = StObject.set(x, "orderRevisionNumber", value.asInstanceOf[js.Any])
    
    inline def setOrderRevisionNumberUndefined: Self = StObject.set(x, "orderRevisionNumber", js.undefined)
  }
}
