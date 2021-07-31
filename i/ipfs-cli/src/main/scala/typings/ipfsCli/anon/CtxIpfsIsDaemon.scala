package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtxIpfsIsDaemon extends StObject {
  
  var ctx: IpfsIsDaemon
  
  var timeout: js.Any
}
object CtxIpfsIsDaemon {
  
  @scala.inline
  def apply(ctx: IpfsIsDaemon, timeout: js.Any): CtxIpfsIsDaemon = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtxIpfsIsDaemon]
  }
  
  @scala.inline
  implicit class CtxIpfsIsDaemonMutableBuilder[Self <: CtxIpfsIsDaemon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: IpfsIsDaemon): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
