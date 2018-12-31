package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneBackground extends js.Object {
  /**
    * @default {linearGradient: { x1: 0, y1: 0, x2: 0, y2: 1 }, stops: [[0, '#FFF'],[1, '#DDD']]}
    */
  var backgroundColor: java.lang.String | Gradient
  /**
    * @default 'silver'
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * @default 1
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The class name for this background.
    * @since 5.0.0
    * @default 'highcharts-pane'
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default 0
    */
  var innerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * @default '105%'
    */
  var outerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * @default 'circle'
    */
  var shape: js.UndefOr[java.lang.String] = js.undefined
}

