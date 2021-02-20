package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PacketMirroringForwardingRuleInfo extends StObject {
  
  /** [Output Only] Unique identifier for the forwarding rule; defined by the server. */
  var canonicalUrl: js.UndefOr[String] = js.native
  
  /** Resource URL to the forwarding rule representing the ILB configured as destination of the mirrored traffic. */
  var url: js.UndefOr[String] = js.native
}
object PacketMirroringForwardingRuleInfo {
  
  @scala.inline
  def apply(): PacketMirroringForwardingRuleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringForwardingRuleInfo]
  }
  
  @scala.inline
  implicit class PacketMirroringForwardingRuleInfoMutableBuilder[Self <: PacketMirroringForwardingRuleInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
