package typings.atMaterialSlider.foundationMod

import typings.atMaterialSlider.adapterMod.MDCSliderAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSliderFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCSliderAdapter] {
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

