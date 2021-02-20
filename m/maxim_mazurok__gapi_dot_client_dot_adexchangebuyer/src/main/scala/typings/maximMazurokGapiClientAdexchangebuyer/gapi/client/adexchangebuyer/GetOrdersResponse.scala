package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrdersResponse extends StObject {
  
  /** The list of matching proposals. */
  var proposals: js.UndefOr[js.Array[Proposal]] = js.native
}
object GetOrdersResponse {
  
  @scala.inline
  def apply(): GetOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrdersResponse]
  }
  
  @scala.inline
  implicit class GetOrdersResponseMutableBuilder[Self <: GetOrdersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProposals(value: js.Array[Proposal]): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalsUndefined: Self = StObject.set(x, "proposals", js.undefined)
    
    @scala.inline
    def setProposalsVarargs(value: Proposal*): Self = StObject.set(x, "proposals", js.Array(value :_*))
  }
}
