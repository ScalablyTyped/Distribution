package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicAutoscalingAlgorithm extends StObject {
  
  /** Optional. Duration between scaling events. A scaling period starts after the update operation from the previous event has completed.Bounds: 2m, 1d. Default: 2m. */
  var cooldownPeriod: js.UndefOr[String] = js.undefined
  
  /** Optional. Spark Standalone autoscaling configuration */
  var sparkStandaloneConfig: js.UndefOr[SparkStandaloneAutoscalingConfig] = js.undefined
  
  /** Optional. YARN autoscaling configuration. */
  var yarnConfig: js.UndefOr[BasicYarnAutoscalingConfig] = js.undefined
}
object BasicAutoscalingAlgorithm {
  
  inline def apply(): BasicAutoscalingAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicAutoscalingAlgorithm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasicAutoscalingAlgorithm] (val x: Self) extends AnyVal {
    
    inline def setCooldownPeriod(value: String): Self = StObject.set(x, "cooldownPeriod", value.asInstanceOf[js.Any])
    
    inline def setCooldownPeriodUndefined: Self = StObject.set(x, "cooldownPeriod", js.undefined)
    
    inline def setSparkStandaloneConfig(value: SparkStandaloneAutoscalingConfig): Self = StObject.set(x, "sparkStandaloneConfig", value.asInstanceOf[js.Any])
    
    inline def setSparkStandaloneConfigUndefined: Self = StObject.set(x, "sparkStandaloneConfig", js.undefined)
    
    inline def setYarnConfig(value: BasicYarnAutoscalingConfig): Self = StObject.set(x, "yarnConfig", value.asInstanceOf[js.Any])
    
    inline def setYarnConfigUndefined: Self = StObject.set(x, "yarnConfig", js.undefined)
  }
}
