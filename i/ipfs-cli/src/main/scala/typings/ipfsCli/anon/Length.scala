package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  var ctx: Print
  
  var length: js.Any
  
  var offset: js.Any
  
  var path: js.Any
  
  var timeout: js.Any
}
object Length {
  
  @scala.inline
  def apply(ctx: Print, length: js.Any, offset: js.Any, path: js.Any, timeout: js.Any): Length = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  
  @scala.inline
  implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: js.Any): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
