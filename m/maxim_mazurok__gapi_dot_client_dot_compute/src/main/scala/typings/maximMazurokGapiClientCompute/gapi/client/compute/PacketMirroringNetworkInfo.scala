package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PacketMirroringNetworkInfo extends StObject {
  
  /** [Output Only] Unique identifier for the network; defined by the server. */
  var canonicalUrl: js.UndefOr[String] = js.undefined
  
  /** URL of the network resource. */
  var url: js.UndefOr[String] = js.undefined
}
object PacketMirroringNetworkInfo {
  
  inline def apply(): PacketMirroringNetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringNetworkInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PacketMirroringNetworkInfo] (val x: Self) extends AnyVal {
    
    inline def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
