package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for removing the association between a deal and a creative.
  */
trait SchemaRemoveDealAssociationRequest extends StObject {
  
  /**
    * The association between a creative and a deal that should be removed.
    */
  var association: js.UndefOr[SchemaCreativeDealAssociation] = js.undefined
}
object SchemaRemoveDealAssociationRequest {
  
  @scala.inline
  def apply(): SchemaRemoveDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveDealAssociationRequest]
  }
  
  @scala.inline
  implicit class SchemaRemoveDealAssociationRequestMutableBuilder[Self <: SchemaRemoveDealAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociation(value: SchemaCreativeDealAssociation): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
  }
}
