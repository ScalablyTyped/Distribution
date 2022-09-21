package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPerfEnvironment extends StObject {
  
  /**
    * CPU related environment info
    */
  var cpuInfo: js.UndefOr[SchemaCPUInfo] = js.undefined
  
  /**
    * Memory related environment info
    */
  var memoryInfo: js.UndefOr[SchemaMemoryInfo] = js.undefined
}
object SchemaPerfEnvironment {
  
  inline def apply(): SchemaPerfEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerfEnvironment]
  }
  
  extension [Self <: SchemaPerfEnvironment](x: Self) {
    
    inline def setCpuInfo(value: SchemaCPUInfo): Self = StObject.set(x, "cpuInfo", value.asInstanceOf[js.Any])
    
    inline def setCpuInfoUndefined: Self = StObject.set(x, "cpuInfo", js.undefined)
    
    inline def setMemoryInfo(value: SchemaMemoryInfo): Self = StObject.set(x, "memoryInfo", value.asInstanceOf[js.Any])
    
    inline def setMemoryInfoUndefined: Self = StObject.set(x, "memoryInfo", js.undefined)
  }
}
