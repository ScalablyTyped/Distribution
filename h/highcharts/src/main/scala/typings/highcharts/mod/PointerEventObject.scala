package typings.highcharts.mod

import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerEventObject extends PointerEvent {
  /**
    * The X coordinate of the pointer interaction relative to the chart.
    */
  var chartX: Double = js.native
  /**
    * The Y coordinate of the pointer interaction relative to the chart.
    */
  var chartY: Double = js.native
}

