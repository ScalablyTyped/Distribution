package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single series of data for a waterfall chart.
  */
@js.native
trait SchemaWaterfallChartSeries extends js.Object {
  /**
    * Custom subtotal columns appearing in this series. The order in which
    * subtotals are defined is not significant. Only one subtotal may be
    * defined for each data point.
    */
  var customSubtotals: js.UndefOr[js.Array[SchemaWaterfallChartCustomSubtotal]] = js.native
  /**
    * The data being visualized in this series.
    */
  var data: js.UndefOr[SchemaChartData] = js.native
  /**
    * True to hide the subtotal column from the end of the series. By default,
    * a subtotal column will appear at the end of each series. Setting this
    * field to true will hide that subtotal column for this series.
    */
  var hideTrailingSubtotal: js.UndefOr[Boolean] = js.native
  /**
    * Styles for all columns in this series with negative values.
    */
  var negativeColumnsStyle: js.UndefOr[SchemaWaterfallChartColumnStyle] = js.native
  /**
    * Styles for all columns in this series with positive values.
    */
  var positiveColumnsStyle: js.UndefOr[SchemaWaterfallChartColumnStyle] = js.native
  /**
    * Styles for all subtotal columns in this series.
    */
  var subtotalColumnsStyle: js.UndefOr[SchemaWaterfallChartColumnStyle] = js.native
}

object SchemaWaterfallChartSeries {
  @scala.inline
  def apply(
    customSubtotals: js.Array[SchemaWaterfallChartCustomSubtotal] = null,
    data: SchemaChartData = null,
    hideTrailingSubtotal: js.UndefOr[Boolean] = js.undefined,
    negativeColumnsStyle: SchemaWaterfallChartColumnStyle = null,
    positiveColumnsStyle: SchemaWaterfallChartColumnStyle = null,
    subtotalColumnsStyle: SchemaWaterfallChartColumnStyle = null
  ): SchemaWaterfallChartSeries = {
    val __obj = js.Dynamic.literal()
    if (customSubtotals != null) __obj.updateDynamic("customSubtotals")(customSubtotals.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTrailingSubtotal)) __obj.updateDynamic("hideTrailingSubtotal")(hideTrailingSubtotal.asInstanceOf[js.Any])
    if (negativeColumnsStyle != null) __obj.updateDynamic("negativeColumnsStyle")(negativeColumnsStyle.asInstanceOf[js.Any])
    if (positiveColumnsStyle != null) __obj.updateDynamic("positiveColumnsStyle")(positiveColumnsStyle.asInstanceOf[js.Any])
    if (subtotalColumnsStyle != null) __obj.updateDynamic("subtotalColumnsStyle")(subtotalColumnsStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWaterfallChartSeries]
  }
}

