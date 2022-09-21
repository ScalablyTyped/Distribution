package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeeDetails extends StObject {
  
  /**
    * The base fee associated with the fulfillment method.
    */
  var baseFee: js.UndefOr[SchemaMinimumFee] = js.undefined
  
  /**
    * The fixed fee associated with the fulfillment method.
    */
  var fixedFee: js.UndefOr[SchemaFixedFee] = js.undefined
  
  /**
    * No fee for the fulfillment method.
    */
  var noFee: js.UndefOr[SchemaNoFee] = js.undefined
}
object SchemaFeeDetails {
  
  inline def apply(): SchemaFeeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeeDetails]
  }
  
  extension [Self <: SchemaFeeDetails](x: Self) {
    
    inline def setBaseFee(value: SchemaMinimumFee): Self = StObject.set(x, "baseFee", value.asInstanceOf[js.Any])
    
    inline def setBaseFeeUndefined: Self = StObject.set(x, "baseFee", js.undefined)
    
    inline def setFixedFee(value: SchemaFixedFee): Self = StObject.set(x, "fixedFee", value.asInstanceOf[js.Any])
    
    inline def setFixedFeeUndefined: Self = StObject.set(x, "fixedFee", js.undefined)
    
    inline def setNoFee(value: SchemaNoFee): Self = StObject.set(x, "noFee", value.asInstanceOf[js.Any])
    
    inline def setNoFeeUndefined: Self = StObject.set(x, "noFee", js.undefined)
  }
}
