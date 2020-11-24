package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdSize extends js.Object {
  
  /** The height of the ad slot in pixels. This field will be present only when size type is `PIXEL`. */
  var height: js.UndefOr[String] = js.native
  
  /** The size type of the ad slot. */
  var sizeType: js.UndefOr[String] = js.native
  
  /** The width of the ad slot in pixels. This field will be present only when size type is `PIXEL`. */
  var width: js.UndefOr[String] = js.native
}
object AdSize {
  
  @scala.inline
  def apply(): AdSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdSize]
  }
  
  @scala.inline
  implicit class AdSizeOps[Self <: AdSize] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setSizeType(value: String): Self = this.set("sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeType: Self = this.set("sizeType", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
