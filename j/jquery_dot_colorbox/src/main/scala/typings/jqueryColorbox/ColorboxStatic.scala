package typings.jqueryColorbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorboxStatic extends StObject {
  
  /**
    * This method allows you to call Colorbox without having to assign it to an element.
    */
  def apply(settings: ColorboxSettings): Any = js.native
  
  /**
    * This method initiates the close sequence, which does not immediately complete. The lightbox will be completely closed only when the cbox_closed event / onClosed callback is fired.
    */
  def close(): Unit = js.native
  
  /**
    * This method is used to fetch the current HTML element that Colorbox is associated with. 
    */
  def element(): JQuery = js.native
  
  /**
    * This method moves to the next item in a group and are the same as pressing the 'next' or 'previous' buttons.
    */
  def next(): Unit = js.native
  
  /**
    * This method moves to the previous item in a group and are the same as pressing the 'next' or 'previous' buttons.
    */
  def prev(): Unit = js.native
  
  /**
    * Removes all traces of Colorbox from the document.
    */
  def remove(): Unit = js.native
  
  /**
    * This allows Colorbox to be resized based on it's own auto-calculations, or to a specific size. This must be called manually after Colorbox's content has loaded. 
    */
  def resize(): Unit = js.native
  /**
    * This allows Colorbox to be resized based on it's own auto-calculations, or to a specific size. This must be called manually after Colorbox's content has loaded. 
    */
  def resize(settings: ColorboxResizeSettings): Unit = js.native
  
  /**
    * Default settings used for Colorbox calls
    */
  var settings: ColorboxSettings = js.native
}
