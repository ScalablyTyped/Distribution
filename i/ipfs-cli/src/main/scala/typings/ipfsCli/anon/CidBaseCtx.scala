package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidBaseCtx extends StObject {
  
  var cidBase: js.Any
  
  var ctx: Print
  
  var key: js.Any
  
  var timeout: js.Any
}
object CidBaseCtx {
  
  @scala.inline
  def apply(cidBase: js.Any, ctx: Print, key: js.Any, timeout: js.Any): CidBaseCtx = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidBaseCtx]
  }
  
  @scala.inline
  implicit class CidBaseCtxMutableBuilder[Self <: CidBaseCtx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
