package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrdersResponse extends StObject {
  
  /** The list of matching proposals. */
  var proposals: js.UndefOr[js.Array[Proposal]] = js.undefined
}
object GetOrdersResponse {
  
  inline def apply(): GetOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrdersResponse]
  }
  
  extension [Self <: GetOrdersResponse](x: Self) {
    
    inline def setProposals(value: js.Array[Proposal]): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    inline def setProposalsUndefined: Self = StObject.set(x, "proposals", js.undefined)
    
    inline def setProposalsVarargs(value: Proposal*): Self = StObject.set(x, "proposals", js.Array(value :_*))
  }
}
