package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PacketMirroringMirroredResourceInfoSubnetInfo extends js.Object {
  
  /** [Output Only] Unique identifier for the subnetwork; defined by the server. */
  var canonicalUrl: js.UndefOr[String] = js.native
  
  /** Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored. */
  var url: js.UndefOr[String] = js.native
}
object PacketMirroringMirroredResourceInfoSubnetInfo {
  
  @scala.inline
  def apply(): PacketMirroringMirroredResourceInfoSubnetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringMirroredResourceInfoSubnetInfo]
  }
  
  @scala.inline
  implicit class PacketMirroringMirroredResourceInfoSubnetInfoOps[Self <: PacketMirroringMirroredResourceInfoSubnetInfo] (val x: Self) extends AnyVal {
    
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
    def setCanonicalUrl(value: String): Self = this.set("canonicalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonicalUrl: Self = this.set("canonicalUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
