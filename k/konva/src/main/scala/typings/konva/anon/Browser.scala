package typings.konva.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Browser extends js.Object {
  
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
  implicit class BrowserOps[Self <: Browser] (val x: Self) extends AnyVal {
    
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
    def setBrowser(value: js.Any): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIeMobile(value: Boolean): Self = this.set("ieMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIE(value: Double | Boolean): Self = this.set("isIE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: Boolean): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: js.Any): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
