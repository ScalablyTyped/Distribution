package typings
package atMaterialDashUiLabLib.sliderSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mark extends js.Object {
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var value: scala.Double
}

object Mark {
  @scala.inline
  def apply(value: scala.Double, label: reactLib.reactMod.ReactNode = null): Mark = {
    val __obj = js.Dynamic.literal(value = value)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
}

