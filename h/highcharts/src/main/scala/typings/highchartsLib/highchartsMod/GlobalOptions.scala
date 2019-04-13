package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalOptions extends Options {
  /**
    * Global options that don't apply to each chart. These options, like the lang options, must be set using the
    * Highcharts.setOptions method.
    */
  var global: js.UndefOr[GlobalObject] = js.undefined
}

object GlobalOptions {
  @scala.inline
  def apply(
    accessibility: AccessibilityOptions = null,
    annotations: js.Array[AnnotationsOptions] = null,
    chart: ChartOptions = null,
    colorAxis: ColorAxisOptions | js.Array[ColorAxisOptions] = null,
    colors: js.Array[Color] = null,
    credits: CreditsOptions = null,
    data: DataOptions = null,
    defs: js.Any = null,
    drilldown: DrilldownOptions = null,
    exporting: ExportingOptions = null,
    global: GlobalObject = null,
    labels: LabelsOptions = null,
    lang: LangObject = null,
    legend: LegendOptions = null,
    loading: LoadingOptions = null,
    navigation: NavigationOptions = null,
    noData: NoDataOptions = null,
    pane: PaneOptions = null,
    plotOptions: PlotOptions = null,
    responsive: ResponsiveOptions = null,
    series: js.Array[IndividualSeriesOptions] = null,
    subtitle: SubtitleOptions = null,
    time: TimeOptions = null,
    title: TitleOptions = null,
    tooltip: TooltipOptions = null,
    xAxis: js.Array[AxisOptions] | AxisOptions = null,
    yAxis: js.Array[AxisOptions] | AxisOptions = null
  ): GlobalOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (credits != null) __obj.updateDynamic("credits")(credits)
    if (data != null) __obj.updateDynamic("data")(data)
    if (defs != null) __obj.updateDynamic("defs")(defs)
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown)
    if (exporting != null) __obj.updateDynamic("exporting")(exporting)
    if (global != null) __obj.updateDynamic("global")(global)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (noData != null) __obj.updateDynamic("noData")(noData)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (plotOptions != null) __obj.updateDynamic("plotOptions")(plotOptions)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive)
    if (series != null) __obj.updateDynamic("series")(series)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (time != null) __obj.updateDynamic("time")(time)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalOptions]
  }
}

