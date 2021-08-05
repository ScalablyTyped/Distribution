package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamErrors extends StObject {
  
  var ctx: Print
  
  var quiet: js.Any
  
  var streamErrors: js.Any
  
  var timeout: js.Any
}
object StreamErrors {
  
  inline def apply(ctx: Print, quiet: js.Any, streamErrors: js.Any, timeout: js.Any): StreamErrors = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], streamErrors = streamErrors.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamErrors]
  }
  
  extension [Self <: StreamErrors](x: Self) {
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setQuiet(value: js.Any): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setStreamErrors(value: js.Any): Self = StObject.set(x, "streamErrors", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
