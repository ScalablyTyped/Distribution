package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFixedFee extends StObject {
  
  /**
    * The amount of the fixed fee for the fulfillment method.
    */
  var amount: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaFixedFee {
  
  inline def apply(): SchemaFixedFee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFixedFee]
  }
  
  extension [Self <: SchemaFixedFee](x: Self) {
    
    inline def setAmount(value: SchemaMoney): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
  }
}
