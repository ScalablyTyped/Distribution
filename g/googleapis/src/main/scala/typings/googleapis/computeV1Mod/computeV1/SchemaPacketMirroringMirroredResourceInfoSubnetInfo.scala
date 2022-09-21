package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPacketMirroringMirroredResourceInfoSubnetInfo extends StObject {
  
  /**
    * [Output Only] Unique identifier for the subnetwork; defined by the server.
    */
  var canonicalUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaPacketMirroringMirroredResourceInfoSubnetInfo {
  
  inline def apply(): SchemaPacketMirroringMirroredResourceInfoSubnetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPacketMirroringMirroredResourceInfoSubnetInfo]
  }
  
  extension [Self <: SchemaPacketMirroringMirroredResourceInfoSubnetInfo](x: Self) {
    
    inline def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrlNull: Self = StObject.set(x, "canonicalUrl", null)
    
    inline def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
