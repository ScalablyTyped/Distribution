package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait All extends StObject {
  
  var all: js.Any
  
  var ctx: Print
  
  var peer: js.Any
  
  var timeout: js.Any
}
object All {
  
  inline def apply(all: js.Any, ctx: Print, peer: js.Any, timeout: js.Any): All = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
  
  extension [Self <: All](x: Self) {
    
    inline def setAll(value: js.Any): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: js.Any): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
