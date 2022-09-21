package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InviteSignUrl extends StObject {
  
  // True to do a room initial sync on the resulting room. If false, the returned Room object will have no current state. Default: true.
  var inviteSignUrl: js.UndefOr[Boolean] = js.undefined
  
  var syncRoom: js.UndefOr[Boolean] = js.undefined
  
  // If the caller has a keypair 3pid invite, the signing URL is passed in this parameter.
  var viaServers: js.UndefOr[js.Array[String]] = js.undefined
}
object InviteSignUrl {
  
  inline def apply(): InviteSignUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteSignUrl]
  }
  
  extension [Self <: InviteSignUrl](x: Self) {
    
    inline def setInviteSignUrl(value: Boolean): Self = StObject.set(x, "inviteSignUrl", value.asInstanceOf[js.Any])
    
    inline def setInviteSignUrlUndefined: Self = StObject.set(x, "inviteSignUrl", js.undefined)
    
    inline def setSyncRoom(value: Boolean): Self = StObject.set(x, "syncRoom", value.asInstanceOf[js.Any])
    
    inline def setSyncRoomUndefined: Self = StObject.set(x, "syncRoom", js.undefined)
    
    inline def setViaServers(value: js.Array[String]): Self = StObject.set(x, "viaServers", value.asInstanceOf[js.Any])
    
    inline def setViaServersUndefined: Self = StObject.set(x, "viaServers", js.undefined)
    
    inline def setViaServersVarargs(value: String*): Self = StObject.set(x, "viaServers", js.Array(value*))
  }
}
