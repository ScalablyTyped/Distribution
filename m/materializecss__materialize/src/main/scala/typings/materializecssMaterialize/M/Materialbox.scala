package typings.materializecssMaterialize.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Materialbox
  extends StObject
     with Component[MaterialboxOptions] {
  
  /**
    * Caption if specified
    */
  var caption: String
  
  /**
    * Close materialbox
    */
  def close(): Unit
  
  /**
    * If the materialbox is no longer being animated
    */
  var doneAnimating: Boolean
  
  /**
    * Open materialbox
    */
  def open(): Unit
  
  /**
    * Original height of image
    */
  var originalHeight: Double
  
  /**
    * Original width of image
    */
  var originalWidth: Double
  
  /**
    * If the materialbox overlay is showing
    */
  var overlayActive: Boolean
}
object Materialbox {
  
  inline def apply(
    caption: String,
    close: () => Unit,
    destroy: () => Unit,
    doneAnimating: Boolean,
    el: Element,
    open: () => Unit,
    options: MaterialboxOptions,
    originalHeight: Double,
    originalWidth: Double,
    overlayActive: Boolean
  ): Materialbox = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), doneAnimating = doneAnimating.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any], originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], overlayActive = overlayActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Materialbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Materialbox] (val x: Self) extends AnyVal {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDoneAnimating(value: Boolean): Self = StObject.set(x, "doneAnimating", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setOriginalHeight(value: Double): Self = StObject.set(x, "originalHeight", value.asInstanceOf[js.Any])
    
    inline def setOriginalWidth(value: Double): Self = StObject.set(x, "originalWidth", value.asInstanceOf[js.Any])
    
    inline def setOverlayActive(value: Boolean): Self = StObject.set(x, "overlayActive", value.asInstanceOf[js.Any])
  }
}
