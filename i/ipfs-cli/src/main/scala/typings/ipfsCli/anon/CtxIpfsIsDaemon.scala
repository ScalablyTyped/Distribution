package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtxIpfsIsDaemon extends StObject {
  
  var ctx: IpfsIsDaemon
  
  var timeout: js.Any
}
object CtxIpfsIsDaemon {
  
  inline def apply(ctx: IpfsIsDaemon, timeout: js.Any): CtxIpfsIsDaemon = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtxIpfsIsDaemon]
  }
  
  extension [Self <: CtxIpfsIsDaemon](x: Self) {
    
    inline def setCtx(value: IpfsIsDaemon): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
