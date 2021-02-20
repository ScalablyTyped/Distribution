package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumptionMeteringConfig extends StObject {
  
  /** Whether to enable consumption metering for this cluster. If enabled, a second BigQuery table will be created to hold resource consumption records. */
  var enabled: js.UndefOr[Boolean] = js.native
}
object ConsumptionMeteringConfig {
  
  @scala.inline
  def apply(): ConsumptionMeteringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumptionMeteringConfig]
  }
  
  @scala.inline
  implicit class ConsumptionMeteringConfigMutableBuilder[Self <: ConsumptionMeteringConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
