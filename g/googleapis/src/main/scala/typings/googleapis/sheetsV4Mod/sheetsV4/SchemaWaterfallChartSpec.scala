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
  def apply(): SchemaWaterfallChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaterfallChartSpec]
  }
  @scala.inline
  implicit class SchemaWaterfallChartSpecOps[Self <: SchemaWaterfallChartSpec] (val x: Self) extends AnyVal {
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
    def setConnectorLineStyle(value: SchemaLineStyle): Self = this.set("connectorLineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorLineStyle: Self = this.set("connectorLineStyle", js.undefined)
    @scala.inline
    def setDomain(value: SchemaWaterfallChartDomain): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setFirstValueIsTotal(value: Boolean): Self = this.set("firstValueIsTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstValueIsTotal: Self = this.set("firstValueIsTotal", js.undefined)
    @scala.inline
    def setHideConnectorLines(value: Boolean): Self = this.set("hideConnectorLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideConnectorLines: Self = this.set("hideConnectorLines", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: SchemaWaterfallChartSeries*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[SchemaWaterfallChartSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setStackedType(value: String): Self = this.set("stackedType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackedType: Self = this.set("stackedType", js.undefined)
  }
  
}

