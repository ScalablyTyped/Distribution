package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLineItemProductFee extends StObject {
  
  /**
    * Amount of the fee.
    */
  var amount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Name of the fee.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderLineItemProductFee {
  
  inline def apply(): SchemaOrderLineItemProductFee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemProductFee]
  }
  
  extension [Self <: SchemaOrderLineItemProductFee](x: Self) {
    
    inline def setAmount(value: SchemaPrice): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
