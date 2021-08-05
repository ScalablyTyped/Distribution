package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtxFormat extends StObject {
  
  var ctx: Print
  
  var format: js.Any
  
  var timeout: js.Any
}
object CtxFormat {
  
  inline def apply(ctx: Print, format: js.Any, timeout: js.Any): CtxFormat = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtxFormat]
  }
  
  extension [Self <: CtxFormat](x: Self) {
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
