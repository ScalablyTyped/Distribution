package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtxName extends StObject {
  
  var ctx: Print
  
  var name: js.Any
  
  var timeout: js.Any
}
object CtxName {
  
  @scala.inline
  def apply(ctx: Print, name: js.Any, timeout: js.Any): CtxName = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtxName]
  }
  
  @scala.inline
  implicit class CtxNameMutableBuilder[Self <: CtxName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
