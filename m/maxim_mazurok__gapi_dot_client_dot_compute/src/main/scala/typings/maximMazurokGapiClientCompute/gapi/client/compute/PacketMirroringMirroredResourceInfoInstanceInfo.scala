package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PacketMirroringMirroredResourceInfoInstanceInfo extends StObject {
  
  /** [Output Only] Unique identifier for the instance; defined by the server. */
  var canonicalUrl: js.UndefOr[String] = js.native
  
  /** Resource URL to the virtual machine instance which is being mirrored. */
  var url: js.UndefOr[String] = js.native
}
object PacketMirroringMirroredResourceInfoInstanceInfo {
  
  @scala.inline
  def apply(): PacketMirroringMirroredResourceInfoInstanceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketMirroringMirroredResourceInfoInstanceInfo]
  }
  
  @scala.inline
  implicit class PacketMirroringMirroredResourceInfoInstanceInfoMutableBuilder[Self <: PacketMirroringMirroredResourceInfoInstanceInfo] (val x: Self) extends AnyVal {
    
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
