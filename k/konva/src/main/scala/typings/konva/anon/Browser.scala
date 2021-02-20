package typings.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Browser extends StObject {
  
  var browser: js.Any = js.native
  
  var ieMobile: Boolean = js.native
  
  var isIE: Double | Boolean = js.native
  
  var mobile: Boolean = js.native
  
  var version: js.Any = js.native
}
object Browser {
  
  @scala.inline
  def apply(browser: js.Any, ieMobile: Boolean, isIE: Double | Boolean, mobile: Boolean, version: js.Any): Browser = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], ieMobile = ieMobile.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  
  @scala.inline
  implicit class BrowserMutableBuilder[Self <: Browser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowser(value: js.Any): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIeMobile(value: Boolean): Self = StObject.set(x, "ieMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIE(value: Double | Boolean): Self = StObject.set(x, "isIE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: js.Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
