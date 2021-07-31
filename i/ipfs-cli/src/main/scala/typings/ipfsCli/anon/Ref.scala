package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var ctx: Print
  
  var ref: js.Any
  
  var timeout: js.Any
}
object Ref {
  
  @scala.inline
  def apply(ctx: Print, ref: js.Any, timeout: js.Any): Ref = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit class RefMutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: js.Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
