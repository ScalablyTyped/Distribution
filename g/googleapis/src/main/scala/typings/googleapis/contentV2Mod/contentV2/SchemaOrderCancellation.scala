package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderCancellation extends StObject {
  
  /**
    * The actor that created the cancellation.
    */
  var actor: js.UndefOr[String] = js.undefined
  
  /**
    * Date on which the cancellation has been created, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The quantity that was canceled.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /**
    * The reason for the cancellation. Orders that are cancelled with a
    * noInventory reason will lead to the removal of the product from Shopping
    * Actions until you make an update to that product. This will not affect
    * your Shopping ads.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.undefined
}
object SchemaOrderCancellation {
  
  inline def apply(): SchemaOrderCancellation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderCancellation]
  }
  
  extension [Self <: SchemaOrderCancellation](x: Self) {
    
    inline def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    inline def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
