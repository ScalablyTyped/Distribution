package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserInfo extends StObject {
  
  /* This lets you perform browser-specific functions. Here, choices is an object whose properties are the names of the browsers and whose values are the functions to be performed. Each function is passed one parameter, which is the MathJax.Hub.Browser object. You do not need to include every browser as one of your choices — only those for which you need to do special processing. For example:
    *MathJax.Hub.Browser.Select({
    *    MSIE: function (browser) {
    *    if (browser.versionAtLeast("8.0")) {... do version 8 stuff ... }
    *        ... do general MSIE stuff ...
    *    },
    *    Firefox: function (browser) {
    *    if (browser.isMac) {... do Mac stuff ... }
    *        ... do general Firefox stuff
    *    }
    *});*/
  def Select(choices: js.Any): Unit = js.native
  
  var isChrome: js.UndefOr[Boolean] = js.native
  
  /*These are true when the browser is the indicated one, and false otherwise.*/
  var isFirefox: js.UndefOr[Boolean] = js.native
  
  var isKonqueror: js.UndefOr[Boolean] = js.native
  
  var isMSIE: js.UndefOr[Boolean] = js.native
  
  /*These are boolean values that indicate whether the browser is running on a Macintosh computer or a Windows
    * computer. They will both be false for a Linux computer.
    */
  var isMac: js.UndefOr[Boolean] = js.native
  
  /*This is true when MathJax is running a mobile version of a WebKit or Gecko-based browser.*/
  var isMobile: js.UndefOr[Boolean] = js.native
  
  var isOpera: js.UndefOr[Boolean] = js.native
  
  var isPC: js.UndefOr[Boolean] = js.native
  
  var isSafari: js.UndefOr[Boolean] = js.native
  
  /*The browser version number, e.g., "4.0"*/
  var version: String = js.native
  
  /*This tests whether the browser version is at least that given in the version string. Note that you can not
    * simply do a numeric comparison, as version 4.10 should be considered later than 4.9, for example. Similarly,
    * 4.10 is different from 4.1, for instance.*/
  def versionAtLeast(version: String): Unit = js.native
}
object BrowserInfo {
  
  @scala.inline
  def apply(Select: js.Any => Unit, version: String, versionAtLeast: String => Unit): BrowserInfo = {
    val __obj = js.Dynamic.literal(Select = js.Any.fromFunction1(Select), version = version.asInstanceOf[js.Any], versionAtLeast = js.Any.fromFunction1(versionAtLeast))
    __obj.asInstanceOf[BrowserInfo]
  }
  
  @scala.inline
  implicit class BrowserInfoMutableBuilder[Self <: BrowserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChromeUndefined: Self = StObject.set(x, "isChrome", js.undefined)
    
    @scala.inline
    def setIsFirefox(value: Boolean): Self = StObject.set(x, "isFirefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFirefoxUndefined: Self = StObject.set(x, "isFirefox", js.undefined)
    
    @scala.inline
    def setIsKonqueror(value: Boolean): Self = StObject.set(x, "isKonqueror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsKonquerorUndefined: Self = StObject.set(x, "isKonqueror", js.undefined)
    
    @scala.inline
    def setIsMSIE(value: Boolean): Self = StObject.set(x, "isMSIE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMSIEUndefined: Self = StObject.set(x, "isMSIE", js.undefined)
    
    @scala.inline
    def setIsMac(value: Boolean): Self = StObject.set(x, "isMac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMacUndefined: Self = StObject.set(x, "isMac", js.undefined)
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
    
    @scala.inline
    def setIsOpera(value: Boolean): Self = StObject.set(x, "isOpera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOperaUndefined: Self = StObject.set(x, "isOpera", js.undefined)
    
    @scala.inline
    def setIsPC(value: Boolean): Self = StObject.set(x, "isPC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPCUndefined: Self = StObject.set(x, "isPC", js.undefined)
    
    @scala.inline
    def setIsSafari(value: Boolean): Self = StObject.set(x, "isSafari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSafariUndefined: Self = StObject.set(x, "isSafari", js.undefined)
    
    @scala.inline
    def setSelect(value: js.Any => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionAtLeast(value: String => Unit): Self = StObject.set(x, "versionAtLeast", js.Any.fromFunction1(value))
  }
}
