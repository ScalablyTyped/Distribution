package typings.highchartsReactOfficial.highchartsReactMod.HighchartsReact

import org.scalablytyped.runtime.StringDictionary
import typings.highcharts.mod.ChartCallbackFunction
import typings.highcharts.mod.Chart_
import typings.highcharts.mod.Options
import typings.highchartsReactOfficial.TypeofHighcharts
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
/* key */ StringDictionary[js.Any] {
  /**
    * Flag for `Chart.update` call (Default: true)
    */
  var allowChartUpdate: js.UndefOr[Boolean] = js.undefined
  /* *
    *
    *  Functions
    *
    * */
  /**
    * Callback for the chart factory
    */
  var callback: js.UndefOr[ChartCallbackFunction] = js.undefined
  /**
    * Reference to the chart factory (Default: chart)
    */
  var constructorType: js.UndefOr[String] = js.undefined
  /**
    * Properties of the chart container
    */
  var containerProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Highcharts namespace
    */
  var highcharts: js.UndefOr[TypeofHighcharts] = js.undefined
  /**
    * Immutably recreates the chart on receiving new props
    */
  var immutable: js.UndefOr[Boolean] = js.undefined
  /**
    * Highcharts options
    */
  var options: js.UndefOr[Options] = js.undefined
  /**
    * Flags for `Chart.update` call: redraw, oneToOne, and animation. (Default:
    * [true, true, true])
    */
  var updateArgs: js.UndefOr[
    js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean])
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
  /* key */ StringDictionary[js.Any] = null,
    allowChartUpdate: js.UndefOr[Boolean] = js.undefined,
    callback: /* chart */ Chart_ => Unit = null,
    constructorType: String = null,
    containerProps: StringDictionary[js.Any] = null,
    highcharts: TypeofHighcharts = null,
    immutable: js.UndefOr[Boolean] = js.undefined,
    options: Options = null,
    updateArgs: js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean]) = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowChartUpdate)) __obj.updateDynamic("allowChartUpdate")(allowChartUpdate.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (constructorType != null) __obj.updateDynamic("constructorType")(constructorType.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (highcharts != null) __obj.updateDynamic("highcharts")(highcharts.asInstanceOf[js.Any])
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (updateArgs != null) __obj.updateDynamic("updateArgs")(updateArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

