package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieDataLabels extends DataLabels {
  /**
    * The color of the line connecting the data label to the pie slice. The default color is the same as the point's
    * color. Defaults to {point.color}.
    * @since 2.1
    */
  var connectorColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The distance from the data label to the connector.
    * @default 5
    * @since 2.1
    */
  var connectorPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the line connecting the data label to the pie slice.
    * @default 1
    * @since 2.1
    */
  var connectorWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The distance of the data label from the pie's edge. Negative numbers put the data label on top of the pie slices.
    * Connectors are only shown for data labels outside the pie.
    * @default 30
    * @since 2.1
    */
  var distance: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to render the connector as a soft arc or a line with sharp break.
    * @default true
    * @since 2.1.7
    */
  var softConnector: js.UndefOr[scala.Boolean] = js.undefined
}

