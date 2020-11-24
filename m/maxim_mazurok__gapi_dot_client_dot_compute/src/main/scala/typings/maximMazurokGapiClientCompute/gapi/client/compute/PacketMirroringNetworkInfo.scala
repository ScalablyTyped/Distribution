package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PacketMirroringNetworkInfo extends js.Object {
  
  /** [Output Only] Unique identifier for the network; defined by the server. */
  var canonicalUrl: js.UndefOr[String] = js.native
  
  /** URL of the network resource. */
  var url: js.UndefOr[String] = js.native
}
object PacketMirroringNetworkInfo {
  
  @scala.inline
  def apply(): PacketMirroringNetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringNetworkInfo]
  }
  
  @scala.inline
  implicit class PacketMirroringNetworkInfoOps[Self <: PacketMirroringNetworkInfo] (val x: Self) extends AnyVal {
    
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
