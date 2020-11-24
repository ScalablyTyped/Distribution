package typings.jqueryCropbox.jQueryCropBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropboxOptions extends js.Object {
  
  /**
    * If not null, this is the entire html block that should appear on hover over the image for instructions and/or buttons (could include the zoom in/out buttons for example). If null, the default html block is used which has the text "Click to drag" and the zoom in/out buttons. Use false to disable controls.
    */
  var controls: js.UndefOr[js.Any] = js.native
  
  /**
    * Height in pixels of the cropping window
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Maximum zoom value. With the default of 1.0 users can't zoom beyond the maximum image resolution.
    */
  var maxZoom: js.UndefOr[Double] = js.native
  
  /**
    * Set the initial cropping area
    */
  var result: js.UndefOr[CropboxArea] = js.native
  
  /**
    * This flag is used to determine when to display the controls. Never, always and hover do exactly what you would expect (never show them, always show them, show them on hover). The auto flag is the same as the hover flag, except that on mobile devices it always shows the controls (since there is no hover event).
    */
  var showControls: js.UndefOr[ShowControls] = js.native
  
  /**
    * Width in pixels of the cropping window
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * Number of incremental zoom steps. With the default of 10, you have to click the zoom-in button 9 times to reach 100%.
    */
  var zoom: js.UndefOr[Double] = js.native
}
object CropboxOptions {
  
  @scala.inline
  def apply(): CropboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropboxOptions]
  }
  
  @scala.inline
  implicit class CropboxOptionsOps[Self <: CropboxOptions] (val x: Self) extends AnyVal {
    
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
    def setControls(value: js.Any): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setResult(value: CropboxArea): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setShowControls(value: ShowControls): Self = this.set("showControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowControls: Self = this.set("showControls", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
