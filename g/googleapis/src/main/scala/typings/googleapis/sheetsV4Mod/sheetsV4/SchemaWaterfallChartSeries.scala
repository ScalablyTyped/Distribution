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
  def apply(): SchemaWaterfallChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaterfallChartSeries]
  }
  @scala.inline
  implicit class SchemaWaterfallChartSeriesOps[Self <: SchemaWaterfallChartSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomSubtotalsVarargs(value: SchemaWaterfallChartCustomSubtotal*): Self = this.set("customSubtotals", js.Array(value :_*))
    @scala.inline
    def setCustomSubtotals(value: js.Array[SchemaWaterfallChartCustomSubtotal]): Self = this.set("customSubtotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSubtotals: Self = this.set("customSubtotals", js.undefined)
    @scala.inline
    def setData(value: SchemaChartData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHideTrailingSubtotal(value: Boolean): Self = this.set("hideTrailingSubtotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideTrailingSubtotal: Self = this.set("hideTrailingSubtotal", js.undefined)
    @scala.inline
    def setNegativeColumnsStyle(value: SchemaWaterfallChartColumnStyle): Self = this.set("negativeColumnsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeColumnsStyle: Self = this.set("negativeColumnsStyle", js.undefined)
    @scala.inline
    def setPositiveColumnsStyle(value: SchemaWaterfallChartColumnStyle): Self = this.set("positiveColumnsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositiveColumnsStyle: Self = this.set("positiveColumnsStyle", js.undefined)
    @scala.inline
    def setSubtotalColumnsStyle(value: SchemaWaterfallChartColumnStyle): Self = this.set("subtotalColumnsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtotalColumnsStyle: Self = this.set("subtotalColumnsStyle", js.undefined)
  }
  
}

