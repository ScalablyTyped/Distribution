package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerId extends StObject {
  
  var ctx: Print
  
  var peerId: js.Any
  
  var timeout: js.Any
}
object PeerId {
  
  inline def apply(ctx: Print, peerId: js.Any, timeout: js.Any): PeerId = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerId]
  }
  
  extension [Self <: PeerId](x: Self) {
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setPeerId(value: js.Any): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
