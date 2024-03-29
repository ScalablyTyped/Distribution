package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnPolicyOnlineRestockingFee extends StObject {
  
  /**
    * Fixed restocking fee.
    */
  var fixedFee: js.UndefOr[SchemaPriceAmount] = js.undefined
  
  /**
    * Percent of total price in micros. 15,000,000 means 15% of the total price would be charged.
    */
  var microPercent: js.UndefOr[Double | Null] = js.undefined
}
object SchemaReturnPolicyOnlineRestockingFee {
  
  inline def apply(): SchemaReturnPolicyOnlineRestockingFee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnPolicyOnlineRestockingFee]
  }
  
  extension [Self <: SchemaReturnPolicyOnlineRestockingFee](x: Self) {
    
    inline def setFixedFee(value: SchemaPriceAmount): Self = StObject.set(x, "fixedFee", value.asInstanceOf[js.Any])
    
    inline def setFixedFeeUndefined: Self = StObject.set(x, "fixedFee", js.undefined)
    
    inline def setMicroPercent(value: Double): Self = StObject.set(x, "microPercent", value.asInstanceOf[js.Any])
    
    inline def setMicroPercentNull: Self = StObject.set(x, "microPercent", null)
    
    inline def setMicroPercentUndefined: Self = StObject.set(x, "microPercent", js.undefined)
  }
}
