package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOrdersRequest extends StObject {
  
  /** The list of proposals to create. */
  var proposals: js.UndefOr[js.Array[Proposal]] = js.native
  
  /** Web property id of the seller creating these orders */
  var webPropertyCode: js.UndefOr[String] = js.native
}
object CreateOrdersRequest {
  
  @scala.inline
  def apply(): CreateOrdersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrdersRequest]
  }
  
  @scala.inline
  implicit class CreateOrdersRequestMutableBuilder[Self <: CreateOrdersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProposals(value: js.Array[Proposal]): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalsUndefined: Self = StObject.set(x, "proposals", js.undefined)
    
    @scala.inline
    def setProposalsVarargs(value: Proposal*): Self = StObject.set(x, "proposals", js.Array(value :_*))
    
    @scala.inline
    def setWebPropertyCode(value: String): Self = StObject.set(x, "webPropertyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyCodeUndefined: Self = StObject.set(x, "webPropertyCode", js.undefined)
  }
}
