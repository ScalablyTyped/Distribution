package typings.materializeCss.mod

import typings.materializeCss.M.SliderOptions
import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Slider")
@js.native
class Slider ()
  extends typings.materializeCss.M.Slider

/* static members */
@JSImport("materialize-css", "Slider")
@js.native
object Slider extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Slider = js.native
  /**
    * Init Sliders
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Slider] = js.native
  def init(els: MElements, options: Partial[SliderOptions]): js.Array[typings.materializeCss.M.Slider] = js.native
  /**
    * Init Slider
    */
  def init(els: Element): typings.materializeCss.M.Slider = js.native
  def init(els: Element, options: Partial[SliderOptions]): typings.materializeCss.M.Slider = js.native
}

