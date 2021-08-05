package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PacketMirroringMirroredResourceInfoSubnetInfo extends StObject {
  
  /** [Output Only] Unique identifier for the subnetwork; defined by the server. */
  var canonicalUrl: js.UndefOr[String] = js.undefined
  
  /** Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored. */
  var url: js.UndefOr[String] = js.undefined
}
object PacketMirroringMirroredResourceInfoSubnetInfo {
  
  inline def apply(): PacketMirroringMirroredResourceInfoSubnetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringMirroredResourceInfoSubnetInfo]
  }
  
  extension [Self <: PacketMirroringMirroredResourceInfoSubnetInfo](x: Self) {
    
    inline def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
