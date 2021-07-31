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
  
  @scala.inline
  def apply(ctx: Print, quiet: js.Any, streamErrors: js.Any, timeout: js.Any): StreamErrors = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], streamErrors = streamErrors.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamErrors]
  }
  
  @scala.inline
  implicit class StreamErrorsMutableBuilder[Self <: StreamErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuiet(value: js.Any): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamErrors(value: js.Any): Self = StObject.set(x, "streamErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
