package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestinationConfig extends StObject {
  
  /**
    * Required. Destination connection profile resource. Format: `projects/{project\}/locations/{location\}/connectionProfiles/{name\}`
    */
  var destinationConnectionProfile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A configuration for how data should be loaded to Cloud Storage.
    */
  var gcsDestinationConfig: js.UndefOr[SchemaGcsDestinationConfig] = js.undefined
}
object SchemaDestinationConfig {
  
  inline def apply(): SchemaDestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestinationConfig]
  }
  
  extension [Self <: SchemaDestinationConfig](x: Self) {
    
    inline def setDestinationConnectionProfile(value: String): Self = StObject.set(x, "destinationConnectionProfile", value.asInstanceOf[js.Any])
    
    inline def setDestinationConnectionProfileNull: Self = StObject.set(x, "destinationConnectionProfile", null)
    
    inline def setDestinationConnectionProfileUndefined: Self = StObject.set(x, "destinationConnectionProfile", js.undefined)
    
    inline def setGcsDestinationConfig(value: SchemaGcsDestinationConfig): Self = StObject.set(x, "gcsDestinationConfig", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationConfigUndefined: Self = StObject.set(x, "gcsDestinationConfig", js.undefined)
  }
}
