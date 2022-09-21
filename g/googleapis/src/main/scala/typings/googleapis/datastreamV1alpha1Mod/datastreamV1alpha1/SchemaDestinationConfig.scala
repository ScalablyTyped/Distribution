package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestinationConfig extends StObject {
  
  /**
    * Required. Destination connection profile identifier.
    */
  var destinationConnectionProfileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * GCS destination configuration.
    */
  var gcsDestinationConfig: js.UndefOr[SchemaGcsDestinationConfig] = js.undefined
}
object SchemaDestinationConfig {
  
  inline def apply(): SchemaDestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestinationConfig]
  }
  
  extension [Self <: SchemaDestinationConfig](x: Self) {
    
    inline def setDestinationConnectionProfileName(value: String): Self = StObject.set(x, "destinationConnectionProfileName", value.asInstanceOf[js.Any])
    
    inline def setDestinationConnectionProfileNameNull: Self = StObject.set(x, "destinationConnectionProfileName", null)
    
    inline def setDestinationConnectionProfileNameUndefined: Self = StObject.set(x, "destinationConnectionProfileName", js.undefined)
    
    inline def setGcsDestinationConfig(value: SchemaGcsDestinationConfig): Self = StObject.set(x, "gcsDestinationConfig", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationConfigUndefined: Self = StObject.set(x, "gcsDestinationConfig", js.undefined)
  }
}
