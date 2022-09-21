package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1EnvironmentSessionSpec extends StObject {
  
  /**
    * Optional. If True, this causes sessions to be pre-created and available for faster startup to enable interactive exploration use-cases. This defaults to False to avoid additional billed charges. These can only be set to True for the environment with name set to "default", and with default configuration.
    */
  var enableFastStartup: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The idle time configuration of the session. The session will be auto-terminated at the end of this period.
    */
  var maxIdleDuration: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1EnvironmentSessionSpec {
  
  inline def apply(): SchemaGoogleCloudDataplexV1EnvironmentSessionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1EnvironmentSessionSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1EnvironmentSessionSpec](x: Self) {
    
    inline def setEnableFastStartup(value: Boolean): Self = StObject.set(x, "enableFastStartup", value.asInstanceOf[js.Any])
    
    inline def setEnableFastStartupNull: Self = StObject.set(x, "enableFastStartup", null)
    
    inline def setEnableFastStartupUndefined: Self = StObject.set(x, "enableFastStartup", js.undefined)
    
    inline def setMaxIdleDuration(value: String): Self = StObject.set(x, "maxIdleDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxIdleDurationNull: Self = StObject.set(x, "maxIdleDuration", null)
    
    inline def setMaxIdleDurationUndefined: Self = StObject.set(x, "maxIdleDuration", js.undefined)
  }
}
