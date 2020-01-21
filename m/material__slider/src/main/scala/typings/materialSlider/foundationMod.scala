package typings.materialSlider

import typings.materialSlider.adapterMod.MDCSliderAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/slider/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCSliderFoundation
    extends typings.materialBase.foundationMod.default[MDCSliderAdapter] {
    def getMax(): Double = js.native
    def getMin(): Double = js.native
    def getStep(): Double = js.native
    def getValue(): Double = js.native
    def isDisabled(): Boolean = js.native
    def layout(): Unit = js.native
    def setDisabled(disabled: Boolean): Unit = js.native
    def setMax(max: Double): Unit = js.native
    def setMin(min: Double): Unit = js.native
    def setStep(step: Double): Unit = js.native
    def setValue(value: Double): Unit = js.native
    def setupTrackMarker(): Unit = js.native
  }
  
  @js.native
  class default () extends MDCSliderFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.materialSlider.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSliderAdapter = js.native
    val numbers: typings.materialSlider.constantsMod.numbers = js.native
    val strings: typings.materialSlider.constantsMod.strings = js.native
  }
  
}

