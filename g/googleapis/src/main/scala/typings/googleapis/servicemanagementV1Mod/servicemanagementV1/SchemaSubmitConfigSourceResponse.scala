package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for SubmitConfigSource method.
  */
trait SchemaSubmitConfigSourceResponse extends StObject {
  
  /**
    * The generated service configuration.
    */
  var serviceConfig: js.UndefOr[SchemaService] = js.undefined
}
object SchemaSubmitConfigSourceResponse {
  
  inline def apply(): SchemaSubmitConfigSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubmitConfigSourceResponse]
  }
  
  extension [Self <: SchemaSubmitConfigSourceResponse](x: Self) {
    
    inline def setServiceConfig(value: SchemaService): Self = StObject.set(x, "serviceConfig", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigUndefined: Self = StObject.set(x, "serviceConfig", js.undefined)
  }
}
