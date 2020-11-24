package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserPreference extends js.Object {
  
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
  implicit class BrowserPreferenceOps[Self <: BrowserPreference] (val x: Self) extends AnyVal {
    
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
    def setChrome(value: String): Self = this.set("Chrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChrome: Self = this.set("Chrome", js.undefined)
    
    @scala.inline
    def setFirefox(value: String): Self = this.set("Firefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirefox: Self = this.set("Firefox", js.undefined)
    
    @scala.inline
    def setMSIE(value: String): Self = this.set("MSIE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMSIE: Self = this.set("MSIE", js.undefined)
    
    @scala.inline
    def setOpera(value: String): Self = this.set("Opera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpera: Self = this.set("Opera", js.undefined)
    
    @scala.inline
    def setSafari(value: String): Self = this.set("Safari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafari: Self = this.set("Safari", js.undefined)
    
    @scala.inline
    def setOther(value: String): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
  }
}
