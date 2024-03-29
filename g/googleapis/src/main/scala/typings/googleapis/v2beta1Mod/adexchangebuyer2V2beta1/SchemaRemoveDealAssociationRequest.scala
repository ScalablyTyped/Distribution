package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoveDealAssociationRequest extends StObject {
  
  /**
    * The association between a creative and a deal that should be removed.
    */
  var association: js.UndefOr[SchemaCreativeDealAssociation] = js.undefined
}
object SchemaRemoveDealAssociationRequest {
  
  inline def apply(): SchemaRemoveDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveDealAssociationRequest]
  }
  
  extension [Self <: SchemaRemoveDealAssociationRequest](x: Self) {
    
    inline def setAssociation(value: SchemaCreativeDealAssociation): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
  }
}
