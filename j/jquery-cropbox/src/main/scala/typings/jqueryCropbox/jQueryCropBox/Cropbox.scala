package typings.jqueryCropbox.jQueryCropBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cropbox extends js.Object {
  
  /**
    * Simulate image dragging, starting from (startX,startY) and moving a delta of (dx,dy). Need to call update to reflect the changes.
    */
  def drag(options: CropboxDragOptions): Unit = js.native
  
  /**
    * Generate a Blob with the cropped image (requires HTML5 compliant browser).
    */
  def getBlob(): js.Any = js.native
  
  /**
    * Generate a URL for the cropped image on the client (requires HTML5 compliant browser).
    */
  def getDataURL(): String = js.native
  
  /**
    * Attach an event handler function for one event on the Crop Box
    */
  def on(event: String, callback: EventCallback): Unit = js.native
  
  /**
    * Remove the cropbox functionality from the image.
    */
  def remove(): Unit = js.native
  
  /**
    * Set crop window.
    */
  def setCrop(options: CropboxSetCropOptions): Unit = js.native
  
  /**
    * Update the cropped result (must call after zoom and drag).
    */
  def update(): Unit = js.native
  
  /**
    * Set zoom leevl to a value between 0 and 1. Need to call update to reflect the changes.
    */
  def zoom(percent: Double): Unit = js.native
  
  /**
    * Increase image zoom level by one step
    */
  def zoomIn(): Unit = js.native
  
  /**
    * Decrease image zoom level by one step
    */
  def zoomOut(): Unit = js.native
}
object Cropbox {
  
  @scala.inline
  def apply(
    drag: CropboxDragOptions => Unit,
    getBlob: () => js.Any,
    getDataURL: () => String,
    on: (String, EventCallback) => Unit,
    remove: () => Unit,
    setCrop: CropboxSetCropOptions => Unit,
    update: () => Unit,
    zoom: Double => Unit,
    zoomIn: () => Unit,
    zoomOut: () => Unit
  ): Cropbox = {
    val __obj = js.Dynamic.literal(drag = js.Any.fromFunction1(drag), getBlob = js.Any.fromFunction0(getBlob), getDataURL = js.Any.fromFunction0(getDataURL), on = js.Any.fromFunction2(on), remove = js.Any.fromFunction0(remove), setCrop = js.Any.fromFunction1(setCrop), update = js.Any.fromFunction0(update), zoom = js.Any.fromFunction1(zoom), zoomIn = js.Any.fromFunction0(zoomIn), zoomOut = js.Any.fromFunction0(zoomOut))
    __obj.asInstanceOf[Cropbox]
  }
  
  @scala.inline
  implicit class CropboxOps[Self <: Cropbox] (val x: Self) extends AnyVal {
    
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
    def setDrag(value: CropboxDragOptions => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBlob(value: () => js.Any): Self = this.set("getBlob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataURL(value: () => String): Self = this.set("getDataURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: (String, EventCallback) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCrop(value: CropboxSetCropOptions => Unit): Self = this.set("setCrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setZoom(value: Double => Unit): Self = this.set("zoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomIn(value: () => Unit): Self = this.set("zoomIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setZoomOut(value: () => Unit): Self = this.set("zoomOut", js.Any.fromFunction0(value))
  }
}
