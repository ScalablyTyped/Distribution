package typings.googlemapsInfobubble.google.maps.infobubble

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoBubbleOptions extends js.Object {
  
  /**
    * Percentage from the bottom left corner of the infobubble
    */
  var arrowPosition: js.UndefOr[Double] = js.native
  
  var arrowSize: js.UndefOr[Double] = js.native
  
  /**
    * 0: Middle, 1: Left, 2: Right
    */
  var arrowStyle: js.UndefOr[Double] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var borderRadius: js.UndefOr[Double] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var disableAnimation: js.UndefOr[Boolean] = js.native
  
  var disableAutoPan: js.UndefOr[Boolean] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  /**
    * 0: None, 1: Right, 2: Under
    */
  var shadowStyle: js.UndefOr[Double] = js.native
}
object InfoBubbleOptions {
  
  @scala.inline
  def apply(): InfoBubbleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoBubbleOptions]
  }
  
  @scala.inline
  implicit class InfoBubbleOptionsOps[Self <: InfoBubbleOptions] (val x: Self) extends AnyVal {
    
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
    def setArrowPosition(value: Double): Self = this.set("arrowPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowPosition: Self = this.set("arrowPosition", js.undefined)
    
    @scala.inline
    def setArrowSize(value: Double): Self = this.set("arrowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowSize: Self = this.set("arrowSize", js.undefined)
    
    @scala.inline
    def setArrowStyle(value: Double): Self = this.set("arrowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowStyle: Self = this.set("arrowStyle", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setDisableAnimation(value: Boolean): Self = this.set("disableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAnimation: Self = this.set("disableAnimation", js.undefined)
    
    @scala.inline
    def setDisableAutoPan(value: Boolean): Self = this.set("disableAutoPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAutoPan: Self = this.set("disableAutoPan", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setShadowStyle(value: Double): Self = this.set("shadowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowStyle: Self = this.set("shadowStyle", js.undefined)
  }
}
