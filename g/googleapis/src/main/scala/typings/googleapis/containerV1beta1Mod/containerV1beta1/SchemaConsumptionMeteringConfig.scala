package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConsumptionMeteringConfig extends StObject {
  
  /**
    * Whether to enable consumption metering for this cluster. If enabled, a second BigQuery table will be created to hold resource consumption records.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaConsumptionMeteringConfig {
  
  inline def apply(): SchemaConsumptionMeteringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsumptionMeteringConfig]
  }
  
  extension [Self <: SchemaConsumptionMeteringConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
