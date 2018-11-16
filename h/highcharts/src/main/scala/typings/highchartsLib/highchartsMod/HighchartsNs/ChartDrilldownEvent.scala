package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartDrilldownEvent
  extends stdLib.Event {
  /**
           * If a category label was clicked, which index.
           */
  var category: js.UndefOr[scala.Double] = js.native
  /**
           * The originating point.
           */
  var point: js.UndefOr[PointObject] = js.native
  /**
           * If a category label was clicked, this array holds all points corresponing to the category.
           */
  var points: js.UndefOr[js.Array[PointObject]] = js.native
  /**
           * Options for the new series.
           */
  var seriesOptions: js.UndefOr[IndividualSeriesOptions] = js.native
}

