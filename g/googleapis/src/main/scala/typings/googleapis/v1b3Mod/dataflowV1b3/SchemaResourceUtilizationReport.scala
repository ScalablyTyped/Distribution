package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceUtilizationReport extends StObject {
  
  /**
    * Per container information. Key: container name.
    */
  var containers: js.UndefOr[StringDictionary[SchemaResourceUtilizationReport] | Null] = js.undefined
  
  /**
    * CPU utilization samples.
    */
  var cpuTime: js.UndefOr[js.Array[SchemaCPUTime]] = js.undefined
  
  /**
    * Memory utilization samples.
    */
  var memoryInfo: js.UndefOr[js.Array[SchemaMemInfo]] = js.undefined
}
object SchemaResourceUtilizationReport {
  
  inline def apply(): SchemaResourceUtilizationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceUtilizationReport]
  }
  
  extension [Self <: SchemaResourceUtilizationReport](x: Self) {
    
    inline def setContainers(value: StringDictionary[SchemaResourceUtilizationReport]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersNull: Self = StObject.set(x, "containers", null)
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setCpuTime(value: js.Array[SchemaCPUTime]): Self = StObject.set(x, "cpuTime", value.asInstanceOf[js.Any])
    
    inline def setCpuTimeUndefined: Self = StObject.set(x, "cpuTime", js.undefined)
    
    inline def setCpuTimeVarargs(value: SchemaCPUTime*): Self = StObject.set(x, "cpuTime", js.Array(value*))
    
    inline def setMemoryInfo(value: js.Array[SchemaMemInfo]): Self = StObject.set(x, "memoryInfo", value.asInstanceOf[js.Any])
    
    inline def setMemoryInfoUndefined: Self = StObject.set(x, "memoryInfo", js.undefined)
    
    inline def setMemoryInfoVarargs(value: SchemaMemInfo*): Self = StObject.set(x, "memoryInfo", js.Array(value*))
  }
}
