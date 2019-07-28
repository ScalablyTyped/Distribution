package typings.materializeDashCss.MNs

import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Materialbox")
@js.native
class Materialbox () extends Component[MaterialboxOptions] {
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

/* static members */
@JSGlobal("M.Materialbox")
@js.native
object Materialbox extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Materialbox = js.native
  /**
    * Init Materialboxes
    */
  def init(els: MElements): js.Array[Materialbox] = js.native
  def init(els: MElements, options: Partial[MaterialboxOptions]): js.Array[Materialbox] = js.native
  /**
    * Init Materialbox
    */
  def init(els: Element): Materialbox = js.native
  def init(els: Element, options: Partial[MaterialboxOptions]): Materialbox = js.native
}

