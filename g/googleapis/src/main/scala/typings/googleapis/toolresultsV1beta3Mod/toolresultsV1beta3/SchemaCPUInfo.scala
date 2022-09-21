package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCPUInfo extends StObject {
  
  /**
    * description of the device processor ie '1.8 GHz hexa core 64-bit ARMv8-A'
    */
  var cpuProcessor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * the CPU clock speed in GHz
    */
  var cpuSpeedInGhz: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * the number of CPU cores
    */
  var numberOfCores: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCPUInfo {
  
  inline def apply(): SchemaCPUInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCPUInfo]
  }
  
  extension [Self <: SchemaCPUInfo](x: Self) {
    
    inline def setCpuProcessor(value: String): Self = StObject.set(x, "cpuProcessor", value.asInstanceOf[js.Any])
    
    inline def setCpuProcessorNull: Self = StObject.set(x, "cpuProcessor", null)
    
    inline def setCpuProcessorUndefined: Self = StObject.set(x, "cpuProcessor", js.undefined)
    
    inline def setCpuSpeedInGhz(value: Double): Self = StObject.set(x, "cpuSpeedInGhz", value.asInstanceOf[js.Any])
    
    inline def setCpuSpeedInGhzNull: Self = StObject.set(x, "cpuSpeedInGhz", null)
    
    inline def setCpuSpeedInGhzUndefined: Self = StObject.set(x, "cpuSpeedInGhz", js.undefined)
    
    inline def setNumberOfCores(value: Double): Self = StObject.set(x, "numberOfCores", value.asInstanceOf[js.Any])
    
    inline def setNumberOfCoresNull: Self = StObject.set(x, "numberOfCores", null)
    
    inline def setNumberOfCoresUndefined: Self = StObject.set(x, "numberOfCores", js.undefined)
  }
}
