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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveDealAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setAssociation(value: CreativeDealAssociation): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
  }
}
