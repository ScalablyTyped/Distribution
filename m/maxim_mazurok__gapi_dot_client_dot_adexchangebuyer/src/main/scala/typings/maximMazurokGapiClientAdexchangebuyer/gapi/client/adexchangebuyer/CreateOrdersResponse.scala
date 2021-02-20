package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOrdersResponse extends StObject {
  
  /** The list of proposals successfully created. */
  var proposals: js.UndefOr[js.Array[Proposal]] = js.native
}
object CreateOrdersResponse {
  
  @scala.inline
  def apply(): CreateOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrdersResponse]
  }
  
  @scala.inline
  implicit class CreateOrdersResponseMutableBuilder[Self <: CreateOrdersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProposals(value: js.Array[Proposal]): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalsUndefined: Self = StObject.set(x, "proposals", js.undefined)
    
    @scala.inline
    def setProposalsVarargs(value: Proposal*): Self = StObject.set(x, "proposals", js.Array(value :_*))
  }
}
