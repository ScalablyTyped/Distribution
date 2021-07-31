package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Long extends StObject {
  
  var cidBase: js.Any
  
  var ctx: Print
  
  var long: js.Any
  
  var path: js.Any
  
  var timeout: js.Any
}
object Long {
  
  @scala.inline
  def apply(cidBase: js.Any, ctx: Print, long: js.Any, path: js.Any, timeout: js.Any): Long = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Long]
  }
  
  @scala.inline
  implicit class LongMutableBuilder[Self <: Long] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLong(value: js.Any): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
