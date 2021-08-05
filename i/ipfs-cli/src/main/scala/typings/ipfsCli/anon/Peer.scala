package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Peer extends StObject {
  
  var cidBase: js.Any
  
  var ctx: js.Any
  
  var peer: js.Any
  
  var timeout: js.Any
}
object Peer {
  
  inline def apply(cidBase: js.Any, ctx: js.Any, peer: js.Any, timeout: js.Any): Peer = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Peer]
  }
  
  extension [Self <: Peer](x: Self) {
    
    inline def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: js.Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: js.Any): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
