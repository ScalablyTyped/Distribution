package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions3d extends js.Object {
  /**
    * One of the two rotation angles for the chart.
    * @default 0
    * @since 4.0
    */
  var alpha: js.UndefOr[scala.Double] = js.undefined
  /**
    * One of the two rotation angles for the chart.
    * @default 0
    * @since 4.0
    */
  var beta: js.UndefOr[scala.Double] = js.undefined
  /**
    * The total depth of the chart.
    * @default 100
    * @since 4.0
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Wether to render the chart using the 3D functionality.
    * @default false
    * @since 4.0
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Provides the option to draw a frame around the charts by defining a bottom, front and back panel.
    */
  var frame: js.UndefOr[highchartsLib.Anon_Back] = js.undefined
  /**
    * Defines the distance the viewer is standing in front of the chart, this setting is important to calculate the
    * perspective effect in column and scatter charts. It is not used for 3D pie charts.
    * @default 100
    * @since 4.0
    */
  var viewDistance: js.UndefOr[scala.Double] = js.undefined
}

