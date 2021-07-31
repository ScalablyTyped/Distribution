package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PacketMirroringFilter extends StObject {
  
  /**
    * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor
    * IPProtocols is specified, all traffic is mirrored.
    */
  var IPProtocols: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * IP CIDR ranges that apply as filter on the source (ingress) or destination (egress) IP in the IP header. Only IPv4 is supported. If no ranges are specified, all traffic that matches
    * the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
    */
  var cidrRanges: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH. */
  var direction: js.UndefOr[String] = js.undefined
}
object PacketMirroringFilter {
  
  @scala.inline
  def apply(): PacketMirroringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringFilter]
  }
  
  @scala.inline
  implicit class PacketMirroringFilterMutableBuilder[Self <: PacketMirroringFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrRanges(value: js.Array[String]): Self = StObject.set(x, "cidrRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrRangesUndefined: Self = StObject.set(x, "cidrRanges", js.undefined)
    
    @scala.inline
    def setCidrRangesVarargs(value: String*): Self = StObject.set(x, "cidrRanges", js.Array(value :_*))
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setIPProtocols(value: js.Array[String]): Self = StObject.set(x, "IPProtocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPProtocolsUndefined: Self = StObject.set(x, "IPProtocols", js.undefined)
    
    @scala.inline
    def setIPProtocolsVarargs(value: String*): Self = StObject.set(x, "IPProtocols", js.Array(value :_*))
  }
}
