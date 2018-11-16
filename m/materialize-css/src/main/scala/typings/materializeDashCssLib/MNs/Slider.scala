package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Slider")
@js.native
class Slider () extends Component[SliderOptions] {
  /**
           * Index of current slide
           */
  var activeIndex: scala.Double = js.native
  /**
           * Move to next slider
           */
  def next(): scala.Unit = js.native
  /**
           * Pause slider autoslide
           */
  def pause(): scala.Unit = js.native
  /**
           * Move to prev slider
           */
  def prev(): scala.Unit = js.native
  /**
           * Start slider autoslide
           */
  def start(): scala.Unit = js.native
}

@JSGlobal("M.Slider")
@js.native
object Slider extends js.Object {
  /**
           * Get Instance
           */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Slider = js.native
  /**
           * Init Sliders
           */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Slider] = js.native
  /**
           * Init Sliders
           */
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.SliderOptions]
  ): js.Array[materializeDashCssLib.MNs.Slider] = js.native
  /**
           * Init Slider
           */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Slider = js.native
  /**
           * Init Slider
           */
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.SliderOptions]): materializeDashCssLib.MNs.Slider = js.native
}

