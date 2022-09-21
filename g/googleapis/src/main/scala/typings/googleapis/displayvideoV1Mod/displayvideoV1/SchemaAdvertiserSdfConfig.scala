package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvertiserSdfConfig extends StObject {
  
  /**
    * Whether or not this advertiser overrides the SDF configuration of its parent partner. By default, an advertiser inherits the SDF configuration from the parent partner. To override the partner configuration, set this field to `true` and provide the new configuration in sdfConfig.
    */
  var overridePartnerSdfConfig: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The SDF configuration for the advertiser. * Required when overridePartnerSdfConfig is `true`. * Output only when overridePartnerSdfConfig is `false`.
    */
  var sdfConfig: js.UndefOr[SchemaSdfConfig] = js.undefined
}
object SchemaAdvertiserSdfConfig {
  
  inline def apply(): SchemaAdvertiserSdfConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserSdfConfig]
  }
  
  extension [Self <: SchemaAdvertiserSdfConfig](x: Self) {
    
    inline def setOverridePartnerSdfConfig(value: Boolean): Self = StObject.set(x, "overridePartnerSdfConfig", value.asInstanceOf[js.Any])
    
    inline def setOverridePartnerSdfConfigNull: Self = StObject.set(x, "overridePartnerSdfConfig", null)
    
    inline def setOverridePartnerSdfConfigUndefined: Self = StObject.set(x, "overridePartnerSdfConfig", js.undefined)
    
    inline def setSdfConfig(value: SchemaSdfConfig): Self = StObject.set(x, "sdfConfig", value.asInstanceOf[js.Any])
    
    inline def setSdfConfigUndefined: Self = StObject.set(x, "sdfConfig", js.undefined)
  }
}
