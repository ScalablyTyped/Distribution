package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDoubleVerifyFraudInvalidTraffic extends StObject {
  
  /**
    * Insufficient Historical Fraud & IVT Stats.
    */
  var avoidInsufficientOption: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Avoid Sites and Apps with historical Fraud & IVT.
    */
  var avoidedFraudOption: js.UndefOr[String | Null] = js.undefined
}
object SchemaDoubleVerifyFraudInvalidTraffic {
  
  inline def apply(): SchemaDoubleVerifyFraudInvalidTraffic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleVerifyFraudInvalidTraffic]
  }
  
  extension [Self <: SchemaDoubleVerifyFraudInvalidTraffic](x: Self) {
    
    inline def setAvoidInsufficientOption(value: Boolean): Self = StObject.set(x, "avoidInsufficientOption", value.asInstanceOf[js.Any])
    
    inline def setAvoidInsufficientOptionNull: Self = StObject.set(x, "avoidInsufficientOption", null)
    
    inline def setAvoidInsufficientOptionUndefined: Self = StObject.set(x, "avoidInsufficientOption", js.undefined)
    
    inline def setAvoidedFraudOption(value: String): Self = StObject.set(x, "avoidedFraudOption", value.asInstanceOf[js.Any])
    
    inline def setAvoidedFraudOptionNull: Self = StObject.set(x, "avoidedFraudOption", null)
    
    inline def setAvoidedFraudOptionUndefined: Self = StObject.set(x, "avoidedFraudOption", js.undefined)
  }
}
