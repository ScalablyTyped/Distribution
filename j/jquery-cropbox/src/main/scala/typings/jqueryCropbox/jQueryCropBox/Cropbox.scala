package typings.jqueryCropbox.jQueryCropBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cropbox extends js.Object {
  /**
    * Simulate image dragging, starting from (startX,startY) and moving a delta of (dx,dy). Need to call update to reflect the changes.
    */
  def drag(options: CropboxDragOptions): Unit
  /**
    * Generate a Blob with the cropped image (requires HTML5 compliant browser).
    */
  def getBlob(): js.Any
  /**
    * Generate a URL for the cropped image on the client (requires HTML5 compliant browser).
    */
  def getDataURL(): String
  /**
    * Attach an event handler function for one event on the Crop Box
    */
  def on(event: String, callback: EventCallback): Unit
  /**
    * Remove the cropbox functionality from the image.
    */
  def remove(): Unit
  /**
    * Set crop window.
    */
  def setCrop(options: CropboxSetCropOptions): Unit
  /**
    * Update the cropped result (must call after zoom and drag).
    */
  def update(): Unit
  /**
    * Set zoom leevl to a value between 0 and 1. Need to call update to reflect the changes.
    */
  def zoom(percent: Double): Unit
  /**
    * Increase image zoom level by one step
    */
  def zoomIn(): Unit
  /**
    * Decrease image zoom level by one step
    */
  def zoomOut(): Unit
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
}

