package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PacketMirroringForwardingRuleInfo extends StObject {
  
  /** [Output Only] Unique identifier for the forwarding rule; defined by the server. */
  var canonicalUrl: js.UndefOr[String] = js.undefined
  
  /** Resource URL to the forwarding rule representing the ILB configured as destination of the mirrored traffic. */
  var url: js.UndefOr[String] = js.undefined
}
object PacketMirroringForwardingRuleInfo {
  
  inline def apply(): PacketMirroringForwardingRuleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringForwardingRuleInfo]
  }
  
  extension [Self <: PacketMirroringForwardingRuleInfo](x: Self) {
    
    inline def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
