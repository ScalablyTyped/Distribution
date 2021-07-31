package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDealAssociationRequest extends StObject {
  
  /** The association between a creative and a deal that should be added. */
  var association: js.UndefOr[CreativeDealAssociation] = js.undefined
}
object AddDealAssociationRequest {
  
  @scala.inline
  def apply(): AddDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDealAssociationRequest]
  }
  
  @scala.inline
  implicit class AddDealAssociationRequestMutableBuilder[Self <: AddDealAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociation(value: CreativeDealAssociation): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
  }
}
