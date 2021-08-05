package typings.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Browser extends StObject {
  
  var browser: js.Any
  
  var ieMobile: Boolean
  
  var isIE: Double | Boolean
  
  var mobile: Boolean
  
  var version: js.Any
}
object Browser {
  
  inline def apply(browser: js.Any, ieMobile: Boolean, isIE: Double | Boolean, mobile: Boolean, version: js.Any): Browser = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], ieMobile = ieMobile.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  
  extension [Self <: Browser](x: Self) {
    
    inline def setBrowser(value: js.Any): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setIeMobile(value: Boolean): Self = StObject.set(x, "ieMobile", value.asInstanceOf[js.Any])
    
    inline def setIsIE(value: Double | Boolean): Self = StObject.set(x, "isIE", value.asInstanceOf[js.Any])
    
    inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: js.Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
