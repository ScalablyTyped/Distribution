package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PacketMirroringMirroredResourceInfo extends js.Object {
  
  /**
    * A set of virtual machine instances that are being mirrored. They must live in zones contained in the same region as this packetMirroring.
    *
    * Note that this config will apply only to those network interfaces of the Instances that belong to the network specified in this packetMirroring.
    *
    * You may specify a maximum of 50 Instances.
    */
  var instances: js.UndefOr[js.Array[PacketMirroringMirroredResourceInfoInstanceInfo]] = js.native
  
  /**
    * A set of subnetworks for which traffic from/to all VM instances will be mirrored. They must live in the same region as this packetMirroring.
    *
    * You may specify a maximum of 5 subnetworks.
    */
  var subnetworks: js.UndefOr[js.Array[PacketMirroringMirroredResourceInfoSubnetInfo]] = js.native
  
  /** A set of mirrored tags. Traffic from/to all VM instances that have one or more of these tags will be mirrored. */
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object PacketMirroringMirroredResourceInfo {
  
  @scala.inline
  def apply(): PacketMirroringMirroredResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringMirroredResourceInfo]
  }
  
  @scala.inline
  implicit class PacketMirroringMirroredResourceInfoOps[Self <: PacketMirroringMirroredResourceInfo] (val x: Self) extends AnyVal {
    
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
    def setInstancesVarargs(value: PacketMirroringMirroredResourceInfoInstanceInfo*): Self = this.set("instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: js.Array[PacketMirroringMirroredResourceInfoInstanceInfo]): Self = this.set("instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    
    @scala.inline
    def setSubnetworksVarargs(value: PacketMirroringMirroredResourceInfoSubnetInfo*): Self = this.set("subnetworks", js.Array(value :_*))
    
    @scala.inline
    def setSubnetworks(value: js.Array[PacketMirroringMirroredResourceInfoSubnetInfo]): Self = this.set("subnetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetworks: Self = this.set("subnetworks", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
