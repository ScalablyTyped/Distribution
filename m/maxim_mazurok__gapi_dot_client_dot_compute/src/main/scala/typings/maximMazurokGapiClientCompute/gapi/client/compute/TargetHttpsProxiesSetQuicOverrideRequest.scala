package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHttpsProxiesSetQuicOverrideRequest extends StObject {
  
  /** QUIC policy for the TargetHttpsProxy resource. */
  var quicOverride: js.UndefOr[String] = js.native
}
object TargetHttpsProxiesSetQuicOverrideRequest {
  
  @scala.inline
  def apply(): TargetHttpsProxiesSetQuicOverrideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHttpsProxiesSetQuicOverrideRequest]
  }
  
  @scala.inline
  implicit class TargetHttpsProxiesSetQuicOverrideRequestMutableBuilder[Self <: TargetHttpsProxiesSetQuicOverrideRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuicOverride(value: String): Self = StObject.set(x, "quicOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuicOverrideUndefined: Self = StObject.set(x, "quicOverride", js.undefined)
  }
}
