package typings.jqueryBackstretch.JQueryBackStretch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackStretch extends js.Object {
  
  /**
    * Destroy the Backstretch instance. Optionally, you can pass in a Boolean
    * parameter, preserveBackground, to determine whether or not you'd like
    * to keep the current image stretched as the background image.
    *
    * @param {boolean} preserveBackground
    */
  def destroy(): Unit = js.native
  def destroy(preserveBackground: Boolean): Unit = js.native
  
  /**
    * Advance to the next image in a slideshow.
    */
  def next(): BackStretch = js.native
  
  /**
    * Pause the slideshow.
    */
  def pause(): BackStretch = js.native
  
  /**
    * Display the previous image in a slideshow.
    */
  def prev(): BackStretch = js.native
  
  /**
    * This method is called automatically when the container (window or
    * block-level element) is resized, however you can always call this
    * manually if needed.
    */
  def resize(): BackStretch = js.native
  
  /**
    * Resume a paused slideshow.
    */
  def resume(): BackStretch = js.native
  
  /**
    * Jump to the slide at a given index, where n is the number of the
    * image that you'd like to display. Slide number starts at 0.
    *
    * @param {number} newIndex
    */
  def show(newIndex: Double): BackStretch = js.native
}
