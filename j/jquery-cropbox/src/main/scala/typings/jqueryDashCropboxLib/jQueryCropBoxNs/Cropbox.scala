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

