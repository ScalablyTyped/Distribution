package typings.materialSlider

import typings.materialBase.componentMod.MDCComponent
import typings.materialSlider.foundationMod.MDCSliderFoundation
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/slider/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCSlider () extends MDCComponent[MDCSliderFoundation] {
    def disabled: Boolean = js.native
    def disabled_=(disabled: Boolean): Unit = js.native
    def initialize(): Unit = js.native
    def layout(): Unit = js.native
    def max: Double = js.native
    def max_=(max: Double): Unit = js.native
    def min: Double = js.native
    def min_=(min: Double): Unit = js.native
    def step: Double = js.native
    def stepDown(): Unit = js.native
    def stepDown(amount: Double): Unit = js.native
    def stepUp(): Unit = js.native
    def stepUp(amount: Double): Unit = js.native
    def step_=(step: Double): Unit = js.native
    def value: Double = js.native
    def value_=(value: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MDCSlider extends js.Object {
    def attachTo(root: Element): MDCSlider = js.native
  }
  
}

