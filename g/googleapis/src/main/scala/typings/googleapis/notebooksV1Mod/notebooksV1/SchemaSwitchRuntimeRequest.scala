package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSwitchRuntimeRequest extends StObject {
  
  /**
    * accelerator config.
    */
  var acceleratorConfig: js.UndefOr[SchemaRuntimeAcceleratorConfig] = js.undefined
  
  /**
    * machine type.
    */
  var machineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Idempotent request UUID.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSwitchRuntimeRequest {
  
  inline def apply(): SchemaSwitchRuntimeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSwitchRuntimeRequest]
  }
  
  extension [Self <: SchemaSwitchRuntimeRequest](x: Self) {
    
    inline def setAcceleratorConfig(value: SchemaRuntimeAcceleratorConfig): Self = StObject.set(x, "acceleratorConfig", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorConfigUndefined: Self = StObject.set(x, "acceleratorConfig", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
