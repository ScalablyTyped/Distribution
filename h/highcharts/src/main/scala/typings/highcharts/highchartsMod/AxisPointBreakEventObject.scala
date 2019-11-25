package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.pointBreak
import typings.highcharts.highchartsStrings.pointInBreak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisPointBreakEventObject extends js.Object {
  var brk: Dictionary[Double]
  var point: Point
  var preventDefault: js.Function
  var target: SVGElement
  var `type`: pointBreak | pointInBreak
}

object AxisPointBreakEventObject {
  @scala.inline
  def apply(
    brk: Dictionary[Double],
    point: Point,
    preventDefault: js.Function,
    target: SVGElement,
    `type`: pointBreak | pointInBreak
  ): AxisPointBreakEventObject = {
    val __obj = js.Dynamic.literal(brk = brk.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPointBreakEventObject]
  }
}

