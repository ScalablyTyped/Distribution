package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderRefund extends StObject {
  
  /**
    * The actor that created the refund.
    */
  var actor: js.UndefOr[String] = js.undefined
  
  /**
    * The amount that is refunded.
    */
  var amount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Date on which the item has been created, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The reason for the refund.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.undefined
}
object SchemaOrderRefund {
  
  inline def apply(): SchemaOrderRefund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderRefund]
  }
  
  extension [Self <: SchemaOrderRefund](x: Self) {
    
    inline def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setAmount(value: SchemaPrice): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    inline def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
