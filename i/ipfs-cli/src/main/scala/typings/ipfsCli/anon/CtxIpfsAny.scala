package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtxIpfsAny extends StObject {
  
  var ctx: IpfsAny
  
  var timeout: js.Any
}
object CtxIpfsAny {
  
  inline def apply(ctx: IpfsAny, timeout: js.Any): CtxIpfsAny = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtxIpfsAny]
  }
  
  extension [Self <: CtxIpfsAny](x: Self) {
    
    inline def setCtx(value: IpfsAny): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
