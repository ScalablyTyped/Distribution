package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceManagedByIgmErrorManagedInstanceError extends StObject {
  
  /** [Output Only] Error code. */
  var code: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Error message. */
  var message: js.UndefOr[String] = js.undefined
}
object InstanceManagedByIgmErrorManagedInstanceError {
  
  inline def apply(): InstanceManagedByIgmErrorManagedInstanceError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceManagedByIgmErrorManagedInstanceError]
  }
  
  extension [Self <: InstanceManagedByIgmErrorManagedInstanceError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
