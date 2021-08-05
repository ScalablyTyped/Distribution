package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionSendInfoOptions extends StObject {
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}
object SessionSendInfoOptions {
  
  inline def apply(): SessionSendInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionSendInfoOptions]
  }
  
  extension [Self <: SessionSendInfoOptions](x: Self) {
    
    inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
  }
}
