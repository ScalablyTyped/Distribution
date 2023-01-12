package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumptionMeteringConfig extends StObject {
  
  /** Whether to enable consumption metering for this cluster. If enabled, a second BigQuery table will be created to hold resource consumption records. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object ConsumptionMeteringConfig {
  
  inline def apply(): ConsumptionMeteringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumptionMeteringConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsumptionMeteringConfig] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
