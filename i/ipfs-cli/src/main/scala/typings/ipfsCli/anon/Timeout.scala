package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timeout extends StObject {
  
  var default: js.Any
  
  var ctx: Print
  
  var peer: js.Any
  
  var timeout: js.Any
}
object Timeout {
  
  @scala.inline
  def apply(ctx: Print, default: js.Any, peer: js.Any, timeout: js.Any): Timeout = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
  
  @scala.inline
  implicit class TimeoutMutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeer(value: js.Any): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
