package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtxIpfsAny extends StObject {
  
  var ctx: IpfsAny
  
  var timeout: js.Any
}
object CtxIpfsAny {
  
  @scala.inline
  def apply(ctx: IpfsAny, timeout: js.Any): CtxIpfsAny = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtxIpfsAny]
  }
  
  @scala.inline
  implicit class CtxIpfsAnyMutableBuilder[Self <: CtxIpfsAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: IpfsAny): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
