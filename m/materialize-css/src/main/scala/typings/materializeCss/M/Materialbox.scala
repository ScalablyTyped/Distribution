package typings.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<MaterialboxOptions> * / any */ @js.native
trait Materialbox extends StObject {
  
  /**
    * Caption if specified
    */
  var caption: String = js.native
  
  /**
    * Close materialbox
    */
  def close(): Unit = js.native
  
  /**
    * If the materialbox is no longer being animated
    */
  var doneAnimating: Boolean = js.native
  
  /**
    * Open materialbox
    */
  def open(): Unit = js.native
  
  /**
    * Original height of image
    */
  var originalHeight: Double = js.native
  
  /**
    * Original width of image
    */
  var originalWidth: Double = js.native
  
  /**
    * If the materialbox overlay is showing
    */
  var overlayActive: Boolean = js.native
}
object Materialbox {
  
  @scala.inline
  def apply(
    caption: String,
    close: () => Unit,
    doneAnimating: Boolean,
    open: () => Unit,
    originalHeight: Double,
    originalWidth: Double,
    overlayActive: Boolean
  ): Materialbox = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), doneAnimating = doneAnimating.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], overlayActive = overlayActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Materialbox]
  }
  
  @scala.inline
  implicit class MaterialboxMutableBuilder[Self <: Materialbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoneAnimating(value: Boolean): Self = StObject.set(x, "doneAnimating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOriginalHeight(value: Double): Self = StObject.set(x, "originalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalWidth(value: Double): Self = StObject.set(x, "originalWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayActive(value: Boolean): Self = StObject.set(x, "overlayActive", value.asInstanceOf[js.Any])
  }
}
