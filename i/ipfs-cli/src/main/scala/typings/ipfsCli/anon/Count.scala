package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  var count: js.Any
  
  var ctx: Print
  
  var peerId: js.Any
  
  var timeout: js.Any
}
object Count {
  
  inline def apply(count: js.Any, ctx: Print, peerId: js.Any, timeout: js.Any): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: js.Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setPeerId(value: js.Any): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
