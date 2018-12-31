package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Pushpin")
@js.native
class Pushpin () extends Component[PushpinOptions] {
  /**
    * Original offsetTop of element
    */
  var originalOffset: scala.Double = js.native
}

@JSGlobal("M.Pushpin")
@js.native
object Pushpin extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Pushpin = js.native
  /**
    * Init Pushpins
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Pushpin] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.PushpinOptions]
  ): js.Array[materializeDashCssLib.MNs.Pushpin] = js.native
  /**
    * Init Pushpin
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Pushpin = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.PushpinOptions]): materializeDashCssLib.MNs.Pushpin = js.native
}

