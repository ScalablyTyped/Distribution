package typings
package highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialMod.HighchartsReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties for a Highcharts component
  */
trait Props
  extends /* *
  *
  *  Properties
  *
  * */
/**
  * Indexer for custom properties
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Flag for `Chart.update` call (Default: true)
    */
  var allowChartUpdate: js.UndefOr[scala.Boolean] = js.undefined
  /* *
    *
    *  Functions
    *
    * */
  /**
    * Callback for the chart factory
    */
  var callback: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Highcharts.ChartCallbackFunction */ js.Any
  ] = js.undefined
  /**
    * Reference to the chart factory (Default: chart)
    */
  var constructorType: js.UndefOr[
    highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialLibStrings.Chart | highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialLibStrings.Renderer | highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialLibStrings.charts | highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialLibStrings.dateFormats | highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialLibStrings.Tooltip
  ] = js.undefined
  /**
    * Properties of the chart container
    */
  var containerProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * Highcharts namespace
    */
  var highcharts: js.UndefOr[highchartsLib.highchartsMod.Static] = js.undefined
  /**
    * Immutably recreates the chart on receiving new props
    */
  var immutable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Highcharts options
    */
  var options: js.UndefOr[highchartsLib.highchartsMod.Options] = js.undefined
  /**
    * Flags for `Chart.update` call: redraw, oneToOne, and animation. (Default:
    * [true, true, true])
    */
  var updateArgs: js.UndefOr[
    js.Array[scala.Boolean] | (js.Tuple2[scala.Boolean, scala.Boolean]) | (js.Tuple3[scala.Boolean, scala.Boolean, scala.Boolean])
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    StringDictionary: /* *
    *
    *  Properties
    *
    * */
  /**
    * Indexer for custom properties
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    allowChartUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Highcharts.ChartCallbackFunction */ js.Any = null,
    constructorType: highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialLibStrings.Chart | highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialLibStrings.Renderer | highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialLibStrings.charts | highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialLibStrings.dateFormats | highchartsDashReactDashOfficialLib.highchartsDashReactDashOfficialLibStrings.Tooltip = null,
    containerProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    highcharts: highchartsLib.highchartsMod.Static = null,
    immutable: js.UndefOr[scala.Boolean] = js.undefined,
    options: highchartsLib.highchartsMod.Options = null,
    updateArgs: js.Array[scala.Boolean] | (js.Tuple2[scala.Boolean, scala.Boolean]) | (js.Tuple3[scala.Boolean, scala.Boolean, scala.Boolean]) = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowChartUpdate)) __obj.updateDynamic("allowChartUpdate")(allowChartUpdate)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (constructorType != null) __obj.updateDynamic("constructorType")(constructorType.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps)
    if (highcharts != null) __obj.updateDynamic("highcharts")(highcharts)
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable)
    if (options != null) __obj.updateDynamic("options")(options)
    if (updateArgs != null) __obj.updateDynamic("updateArgs")(updateArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

