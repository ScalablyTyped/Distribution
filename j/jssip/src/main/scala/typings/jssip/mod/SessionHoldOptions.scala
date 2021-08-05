package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionHoldOptions extends StObject {
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var useUpdate: js.UndefOr[Boolean] = js.undefined
}
object SessionHoldOptions {
  
  inline def apply(): SessionHoldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionHoldOptions]
  }
  
  extension [Self <: SessionHoldOptions](x: Self) {
    
    inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    
    inline def setUseUpdate(value: Boolean): Self = StObject.set(x, "useUpdate", value.asInstanceOf[js.Any])
    
    inline def setUseUpdateUndefined: Self = StObject.set(x, "useUpdate", js.undefined)
  }
}
