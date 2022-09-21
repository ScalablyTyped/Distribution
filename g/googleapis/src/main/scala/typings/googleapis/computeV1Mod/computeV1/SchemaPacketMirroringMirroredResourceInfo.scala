package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPacketMirroringMirroredResourceInfo extends StObject {
  
  /**
    * A set of virtual machine instances that are being mirrored. They must live in zones contained in the same region as this packetMirroring. Note that this config will apply only to those network interfaces of the Instances that belong to the network specified in this packetMirroring. You may specify a maximum of 50 Instances.
    */
  var instances: js.UndefOr[js.Array[SchemaPacketMirroringMirroredResourceInfoInstanceInfo]] = js.undefined
  
  /**
    * A set of subnetworks for which traffic from/to all VM instances will be mirrored. They must live in the same region as this packetMirroring. You may specify a maximum of 5 subnetworks.
    */
  var subnetworks: js.UndefOr[js.Array[SchemaPacketMirroringMirroredResourceInfoSubnetInfo]] = js.undefined
  
  /**
    * A set of mirrored tags. Traffic from/to all VM instances that have one or more of these tags will be mirrored.
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPacketMirroringMirroredResourceInfo {
  
  inline def apply(): SchemaPacketMirroringMirroredResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPacketMirroringMirroredResourceInfo]
  }
  
  extension [Self <: SchemaPacketMirroringMirroredResourceInfo](x: Self) {
    
    inline def setInstances(value: js.Array[SchemaPacketMirroringMirroredResourceInfoInstanceInfo]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: SchemaPacketMirroringMirroredResourceInfoInstanceInfo*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setSubnetworks(value: js.Array[SchemaPacketMirroringMirroredResourceInfoSubnetInfo]): Self = StObject.set(x, "subnetworks", value.asInstanceOf[js.Any])
    
    inline def setSubnetworksUndefined: Self = StObject.set(x, "subnetworks", js.undefined)
    
    inline def setSubnetworksVarargs(value: SchemaPacketMirroringMirroredResourceInfoSubnetInfo*): Self = StObject.set(x, "subnetworks", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
