package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchGetServicesResponse extends StObject {
  
  /**
    * The requested Service states.
    */
  var services: js.UndefOr[js.Array[SchemaGoogleApiServiceusageV1Service]] = js.undefined
}
object SchemaBatchGetServicesResponse {
  
  inline def apply(): SchemaBatchGetServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetServicesResponse]
  }
  
  extension [Self <: SchemaBatchGetServicesResponse](x: Self) {
    
    inline def setServices(value: js.Array[SchemaGoogleApiServiceusageV1Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: SchemaGoogleApiServiceusageV1Service*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
