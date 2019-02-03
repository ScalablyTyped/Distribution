package typings
package atMaterialSliderLib.atMaterialSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/slider", "MDCSlider")
@js.native
class MDCSlider ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialSliderLib.adapterMod.MDCSliderAdapter, 
      atMaterialSliderLib.foundationMod.default
    ] {
  var disabled: scala.Boolean = js.native
  var max: scala.Double = js.native
  var min: scala.Double = js.native
  var step: scala.Double = js.native
  var value: scala.Double = js.native
  def initialize(): scala.Unit = js.native
  def layout(): scala.Unit = js.native
  def stepDown(): scala.Unit = js.native
  def stepDown(amount: scala.Double): scala.Unit = js.native
  def stepUp(): scala.Unit = js.native
  def stepUp(amount: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("@material/slider", "MDCSlider")
@js.native
object MDCSlider extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialSliderLib.atMaterialSliderMod.MDCSlider = js.native
}

