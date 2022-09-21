package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvertiserAdServerConfig extends StObject {
  
  /**
    * The configuration for advertisers that use both Campaign Manager 360 (CM360) and third-party ad servers.
    */
  var cmHybridConfig: js.UndefOr[SchemaCmHybridConfig] = js.undefined
  
  /**
    * The configuration for advertisers that use third-party ad servers only.
    */
  var thirdPartyOnlyConfig: js.UndefOr[SchemaThirdPartyOnlyConfig] = js.undefined
}
object SchemaAdvertiserAdServerConfig {
  
  inline def apply(): SchemaAdvertiserAdServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserAdServerConfig]
  }
  
  extension [Self <: SchemaAdvertiserAdServerConfig](x: Self) {
    
    inline def setCmHybridConfig(value: SchemaCmHybridConfig): Self = StObject.set(x, "cmHybridConfig", value.asInstanceOf[js.Any])
    
    inline def setCmHybridConfigUndefined: Self = StObject.set(x, "cmHybridConfig", js.undefined)
    
    inline def setThirdPartyOnlyConfig(value: SchemaThirdPartyOnlyConfig): Self = StObject.set(x, "thirdPartyOnlyConfig", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyOnlyConfigUndefined: Self = StObject.set(x, "thirdPartyOnlyConfig", js.undefined)
  }
}
