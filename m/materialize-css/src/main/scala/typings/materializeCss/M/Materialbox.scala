package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<MaterialboxOptions> * / any */ @js.native
trait Materialbox extends js.Object {
  /**
    * Caption if specified
    */
  var caption: String = js.native
  /**
    * If the materialbox is no longer being animated
    */
  var doneAnimating: Boolean = js.native
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
  /**
    * Close materialbox
    */
  def close(): Unit = js.native
  /**
    * Open materialbox
    */
  def open(): Unit = js.native
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
  implicit class MaterialboxOps[Self <: Materialbox] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setDoneAnimating(value: Boolean): Self = this.set("doneAnimating", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    @scala.inline
    def setOriginalHeight(value: Double): Self = this.set("originalHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalWidth(value: Double): Self = this.set("originalWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayActive(value: Boolean): Self = this.set("overlayActive", value.asInstanceOf[js.Any])
  }
  
}

