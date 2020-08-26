package typings.materialSlider

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialSlider.adapterMod.MDCSliderAdapter
import typings.materialSlider.anon.ACTIVE
import typings.materialSlider.anon.ARIADISABLED
import typings.materialSlider.anon.PAGEFACTOR
import typings.materialSlider.anon.PartialMDCSliderAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/slider/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCSliderFoundation () extends MDCFoundation[MDCSliderAdapter] {
    def this(adapter: PartialMDCSliderAdapter) = this()
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
  class default () extends MDCSliderFoundation {
    def this(adapter: PartialMDCSliderAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCSliderFoundation extends js.Object {
    def cssClasses: ACTIVE = js.native
    def defaultAdapter: MDCSliderAdapter = js.native
    def numbers: PAGEFACTOR = js.native
    def strings: ARIADISABLED = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: ACTIVE = js.native
    def defaultAdapter: MDCSliderAdapter = js.native
    def numbers: PAGEFACTOR = js.native
    def strings: ARIADISABLED = js.native
  }
  
}

