package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartnerAdServerConfig extends StObject {
  
  /**
    * Measurement settings of a partner.
    */
  var measurementConfig: js.UndefOr[SchemaMeasurementConfig] = js.undefined
}
object SchemaPartnerAdServerConfig {
  
  inline def apply(): SchemaPartnerAdServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartnerAdServerConfig]
  }
  
  extension [Self <: SchemaPartnerAdServerConfig](x: Self) {
    
    inline def setMeasurementConfig(value: SchemaMeasurementConfig): Self = StObject.set(x, "measurementConfig", value.asInstanceOf[js.Any])
    
    inline def setMeasurementConfigUndefined: Self = StObject.set(x, "measurementConfig", js.undefined)
  }
}
