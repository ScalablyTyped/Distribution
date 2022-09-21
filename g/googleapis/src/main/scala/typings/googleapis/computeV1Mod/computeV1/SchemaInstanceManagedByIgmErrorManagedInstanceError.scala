package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceManagedByIgmErrorManagedInstanceError extends StObject {
  
  /**
    * [Output Only] Error code.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Error message.
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceManagedByIgmErrorManagedInstanceError {
  
  inline def apply(): SchemaInstanceManagedByIgmErrorManagedInstanceError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceManagedByIgmErrorManagedInstanceError]
  }
  
  extension [Self <: SchemaInstanceManagedByIgmErrorManagedInstanceError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
