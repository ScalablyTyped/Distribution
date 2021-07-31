package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PacketMirroringMirroredResourceInfo extends StObject {
  
  /**
    * A set of virtual machine instances that are being mirrored. They must live in zones contained in the same region as this packetMirroring.
    *
    * Note that this config will apply only to those network interfaces of the Instances that belong to the network specified in this packetMirroring.
    *
    * You may specify a maximum of 50 Instances.
    */
  var instances: js.UndefOr[js.Array[PacketMirroringMirroredResourceInfoInstanceInfo]] = js.undefined
  
  /**
    * A set of subnetworks for which traffic from/to all VM instances will be mirrored. They must live in the same region as this packetMirroring.
    *
    * You may specify a maximum of 5 subnetworks.
    */
  var subnetworks: js.UndefOr[js.Array[PacketMirroringMirroredResourceInfoSubnetInfo]] = js.undefined
  
  /** A set of mirrored tags. Traffic from/to all VM instances that have one or more of these tags will be mirrored. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object PacketMirroringMirroredResourceInfo {
  
  @scala.inline
  def apply(): PacketMirroringMirroredResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringMirroredResourceInfo]
  }
  
  @scala.inline
  implicit class PacketMirroringMirroredResourceInfoMutableBuilder[Self <: PacketMirroringMirroredResourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[PacketMirroringMirroredResourceInfoInstanceInfo]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: PacketMirroringMirroredResourceInfoInstanceInfo*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setSubnetworks(value: js.Array[PacketMirroringMirroredResourceInfoSubnetInfo]): Self = StObject.set(x, "subnetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworksUndefined: Self = StObject.set(x, "subnetworks", js.undefined)
    
    @scala.inline
    def setSubnetworksVarargs(value: PacketMirroringMirroredResourceInfoSubnetInfo*): Self = StObject.set(x, "subnetworks", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
