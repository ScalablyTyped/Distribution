package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveDealAssociationRequest extends StObject {
  
  /** The association between a creative and a deal that should be removed. */
  var association: js.UndefOr[CreativeDealAssociation] = js.undefined
}
object RemoveDealAssociationRequest {
  
  inline def apply(): RemoveDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveDealAssociationRequest]
  }
  
  extension [Self <: RemoveDealAssociationRequest](x: Self) {
    
    inline def setAssociation(value: CreativeDealAssociation): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
  }
}
