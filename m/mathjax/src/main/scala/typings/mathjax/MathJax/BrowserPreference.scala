package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserPreference extends StObject {
  
  var Chrome: js.UndefOr[String] = js.native
  
  var Firefox: js.UndefOr[String] = js.native
  
  var MSIE: js.UndefOr[String] = js.native
  
  var Opera: js.UndefOr[String] = js.native
  
  var Safari: js.UndefOr[String] = js.native
  
  var other: js.UndefOr[String] = js.native
}
object BrowserPreference {
  
  @scala.inline
  def apply(): BrowserPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserPreference]
  }
  
  @scala.inline
  implicit class BrowserPreferenceMutableBuilder[Self <: BrowserPreference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChrome(value: String): Self = StObject.set(x, "Chrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChromeUndefined: Self = StObject.set(x, "Chrome", js.undefined)
    
    @scala.inline
    def setFirefox(value: String): Self = StObject.set(x, "Firefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirefoxUndefined: Self = StObject.set(x, "Firefox", js.undefined)
    
    @scala.inline
    def setMSIE(value: String): Self = StObject.set(x, "MSIE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSIEUndefined: Self = StObject.set(x, "MSIE", js.undefined)
    
    @scala.inline
    def setOpera(value: String): Self = StObject.set(x, "Opera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperaUndefined: Self = StObject.set(x, "Opera", js.undefined)
    
    @scala.inline
    def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    @scala.inline
    def setSafari(value: String): Self = StObject.set(x, "Safari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafariUndefined: Self = StObject.set(x, "Safari", js.undefined)
  }
}
