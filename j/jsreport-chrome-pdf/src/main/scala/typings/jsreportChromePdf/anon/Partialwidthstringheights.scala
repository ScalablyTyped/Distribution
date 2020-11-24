package typings.jsreportChromePdf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  width :string,   height :string,   deviceScaleFactor :string,   isMobile :boolean,   hasTouch :boolean,   isLandscape :boolean}> */
@js.native
trait Partialwidthstringheights extends js.Object {
  
  var deviceScaleFactor: js.UndefOr[String] = js.native
  
  var hasTouch: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[String] = js.native
  
  var isLandscape: js.UndefOr[Boolean] = js.native
  
  var isMobile: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object Partialwidthstringheights {
  
  @scala.inline
  def apply(): Partialwidthstringheights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialwidthstringheights]
  }
  
  @scala.inline
  implicit class PartialwidthstringheightsOps[Self <: Partialwidthstringheights] (val x: Self) extends AnyVal {
    
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
    def setDeviceScaleFactor(value: String): Self = this.set("deviceScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceScaleFactor: Self = this.set("deviceScaleFactor", js.undefined)
    
    @scala.inline
    def setHasTouch(value: Boolean): Self = this.set("hasTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTouch: Self = this.set("hasTouch", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIsLandscape(value: Boolean): Self = this.set("isLandscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLandscape: Self = this.set("isLandscape", js.undefined)
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMobile: Self = this.set("isMobile", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
