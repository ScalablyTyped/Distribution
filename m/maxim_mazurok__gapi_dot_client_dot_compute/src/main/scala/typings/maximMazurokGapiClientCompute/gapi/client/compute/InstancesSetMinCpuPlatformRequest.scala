package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesSetMinCpuPlatformRequest extends StObject {
  
  /** Minimum cpu/platform this instance should be started at. */
  var minCpuPlatform: js.UndefOr[String] = js.undefined
}
object InstancesSetMinCpuPlatformRequest {
  
  inline def apply(): InstancesSetMinCpuPlatformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesSetMinCpuPlatformRequest]
  }
  
  extension [Self <: InstancesSetMinCpuPlatformRequest](x: Self) {
    
    inline def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
  }
}
