package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserInfo extends js.Object {
  
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
  implicit class BrowserInfoOps[Self <: BrowserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSelect(value: js.Any => Unit): Self = this.set("Select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionAtLeast(value: String => Unit): Self = this.set("versionAtLeast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsChrome(value: Boolean): Self = this.set("isChrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsChrome: Self = this.set("isChrome", js.undefined)
    
    @scala.inline
    def setIsFirefox(value: Boolean): Self = this.set("isFirefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFirefox: Self = this.set("isFirefox", js.undefined)
    
    @scala.inline
    def setIsKonqueror(value: Boolean): Self = this.set("isKonqueror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsKonqueror: Self = this.set("isKonqueror", js.undefined)
    
    @scala.inline
    def setIsMSIE(value: Boolean): Self = this.set("isMSIE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMSIE: Self = this.set("isMSIE", js.undefined)
    
    @scala.inline
    def setIsMac(value: Boolean): Self = this.set("isMac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMac: Self = this.set("isMac", js.undefined)
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMobile: Self = this.set("isMobile", js.undefined)
    
    @scala.inline
    def setIsOpera(value: Boolean): Self = this.set("isOpera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpera: Self = this.set("isOpera", js.undefined)
    
    @scala.inline
    def setIsPC(value: Boolean): Self = this.set("isPC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPC: Self = this.set("isPC", js.undefined)
    
    @scala.inline
    def setIsSafari(value: Boolean): Self = this.set("isSafari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSafari: Self = this.set("isSafari", js.undefined)
  }
}
