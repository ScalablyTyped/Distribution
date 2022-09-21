package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddDealAssociationRequest extends StObject {
  
  /**
    * The association between a creative and a deal that should be added.
    */
  var association: js.UndefOr[SchemaCreativeDealAssociation] = js.undefined
}
object SchemaAddDealAssociationRequest {
  
  inline def apply(): SchemaAddDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddDealAssociationRequest]
  }
  
  extension [Self <: SchemaAddDealAssociationRequest](x: Self) {
    
    inline def setAssociation(value: SchemaCreativeDealAssociation): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
  }
}
