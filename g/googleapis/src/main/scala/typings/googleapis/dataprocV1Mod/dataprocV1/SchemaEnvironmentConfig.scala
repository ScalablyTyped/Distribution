package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvironmentConfig extends StObject {
  
  /**
    * Optional. Execution configuration for a workload.
    */
  var executionConfig: js.UndefOr[SchemaExecutionConfig] = js.undefined
  
  /**
    * Optional. Peripherals configuration that workload has access to.
    */
  var peripheralsConfig: js.UndefOr[SchemaPeripheralsConfig] = js.undefined
}
object SchemaEnvironmentConfig {
  
  inline def apply(): SchemaEnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironmentConfig]
  }
  
  extension [Self <: SchemaEnvironmentConfig](x: Self) {
    
    inline def setExecutionConfig(value: SchemaExecutionConfig): Self = StObject.set(x, "executionConfig", value.asInstanceOf[js.Any])
    
    inline def setExecutionConfigUndefined: Self = StObject.set(x, "executionConfig", js.undefined)
    
    inline def setPeripheralsConfig(value: SchemaPeripheralsConfig): Self = StObject.set(x, "peripheralsConfig", value.asInstanceOf[js.Any])
    
    inline def setPeripheralsConfigUndefined: Self = StObject.set(x, "peripheralsConfig", js.undefined)
  }
}
