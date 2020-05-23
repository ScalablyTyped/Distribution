package typings.highchartsReactOfficial.anon

import typings.highcharts.mod.Chart_
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
  /**
    * Chart reference
    */
  var chart: Chart_
  /**
    * React reference
    */
  var container: RefObject[HTMLDivElement]
}

object Chart {
  @scala.inline
  def apply(chart: Chart_, container: RefObject[HTMLDivElement]): Chart = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart]
  }
}

