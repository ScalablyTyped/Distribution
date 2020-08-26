package typings.highcharts.mod

import typings.highcharts.highchartsStrings.setExtremes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisSetExtremesEventObject extends ExtremesObject {
  var preventDefault: js.Function = js.native
  var target: SVGElement = js.native
  var trigger: String | AxisExtremesTriggerValue = js.native
  var `type`: setExtremes = js.native
}

object AxisSetExtremesEventObject {
  @scala.inline
  def apply(
    dataMax: Double,
    dataMin: Double,
    max: Double,
    min: Double,
    preventDefault: js.Function,
    target: SVGElement,
    trigger: String | AxisExtremesTriggerValue,
    `type`: setExtremes,
    userMax: Double,
    userMin: Double
  ): AxisSetExtremesEventObject = {
    val __obj = js.Dynamic.literal(dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], userMax = userMax.asInstanceOf[js.Any], userMin = userMin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisSetExtremesEventObject]
  }
  @scala.inline
  implicit class AxisSetExtremesEventObjectOps[Self <: AxisSetExtremesEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: SVGElement): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrigger(value: String | AxisExtremesTriggerValue): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: setExtremes): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

