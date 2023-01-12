package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostProto extends StObject {
  
  /** Lower-case, fully qualified hostname. */
  var hostName: js.UndefOr[String] = js.undefined
  
  /**
    * If present, then any checks that compare this Principal to LOAS peer info must confirm the peer's machine owner is equal to 'host_owner'. If absent, then any peer machine owner is
    * acceptable.
    */
  var hostOwner: js.UndefOr[String] = js.undefined
}
object HostProto {
  
  inline def apply(): HostProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostProto] (val x: Self) extends AnyVal {
    
    inline def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    inline def setHostNameUndefined: Self = StObject.set(x, "hostName", js.undefined)
    
    inline def setHostOwner(value: String): Self = StObject.set(x, "hostOwner", value.asInstanceOf[js.Any])
    
    inline def setHostOwnerUndefined: Self = StObject.set(x, "hostOwner", js.undefined)
  }
}
