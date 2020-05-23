package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Materialbox extends Component[MaterialboxOptions] {
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
}

