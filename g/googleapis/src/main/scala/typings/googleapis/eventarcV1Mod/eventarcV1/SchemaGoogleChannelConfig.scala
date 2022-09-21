package typings.googleapis.eventarcV1Mod.eventarcV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChannelConfig extends StObject {
  
  /**
    * Optional. Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt their event data. It must match the pattern `projects/x/locations/x/keyRings/x/cryptoKeys/x`.
    */
  var cryptoKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The resource name of the config. Must be in the format of, `projects/{project\}/locations/{location\}/googleChannelConfig`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last-modified time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChannelConfig {
  
  inline def apply(): SchemaGoogleChannelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChannelConfig]
  }
  
  extension [Self <: SchemaGoogleChannelConfig](x: Self) {
    
    inline def setCryptoKeyName(value: String): Self = StObject.set(x, "cryptoKeyName", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyNameNull: Self = StObject.set(x, "cryptoKeyName", null)
    
    inline def setCryptoKeyNameUndefined: Self = StObject.set(x, "cryptoKeyName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
