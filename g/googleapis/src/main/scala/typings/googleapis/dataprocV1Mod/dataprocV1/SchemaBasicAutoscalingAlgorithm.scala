package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBasicAutoscalingAlgorithm extends StObject {
  
  /**
    * Optional. Duration between scaling events. A scaling period starts after the update operation from the previous event has completed.Bounds: 2m, 1d. Default: 2m.
    */
  var cooldownPeriod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Spark Standalone autoscaling configuration
    */
  var sparkStandaloneConfig: js.UndefOr[SchemaSparkStandaloneAutoscalingConfig] = js.undefined
  
  /**
    * Optional. YARN autoscaling configuration.
    */
  var yarnConfig: js.UndefOr[SchemaBasicYarnAutoscalingConfig] = js.undefined
}
object SchemaBasicAutoscalingAlgorithm {
  
  inline def apply(): SchemaBasicAutoscalingAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicAutoscalingAlgorithm]
  }
  
  extension [Self <: SchemaBasicAutoscalingAlgorithm](x: Self) {
    
    inline def setCooldownPeriod(value: String): Self = StObject.set(x, "cooldownPeriod", value.asInstanceOf[js.Any])
    
    inline def setCooldownPeriodNull: Self = StObject.set(x, "cooldownPeriod", null)
    
    inline def setCooldownPeriodUndefined: Self = StObject.set(x, "cooldownPeriod", js.undefined)
    
    inline def setSparkStandaloneConfig(value: SchemaSparkStandaloneAutoscalingConfig): Self = StObject.set(x, "sparkStandaloneConfig", value.asInstanceOf[js.Any])
    
    inline def setSparkStandaloneConfigUndefined: Self = StObject.set(x, "sparkStandaloneConfig", js.undefined)
    
    inline def setYarnConfig(value: SchemaBasicYarnAutoscalingConfig): Self = StObject.set(x, "yarnConfig", value.asInstanceOf[js.Any])
    
    inline def setYarnConfigUndefined: Self = StObject.set(x, "yarnConfig", js.undefined)
  }
}
