package typings
package atMaterialSliderLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSliderFoundation
  extends atMaterialBaseLib.foundationMod.default[atMaterialSliderLib.adapterMod.MDCSliderAdapter] {
  def getMax(): scala.Double = js.native
  def getMin(): scala.Double = js.native
  def getStep(): scala.Double = js.native
  def getValue(): scala.Double = js.native
  def isDisabled(): scala.Boolean = js.native
  def layout(): scala.Unit = js.native
  def setDisabled(disabled: scala.Boolean): scala.Unit = js.native
  def setMax(max: scala.Double): scala.Unit = js.native
  def setMin(min: scala.Double): scala.Unit = js.native
  def setStep(step: scala.Double): scala.Unit = js.native
  def setValue(value: scala.Double): scala.Unit = js.native
  def setupTrackMarker(): scala.Unit = js.native
}

