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
  
  @scala.inline
  def apply(): PacketMirroringNetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringNetworkInfo]
  }
  
  @scala.inline
  implicit class PacketMirroringNetworkInfoMutableBuilder[Self <: PacketMirroringNetworkInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
