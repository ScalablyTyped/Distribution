package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrdersResponse extends StObject {
  
  /** The list of proposals successfully created. */
  var proposals: js.UndefOr[js.Array[Proposal]] = js.undefined
}
object CreateOrdersResponse {
  
  inline def apply(): CreateOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrdersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOrdersResponse] (val x: Self) extends AnyVal {
    
    inline def setProposals(value: js.Array[Proposal]): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    inline def setProposalsUndefined: Self = StObject.set(x, "proposals", js.undefined)
    
    inline def setProposalsVarargs(value: Proposal*): Self = StObject.set(x, "proposals", js.Array(value*))
  }
}
