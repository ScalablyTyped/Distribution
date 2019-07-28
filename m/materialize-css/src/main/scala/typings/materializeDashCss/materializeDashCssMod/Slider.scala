package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.MElements
import typings.materializeDashCss.MNs.SliderOptions
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Slider")
@js.native
class Slider ()
  extends typings.materializeDashCss.MNs.Slider

/* static members */
@JSImport("materialize-css", "Slider")
@js.native
object Slider extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.MNs.Slider = js.native
  /**
    * Init Sliders
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.MNs.Slider] = js.native
  def init(els: MElements, options: Partial[SliderOptions]): js.Array[typings.materializeDashCss.MNs.Slider] = js.native
  /**
    * Init Slider
    */
  def init(els: Element): typings.materializeDashCss.MNs.Slider = js.native
  def init(els: Element, options: Partial[SliderOptions]): typings.materializeDashCss.MNs.Slider = js.native
}

