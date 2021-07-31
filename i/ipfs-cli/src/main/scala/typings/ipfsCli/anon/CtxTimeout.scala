package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtxTimeout extends StObject {
  
  var ctx: Print
  
  var timeout: js.Any
}
object CtxTimeout {
  
  @scala.inline
  def apply(ctx: Print, timeout: js.Any): CtxTimeout = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtxTimeout]
  }
  
  @scala.inline
  implicit class CtxTimeoutMutableBuilder[Self <: CtxTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
