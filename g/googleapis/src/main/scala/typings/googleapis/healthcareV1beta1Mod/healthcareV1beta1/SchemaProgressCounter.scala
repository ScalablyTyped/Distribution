package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProgressCounter extends StObject {
  
  /**
    * The number of units that failed in the operation.
    */
  var failure: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of units that are pending in the operation.
    */
  var pending: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of units that succeeded in the operation.
    */
  var success: js.UndefOr[String | Null] = js.undefined
}
object SchemaProgressCounter {
  
  inline def apply(): SchemaProgressCounter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProgressCounter]
  }
  
  extension [Self <: SchemaProgressCounter](x: Self) {
    
    inline def setFailure(value: String): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    inline def setFailureNull: Self = StObject.set(x, "failure", null)
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setPending(value: String): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPendingNull: Self = StObject.set(x, "pending", null)
    
    inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
    
    inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessNull: Self = StObject.set(x, "success", null)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
