package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChromeExtensionBanner extends StObject {
  
  var chromeExtensionsInfo: js.UndefOr[js.Array[ChromeExtensionInfo]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object ChromeExtensionBanner {
  
  inline def apply(): ChromeExtensionBanner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeExtensionBanner]
  }
  
  extension [Self <: ChromeExtensionBanner](x: Self) {
    
    inline def setChromeExtensionsInfo(value: js.Array[ChromeExtensionInfo]): Self = StObject.set(x, "chromeExtensionsInfo", value.asInstanceOf[js.Any])
    
    inline def setChromeExtensionsInfoUndefined: Self = StObject.set(x, "chromeExtensionsInfo", js.undefined)
    
    inline def setChromeExtensionsInfoVarargs(value: ChromeExtensionInfo*): Self = StObject.set(x, "chromeExtensionsInfo", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
