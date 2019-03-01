package typings
package jqueryDashCropboxLib.jQueryCropBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cropbox extends js.Object {
  /**
    * Simulate image dragging, starting from (startX,startY) and moving a delta of (dx,dy). Need to call update to reflect the changes.
    */
  def drag(options: CropboxDragOptions): scala.Unit
  /**
    * Generate a Blob with the cropped image (requires HTML5 compliant browser).
    */
  def getBlob(): js.Any
  /**
    * Generate a URL for the cropped image on the client (requires HTML5 compliant browser).
    */
  def getDataURL(): java.lang.String
  /**
    * Attach an event handler function for one event on the Crop Box
    */
  def on(event: java.lang.String, callback: EventCallback): scala.Unit
  /**
    * Remove the cropbox functionality from the image.
    */
  def remove(): scala.Unit
  /**
    * Set crop window.
    */
  def setCrop(options: CropboxSetCropOptions): scala.Unit
  /**
    * Update the cropped result (must call after zoom and drag).
    */
  def update(): scala.Unit
  /**
    * Set zoom leevl to a value between 0 and 1. Need to call update to reflect the changes.
    */
  def zoom(percent: scala.Double): scala.Unit
  /**
    * Increase image zoom level by one step
    */
  def zoomIn(): scala.Unit
  /**
    * Decrease image zoom level by one step
    */
  def zoomOut(): scala.Unit
}

object Cropbox {
  @scala.inline
  def apply(
    drag: js.Function1[CropboxDragOptions, scala.Unit],
    getBlob: js.Function0[js.Any],
    getDataURL: js.Function0[java.lang.String],
    on: js.Function2[java.lang.String, EventCallback, scala.Unit],
    remove: js.Function0[scala.Unit],
    setCrop: js.Function1[CropboxSetCropOptions, scala.Unit],
    update: js.Function0[scala.Unit],
    zoom: js.Function1[scala.Double, scala.Unit],
    zoomIn: js.Function0[scala.Unit],
    zoomOut: js.Function0[scala.Unit]
  ): Cropbox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drag")(drag)
    __obj.updateDynamic("getBlob")(getBlob)
    __obj.updateDynamic("getDataURL")(getDataURL)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("setCrop")(setCrop)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("zoom")(zoom)
    __obj.updateDynamic("zoomIn")(zoomIn)
    __obj.updateDynamic("zoomOut")(zoomOut)
    __obj.asInstanceOf[Cropbox]
  }
}

