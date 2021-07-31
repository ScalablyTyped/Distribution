package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic algorithm for autoscaling.
  */
trait SchemaBasicAutoscalingAlgorithm extends StObject {
  
  /**
    * Optional. Duration between scaling events. A scaling period starts after
    * the update operation from the previous event has completed.Bounds: 2m,
    * 1d. Default: 2m.
    */
  var cooldownPeriod: js.UndefOr[String] = js.undefined
  
  /**
    * Required. YARN autoscaling configuration.
    */
  var yarnConfig: js.UndefOr[SchemaBasicYarnAutoscalingConfig] = js.undefined
}
object SchemaBasicAutoscalingAlgorithm {
  
  @scala.inline
  def apply(): SchemaBasicAutoscalingAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicAutoscalingAlgorithm]
  }
  
  @scala.inline
  implicit class SchemaBasicAutoscalingAlgorithmMutableBuilder[Self <: SchemaBasicAutoscalingAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCooldownPeriod(value: String): Self = StObject.set(x, "cooldownPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldownPeriodUndefined: Self = StObject.set(x, "cooldownPeriod", js.undefined)
    
    @scala.inline
    def setYarnConfig(value: SchemaBasicYarnAutoscalingConfig): Self = StObject.set(x, "yarnConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYarnConfigUndefined: Self = StObject.set(x, "yarnConfig", js.undefined)
  }
}
