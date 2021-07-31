package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderReturn extends StObject {
  
  /**
    * The actor that created the refund.
    */
  var actor: js.UndefOr[String] = js.undefined
  
  /**
    * Date on which the item has been created, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String] = js.undefined
  
  /**
    * Quantity that is returned.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /**
    * The reason for the return.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.undefined
}
object SchemaOrderReturn {
  
  @scala.inline
  def apply(): SchemaOrderReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderReturn]
  }
  
  @scala.inline
  implicit class SchemaOrderReturnMutableBuilder[Self <: SchemaOrderReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    @scala.inline
    def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
