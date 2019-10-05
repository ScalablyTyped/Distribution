package typings.materializeDashCss.M

import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Pushpin")
@js.native
class Pushpin () extends Component[PushpinOptions] {
  /**
    * Original offsetTop of element
    */
  var originalOffset: Double = js.native
}

/* static members */
@JSGlobal("M.Pushpin")
@js.native
object Pushpin extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Pushpin = js.native
  /**
    * Init Pushpins
    */
  def init(els: MElements): js.Array[Pushpin] = js.native
  def init(els: MElements, options: Partial[PushpinOptions]): js.Array[Pushpin] = js.native
  /**
    * Init Pushpin
    */
  def init(els: Element): Pushpin = js.native
  def init(els: Element, options: Partial[PushpinOptions]): Pushpin = js.native
}

