package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCPUInfo extends StObject {
  
  /**
    * description of the device processor ie &#39;1.8 GHz hexa core 64-bit
    * ARMv8-A&#39;
    */
  var cpuProcessor: js.UndefOr[String] = js.undefined
  
  /**
    * the CPU clock speed in GHz
    */
  var cpuSpeedInGhz: js.UndefOr[Double] = js.undefined
  
  /**
    * the number of CPU cores
    */
  var numberOfCores: js.UndefOr[Double] = js.undefined
}
object SchemaCPUInfo {
  
  @scala.inline
  def apply(): SchemaCPUInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCPUInfo]
  }
  
  @scala.inline
  implicit class SchemaCPUInfoMutableBuilder[Self <: SchemaCPUInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuProcessor(value: String): Self = StObject.set(x, "cpuProcessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuProcessorUndefined: Self = StObject.set(x, "cpuProcessor", js.undefined)
    
    @scala.inline
    def setCpuSpeedInGhz(value: Double): Self = StObject.set(x, "cpuSpeedInGhz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuSpeedInGhzUndefined: Self = StObject.set(x, "cpuSpeedInGhz", js.undefined)
    
    @scala.inline
    def setNumberOfCores(value: Double): Self = StObject.set(x, "numberOfCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfCoresUndefined: Self = StObject.set(x, "numberOfCores", js.undefined)
  }
}
