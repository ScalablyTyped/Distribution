package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrdersRequest extends StObject {
  
  /** The list of proposals to create. */
  var proposals: js.UndefOr[js.Array[Proposal]] = js.undefined
  
  /** Web property id of the seller creating these orders */
  var webPropertyCode: js.UndefOr[String] = js.undefined
}
object CreateOrdersRequest {
  
  inline def apply(): CreateOrdersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrdersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOrdersRequest] (val x: Self) extends AnyVal {
    
    inline def setProposals(value: js.Array[Proposal]): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    inline def setProposalsUndefined: Self = StObject.set(x, "proposals", js.undefined)
    
    inline def setProposalsVarargs(value: Proposal*): Self = StObject.set(x, "proposals", js.Array(value*))
    
    inline def setWebPropertyCode(value: String): Self = StObject.set(x, "webPropertyCode", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyCodeUndefined: Self = StObject.set(x, "webPropertyCode", js.undefined)
  }
}
