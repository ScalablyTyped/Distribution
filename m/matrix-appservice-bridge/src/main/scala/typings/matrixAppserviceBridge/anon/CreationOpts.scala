package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.remoteMod.RemoteRoom
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreationOpts extends StObject {
  
  var creationOpts: js.UndefOr[Record[String, Any]] = js.undefined
  
  var remote: js.UndefOr[RemoteRoom] = js.undefined
  
  var roomId: js.UndefOr[String] = js.undefined
}
object CreationOpts {
  
  inline def apply(): CreationOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreationOpts]
  }
  
  extension [Self <: CreationOpts](x: Self) {
    
    inline def setCreationOpts(value: Record[String, Any]): Self = StObject.set(x, "creationOpts", value.asInstanceOf[js.Any])
    
    inline def setCreationOptsUndefined: Self = StObject.set(x, "creationOpts", js.undefined)
    
    inline def setRemote(value: RemoteRoom): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
    
    inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    
    inline def setRoomIdUndefined: Self = StObject.set(x, "roomId", js.undefined)
  }
}
