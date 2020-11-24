package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHttpsProxiesSetQuicOverrideRequest extends js.Object {
  
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
  implicit class TargetHttpsProxiesSetQuicOverrideRequestOps[Self <: TargetHttpsProxiesSetQuicOverrideRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQuicOverride(value: String): Self = this.set("quicOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuicOverride: Self = this.set("quicOverride", js.undefined)
  }
}
