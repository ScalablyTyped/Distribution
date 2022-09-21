package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnableServiceResponse extends StObject {
  
  /**
    * The new state of the service after enabling.
    */
  var service: js.UndefOr[SchemaGoogleApiServiceusageV1Service] = js.undefined
}
object SchemaEnableServiceResponse {
  
  inline def apply(): SchemaEnableServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnableServiceResponse]
  }
  
  extension [Self <: SchemaEnableServiceResponse](x: Self) {
    
    inline def setService(value: SchemaGoogleApiServiceusageV1Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
