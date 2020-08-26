package typings.highchartsNg.mod.global

import typings.highcharts.mod.Options
import typings.highchartsNg.anon.CurrentMax
import typings.highchartsNg.anon.Height
import typings.highchartsNg.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighChartsNGConfig extends js.Object {
  //function (optional) - setup some logic for the chart
  var func: js.UndefOr[
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChartObject */ /* chart */ js.Any, 
      Unit
    ]
  ] = js.native
  //Boolean to control showng loading status on chart (optional)
  //Could be a string if you want to show specific loading text.
  var loading: js.UndefOr[Boolean | String] = js.native
  //no data text (optional) to show if all series are empty
  var noData: js.UndefOr[String] = js.native
  var options: Options = js.native
  //The below properties are watched separately for changes.
  //Series object (optional) - a list of series using normal highcharts series options.
  var series: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndividualSeriesOptions */ _
    ]
  ] = js.native
  //size (optional) if left out the chart will default to size of the div or something sensible.
  var size: js.UndefOr[Height] = js.native
  //Title configuration (optional)
  var title: js.UndefOr[Text] = js.native
  //Whether to use HighStocks instead of HighCharts (optional). Defaults to false.
  var useHighStocks: js.UndefOr[Boolean] = js.native
  //Configuration for the xAxis (optional). Currently only one x axis can be dynamically controlled.
  //properties currentMin and currentMax provied 2-way binding to the chart's maximimum and minimum
  var xAxis: js.UndefOr[CurrentMax] = js.native
}

object HighChartsNGConfig {
  @scala.inline
  def apply(options: Options): HighChartsNGConfig = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighChartsNGConfig]
  }
  @scala.inline
  implicit class HighChartsNGConfigOps[Self <: HighChartsNGConfig] (val x: Self) extends AnyVal {
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
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunc(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChartObject */ /* chart */ js.Any => Unit
    ): Self = this.set("func", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFunc: Self = this.set("func", js.undefined)
    @scala.inline
    def setLoading(value: Boolean | String): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setNoData(value: String): Self = this.set("noData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoData: Self = this.set("noData", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: js.Any*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndividualSeriesOptions */ _
        ]
    ): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSize(value: Height): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTitle(value: Text): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUseHighStocks(value: Boolean): Self = this.set("useHighStocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseHighStocks: Self = this.set("useHighStocks", js.undefined)
    @scala.inline
    def setXAxis(value: CurrentMax): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
  }
  
}

