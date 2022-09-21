package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMinimumFee extends StObject {
  
  /**
    * The base fee amount for the fulfillment method.
    */
  var baseFeeAmount: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaMinimumFee {
  
  inline def apply(): SchemaMinimumFee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMinimumFee]
  }
  
  extension [Self <: SchemaMinimumFee](x: Self) {
    
    inline def setBaseFeeAmount(value: SchemaMoney): Self = StObject.set(x, "baseFeeAmount", value.asInstanceOf[js.Any])
    
    inline def setBaseFeeAmountUndefined: Self = StObject.set(x, "baseFeeAmount", js.undefined)
  }
}
