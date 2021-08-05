package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserPreference extends StObject {
  
  var Chrome: js.UndefOr[String] = js.undefined
  
  var Firefox: js.UndefOr[String] = js.undefined
  
  var MSIE: js.UndefOr[String] = js.undefined
  
  var Opera: js.UndefOr[String] = js.undefined
  
  var Safari: js.UndefOr[String] = js.undefined
  
  var other: js.UndefOr[String] = js.undefined
}
object BrowserPreference {
  
  inline def apply(): BrowserPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserPreference]
  }
  
  extension [Self <: BrowserPreference](x: Self) {
    
    inline def setChrome(value: String): Self = StObject.set(x, "Chrome", value.asInstanceOf[js.Any])
    
    inline def setChromeUndefined: Self = StObject.set(x, "Chrome", js.undefined)
    
    inline def setFirefox(value: String): Self = StObject.set(x, "Firefox", value.asInstanceOf[js.Any])
    
    inline def setFirefoxUndefined: Self = StObject.set(x, "Firefox", js.undefined)
    
    inline def setMSIE(value: String): Self = StObject.set(x, "MSIE", value.asInstanceOf[js.Any])
    
    inline def setMSIEUndefined: Self = StObject.set(x, "MSIE", js.undefined)
    
    inline def setOpera(value: String): Self = StObject.set(x, "Opera", value.asInstanceOf[js.Any])
    
    inline def setOperaUndefined: Self = StObject.set(x, "Opera", js.undefined)
    
    inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    inline def setSafari(value: String): Self = StObject.set(x, "Safari", value.asInstanceOf[js.Any])
    
    inline def setSafariUndefined: Self = StObject.set(x, "Safari", js.undefined)
  }
}
