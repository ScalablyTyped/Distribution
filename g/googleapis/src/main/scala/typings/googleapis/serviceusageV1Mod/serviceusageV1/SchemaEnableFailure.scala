package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnableFailure extends StObject {
  
  /**
    * An error message describing why the service could not be enabled.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The service id of a service that could not be enabled.
    */
  var serviceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnableFailure {
  
  inline def apply(): SchemaEnableFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnableFailure]
  }
  
  extension [Self <: SchemaEnableFailure](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdNull: Self = StObject.set(x, "serviceId", null)
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
