package typings.googleapis.gmailpostmastertoolsV1Mod.gmailpostmastertoolsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliveryError extends StObject {
  
  /**
    * The class of delivery error.
    */
  var errorClass: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ratio of messages where the error occurred vs all authenticated traffic.
    */
  var errorRatio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The type of delivery error.
    */
  var errorType: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeliveryError {
  
  inline def apply(): SchemaDeliveryError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryError]
  }
  
  extension [Self <: SchemaDeliveryError](x: Self) {
    
    inline def setErrorClass(value: String): Self = StObject.set(x, "errorClass", value.asInstanceOf[js.Any])
    
    inline def setErrorClassNull: Self = StObject.set(x, "errorClass", null)
    
    inline def setErrorClassUndefined: Self = StObject.set(x, "errorClass", js.undefined)
    
    inline def setErrorRatio(value: Double): Self = StObject.set(x, "errorRatio", value.asInstanceOf[js.Any])
    
    inline def setErrorRatioNull: Self = StObject.set(x, "errorRatio", null)
    
    inline def setErrorRatioUndefined: Self = StObject.set(x, "errorRatio", js.undefined)
    
    inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeNull: Self = StObject.set(x, "errorType", null)
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
  }
}
