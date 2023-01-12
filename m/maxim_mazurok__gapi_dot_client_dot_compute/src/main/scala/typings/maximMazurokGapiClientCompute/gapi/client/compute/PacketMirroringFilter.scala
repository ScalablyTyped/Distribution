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
  
  inline def apply(): PacketMirroringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PacketMirroringFilter] (val x: Self) extends AnyVal {
    
    inline def setCidrRanges(value: js.Array[String]): Self = StObject.set(x, "cidrRanges", value.asInstanceOf[js.Any])
    
    inline def setCidrRangesUndefined: Self = StObject.set(x, "cidrRanges", js.undefined)
    
    inline def setCidrRangesVarargs(value: String*): Self = StObject.set(x, "cidrRanges", js.Array(value*))
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setIPProtocols(value: js.Array[String]): Self = StObject.set(x, "IPProtocols", value.asInstanceOf[js.Any])
    
    inline def setIPProtocolsUndefined: Self = StObject.set(x, "IPProtocols", js.undefined)
    
    inline def setIPProtocolsVarargs(value: String*): Self = StObject.set(x, "IPProtocols", js.Array(value*))
  }
}
