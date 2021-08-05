package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
trait Attribution extends StObject {
  
  var iosDeepLinkId: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var webUrl: js.UndefOr[String] = js.undefined
}
object Attribution {
  
  inline def apply(): Attribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attribution]
  }
  
  extension [Self <: Attribution](x: Self) {
    
    inline def setIosDeepLinkId(value: String): Self = StObject.set(x, "iosDeepLinkId", value.asInstanceOf[js.Any])
    
    inline def setIosDeepLinkIdUndefined: Self = StObject.set(x, "iosDeepLinkId", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
