package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A gauge showing values using a filled arc with colors indicating the value. The solid gauge plots values against the
  * yAxis, which is extended with some color options, minColor, maxColor and stops, to control the color of the gauge
  * itself.
  */
trait SolidGaugeChart extends SeriesChart {
  /**
    * Allow the dial to overshoot the end of the perimeter axis by this many degrees. Say if the gauge axis goes from 0
    * to 60, a value of 100, or 1000, will show 5 degrees beyond the end of the axis.
    * @default 0
    * @since 3.0.10
    */
  var overshoot: js.UndefOr[scala.Double] = js.undefined
  /**
    * Wether to draw rounded edges on the gauge.
    * @default false
    * @since 5.0.8
    */
  var rounded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When this option is true, the dial will wrap around the axes. For instance, in a full-range gauge going from 0 to
    * 360, a value of 400 will point to 40. When wrap is false, the dial stops at 360.
    * @default true
    * @since 3.0
    */
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

