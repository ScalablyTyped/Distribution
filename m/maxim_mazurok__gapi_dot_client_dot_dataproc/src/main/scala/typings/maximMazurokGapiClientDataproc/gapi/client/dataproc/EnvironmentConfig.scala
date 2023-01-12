package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentConfig extends StObject {
  
  /** Optional. Execution configuration for a workload. */
  var executionConfig: js.UndefOr[ExecutionConfig] = js.undefined
  
  /** Optional. Peripherals configuration that workload has access to. */
  var peripheralsConfig: js.UndefOr[PeripheralsConfig] = js.undefined
}
object EnvironmentConfig {
  
  inline def apply(): EnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentConfig] (val x: Self) extends AnyVal {
    
    inline def setExecutionConfig(value: ExecutionConfig): Self = StObject.set(x, "executionConfig", value.asInstanceOf[js.Any])
    
    inline def setExecutionConfigUndefined: Self = StObject.set(x, "executionConfig", js.undefined)
    
    inline def setPeripheralsConfig(value: PeripheralsConfig): Self = StObject.set(x, "peripheralsConfig", value.asInstanceOf[js.Any])
    
    inline def setPeripheralsConfigUndefined: Self = StObject.set(x, "peripheralsConfig", js.undefined)
  }
}
