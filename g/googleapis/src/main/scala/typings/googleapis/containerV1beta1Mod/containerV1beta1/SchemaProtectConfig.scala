package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProtectConfig extends StObject {
  
  /**
    * WorkloadConfig defines which actions are enabled for a cluster's workload configurations.
    */
  var workloadConfig: js.UndefOr[SchemaWorkloadConfig] = js.undefined
}
object SchemaProtectConfig {
  
  inline def apply(): SchemaProtectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProtectConfig]
  }
  
  extension [Self <: SchemaProtectConfig](x: Self) {
    
    inline def setWorkloadConfig(value: SchemaWorkloadConfig): Self = StObject.set(x, "workloadConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkloadConfigUndefined: Self = StObject.set(x, "workloadConfig", js.undefined)
  }
}
