package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PacketMirroringFilter extends js.Object {
  
  /**
    * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor
    * IPProtocols is specified, all traffic is mirrored.
    */
  var IPProtocols: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * IP CIDR ranges that apply as filter on the source (ingress) or destination (egress) IP in the IP header. Only IPv4 is supported. If no ranges are specified, all traffic that matches
    * the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
    */
  var cidrRanges: js.UndefOr[js.Array[String]] = js.native
  
  /** Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH. */
  var direction: js.UndefOr[String] = js.native
}
object PacketMirroringFilter {
  
  @scala.inline
  def apply(): PacketMirroringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringFilter]
  }
  
  @scala.inline
  implicit class PacketMirroringFilterOps[Self <: PacketMirroringFilter] (val x: Self) extends AnyVal {
    
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
    def setIPProtocolsVarargs(value: String*): Self = this.set("IPProtocols", js.Array(value :_*))
    
    @scala.inline
    def setIPProtocols(value: js.Array[String]): Self = this.set("IPProtocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPProtocols: Self = this.set("IPProtocols", js.undefined)
    
    @scala.inline
    def setCidrRangesVarargs(value: String*): Self = this.set("cidrRanges", js.Array(value :_*))
    
    @scala.inline
    def setCidrRanges(value: js.Array[String]): Self = this.set("cidrRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrRanges: Self = this.set("cidrRanges", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
  }
}
