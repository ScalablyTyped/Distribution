package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<MaterialboxOptions> * / any */ trait Materialbox extends js.Object {
  /**
    * Caption if specified
    */
  var caption: String
  /**
    * If the materialbox is no longer being animated
    */
  var doneAnimating: Boolean
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
  /**
    * Close materialbox
    */
  def close(): Unit
  /**
    * Open materialbox
    */
  def open(): Unit
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
}

