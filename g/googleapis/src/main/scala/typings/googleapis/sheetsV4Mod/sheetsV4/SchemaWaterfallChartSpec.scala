package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A waterfall chart.
  */
@js.native
trait SchemaWaterfallChartSpec extends js.Object {
  /**
    * The line style for the connector lines.
    */
  var connectorLineStyle: js.UndefOr[SchemaLineStyle] = js.native
  /**
    * The domain data (horizontal axis) for the waterfall chart.
    */
  var domain: js.UndefOr[SchemaWaterfallChartDomain] = js.native
  /**
    * True to interpret the first value as a total.
    */
  var firstValueIsTotal: js.UndefOr[Boolean] = js.native
  /**
    * True to hide connector lines between columns.
    */
  var hideConnectorLines: js.UndefOr[Boolean] = js.native
  /**
    * The data this waterfall chart is visualizing.
    */
  var series: js.UndefOr[js.Array[SchemaWaterfallChartSeries]] = js.native
  /**
    * The stacked type.
    */
  var stackedType: js.UndefOr[String] = js.native
}

object SchemaWaterfallChartSpec {
  @scala.inline
  def apply(
    connectorLineStyle: SchemaLineStyle = null,
    domain: SchemaWaterfallChartDomain = null,
    firstValueIsTotal: js.UndefOr[Boolean] = js.undefined,
    hideConnectorLines: js.UndefOr[Boolean] = js.undefined,
    series: js.Array[SchemaWaterfallChartSeries] = null,
    stackedType: String = null
  ): SchemaWaterfallChartSpec = {
    val __obj = js.Dynamic.literal()
    if (connectorLineStyle != null) __obj.updateDynamic("connectorLineStyle")(connectorLineStyle.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(firstValueIsTotal)) __obj.updateDynamic("firstValueIsTotal")(firstValueIsTotal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideConnectorLines)) __obj.updateDynamic("hideConnectorLines")(hideConnectorLines.get.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (stackedType != null) __obj.updateDynamic("stackedType")(stackedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWaterfallChartSpec]
  }
}

