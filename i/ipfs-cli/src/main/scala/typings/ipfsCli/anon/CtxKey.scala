package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtxKey extends StObject {
  
  var ctx: Print
  
  var key: js.Any
  
  var timeout: js.Any
}
object CtxKey {
  
  @scala.inline
  def apply(ctx: Print, key: js.Any, timeout: js.Any): CtxKey = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtxKey]
  }
  
  @scala.inline
  implicit class CtxKeyMutableBuilder[Self <: CtxKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
