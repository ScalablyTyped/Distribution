package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMCDControllerConfig extends StObject {
  
  var contentId: js.UndefOr[String] = js.undefined
  
  var sessionId: js.UndefOr[String] = js.undefined
  
  var useHeaders: js.UndefOr[Boolean] = js.undefined
}
object CMCDControllerConfig {
  
  inline def apply(): CMCDControllerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CMCDControllerConfig]
  }
  
  extension [Self <: CMCDControllerConfig](x: Self) {
    
    inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setUseHeaders(value: Boolean): Self = StObject.set(x, "useHeaders", value.asInstanceOf[js.Any])
    
    inline def setUseHeadersUndefined: Self = StObject.set(x, "useHeaders", js.undefined)
  }
}
