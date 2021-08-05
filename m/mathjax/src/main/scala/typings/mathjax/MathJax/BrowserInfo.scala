package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def Select(choices: js.Any): Unit
  
  var isChrome: js.UndefOr[Boolean] = js.undefined
  
  /*These are true when the browser is the indicated one, and false otherwise.*/
  var isFirefox: js.UndefOr[Boolean] = js.undefined
  
  var isKonqueror: js.UndefOr[Boolean] = js.undefined
  
  var isMSIE: js.UndefOr[Boolean] = js.undefined
  
  /*These are boolean values that indicate whether the browser is running on a Macintosh computer or a Windows
    * computer. They will both be false for a Linux computer.
    */
  var isMac: js.UndefOr[Boolean] = js.undefined
  
  /*This is true when MathJax is running a mobile version of a WebKit or Gecko-based browser.*/
  var isMobile: js.UndefOr[Boolean] = js.undefined
  
  var isOpera: js.UndefOr[Boolean] = js.undefined
  
  var isPC: js.UndefOr[Boolean] = js.undefined
  
  var isSafari: js.UndefOr[Boolean] = js.undefined
  
  /*The browser version number, e.g., "4.0"*/
  var version: String
  
  /*This tests whether the browser version is at least that given in the version string. Note that you can not
    * simply do a numeric comparison, as version 4.10 should be considered later than 4.9, for example. Similarly,
    * 4.10 is different from 4.1, for instance.*/
  def versionAtLeast(version: String): Unit
}
object BrowserInfo {
  
  inline def apply(Select: js.Any => Unit, version: String, versionAtLeast: String => Unit): BrowserInfo = {
    val __obj = js.Dynamic.literal(Select = js.Any.fromFunction1(Select), version = version.asInstanceOf[js.Any], versionAtLeast = js.Any.fromFunction1(versionAtLeast))
    __obj.asInstanceOf[BrowserInfo]
  }
  
  extension [Self <: BrowserInfo](x: Self) {
    
    inline def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
    
    inline def setIsChromeUndefined: Self = StObject.set(x, "isChrome", js.undefined)
    
    inline def setIsFirefox(value: Boolean): Self = StObject.set(x, "isFirefox", value.asInstanceOf[js.Any])
    
    inline def setIsFirefoxUndefined: Self = StObject.set(x, "isFirefox", js.undefined)
    
    inline def setIsKonqueror(value: Boolean): Self = StObject.set(x, "isKonqueror", value.asInstanceOf[js.Any])
    
    inline def setIsKonquerorUndefined: Self = StObject.set(x, "isKonqueror", js.undefined)
    
    inline def setIsMSIE(value: Boolean): Self = StObject.set(x, "isMSIE", value.asInstanceOf[js.Any])
    
    inline def setIsMSIEUndefined: Self = StObject.set(x, "isMSIE", js.undefined)
    
    inline def setIsMac(value: Boolean): Self = StObject.set(x, "isMac", value.asInstanceOf[js.Any])
    
    inline def setIsMacUndefined: Self = StObject.set(x, "isMac", js.undefined)
    
    inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    inline def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
    
    inline def setIsOpera(value: Boolean): Self = StObject.set(x, "isOpera", value.asInstanceOf[js.Any])
    
    inline def setIsOperaUndefined: Self = StObject.set(x, "isOpera", js.undefined)
    
    inline def setIsPC(value: Boolean): Self = StObject.set(x, "isPC", value.asInstanceOf[js.Any])
    
    inline def setIsPCUndefined: Self = StObject.set(x, "isPC", js.undefined)
    
    inline def setIsSafari(value: Boolean): Self = StObject.set(x, "isSafari", value.asInstanceOf[js.Any])
    
    inline def setIsSafariUndefined: Self = StObject.set(x, "isSafari", js.undefined)
    
    inline def setSelect(value: js.Any => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction1(value))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionAtLeast(value: String => Unit): Self = StObject.set(x, "versionAtLeast", js.Any.fromFunction1(value))
  }
}
