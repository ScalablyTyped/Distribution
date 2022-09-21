package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRuntime extends StObject {
  
  /**
    * The config settings for accessing runtime.
    */
  var accessConfig: js.UndefOr[SchemaRuntimeAccessConfig] = js.undefined
  
  /**
    * Output only. Runtime creation time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Runtime health_state.
    */
  var healthState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Contains Runtime daemon metrics such as Service status and JupyterLab stats.
    */
  var metrics: js.UndefOr[SchemaRuntimeMetrics] = js.undefined
  
  /**
    * Output only. The resource name of the runtime. Format: `projects/{project\}/locations/{location\}/runtimes/{runtimeId\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The config settings for software inside the runtime.
    */
  var softwareConfig: js.UndefOr[SchemaRuntimeSoftwareConfig] = js.undefined
  
  /**
    * Output only. Runtime state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Runtime update time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Use a Compute Engine VM image to start the managed notebook instance.
    */
  var virtualMachine: js.UndefOr[SchemaVirtualMachine] = js.undefined
}
object SchemaRuntime {
  
  inline def apply(): SchemaRuntime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntime]
  }
  
  extension [Self <: SchemaRuntime](x: Self) {
    
    inline def setAccessConfig(value: SchemaRuntimeAccessConfig): Self = StObject.set(x, "accessConfig", value.asInstanceOf[js.Any])
    
    inline def setAccessConfigUndefined: Self = StObject.set(x, "accessConfig", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setHealthState(value: String): Self = StObject.set(x, "healthState", value.asInstanceOf[js.Any])
    
    inline def setHealthStateNull: Self = StObject.set(x, "healthState", null)
    
    inline def setHealthStateUndefined: Self = StObject.set(x, "healthState", js.undefined)
    
    inline def setMetrics(value: SchemaRuntimeMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSoftwareConfig(value: SchemaRuntimeSoftwareConfig): Self = StObject.set(x, "softwareConfig", value.asInstanceOf[js.Any])
    
    inline def setSoftwareConfigUndefined: Self = StObject.set(x, "softwareConfig", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVirtualMachine(value: SchemaVirtualMachine): Self = StObject.set(x, "virtualMachine", value.asInstanceOf[js.Any])
    
    inline def setVirtualMachineUndefined: Self = StObject.set(x, "virtualMachine", js.undefined)
  }
}
