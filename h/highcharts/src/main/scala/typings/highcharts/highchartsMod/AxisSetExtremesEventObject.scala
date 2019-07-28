package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.setExtremes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisSetExtremesEventObject extends ExtremesObject {
  var preventDefault: js.Function
  var target: SVGElement
  var trigger: String | AxisExtremesTriggerValue
  var `type`: setExtremes
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
    val __obj = js.Dynamic.literal(dataMax = dataMax, dataMin = dataMin, max = max, min = min, preventDefault = preventDefault, target = target, trigger = trigger.asInstanceOf[js.Any], userMax = userMax, userMin = userMin)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AxisSetExtremesEventObject]
  }
}

