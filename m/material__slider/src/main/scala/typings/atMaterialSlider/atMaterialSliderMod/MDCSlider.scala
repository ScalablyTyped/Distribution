package typings.atMaterialSlider.atMaterialSliderMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialSlider.adapterMod.MDCSliderAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/slider", "MDCSlider")
@js.native
class MDCSlider ()
  extends default[MDCSliderAdapter, typings.atMaterialSlider.foundationMod.default] {
  var disabled: Boolean = js.native
  var max: Double = js.native
  var min: Double = js.native
  var step: Double = js.native
  var value: Double = js.native
  def initialize(): Unit = js.native
  def layout(): Unit = js.native
  def stepDown(): Unit = js.native
  def stepDown(amount: Double): Unit = js.native
  def stepUp(): Unit = js.native
  def stepUp(amount: Double): Unit = js.native
}

/* static members */
@JSImport("@material/slider", "MDCSlider")
@js.native
object MDCSlider extends js.Object {
  def attachTo(root: Element): MDCSlider = js.native
}

