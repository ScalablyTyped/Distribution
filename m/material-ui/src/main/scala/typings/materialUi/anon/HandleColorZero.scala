package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleColorZero extends js.Object {
  
  var handleColorZero: js.UndefOr[String] = js.native
  
  var handleFillColor: js.UndefOr[String] = js.native
  
  var handleSize: js.UndefOr[Double] = js.native
  
  var handleSizeActive: js.UndefOr[Double] = js.native
  
  var handleSizeDisabled: js.UndefOr[Double] = js.native
  
  var rippleColor: js.UndefOr[String] = js.native
  
  var selectionColor: js.UndefOr[String] = js.native
  
  var trackColor: js.UndefOr[String] = js.native
  
  var trackColorSelected: js.UndefOr[String] = js.native
  
  var trackSize: js.UndefOr[Double] = js.native
}
object HandleColorZero {
  
  @scala.inline
  def apply(): HandleColorZero = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleColorZero]
  }
  
  @scala.inline
  implicit class HandleColorZeroOps[Self <: HandleColorZero] (val x: Self) extends AnyVal {
    
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
    def setHandleColorZero(value: String): Self = this.set("handleColorZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleColorZero: Self = this.set("handleColorZero", js.undefined)
    
    @scala.inline
    def setHandleFillColor(value: String): Self = this.set("handleFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleFillColor: Self = this.set("handleFillColor", js.undefined)
    
    @scala.inline
    def setHandleSize(value: Double): Self = this.set("handleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleSize: Self = this.set("handleSize", js.undefined)
    
    @scala.inline
    def setHandleSizeActive(value: Double): Self = this.set("handleSizeActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleSizeActive: Self = this.set("handleSizeActive", js.undefined)
    
    @scala.inline
    def setHandleSizeDisabled(value: Double): Self = this.set("handleSizeDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleSizeDisabled: Self = this.set("handleSizeDisabled", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: String): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    
    @scala.inline
    def setTrackColor(value: String): Self = this.set("trackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackColor: Self = this.set("trackColor", js.undefined)
    
    @scala.inline
    def setTrackColorSelected(value: String): Self = this.set("trackColorSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackColorSelected: Self = this.set("trackColorSelected", js.undefined)
    
    @scala.inline
    def setTrackSize(value: Double): Self = this.set("trackSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackSize: Self = this.set("trackSize", js.undefined)
  }
}
