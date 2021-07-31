package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesSetMinCpuPlatformRequest extends StObject {
  
  /** Minimum cpu/platform this instance should be started at. */
  var minCpuPlatform: js.UndefOr[String] = js.undefined
}
object InstancesSetMinCpuPlatformRequest {
  
  @scala.inline
  def apply(): InstancesSetMinCpuPlatformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesSetMinCpuPlatformRequest]
  }
  
  @scala.inline
  implicit class InstancesSetMinCpuPlatformRequestMutableBuilder[Self <: InstancesSetMinCpuPlatformRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
  }
}
