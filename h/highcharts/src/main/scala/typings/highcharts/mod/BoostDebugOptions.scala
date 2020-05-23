package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoostDebugOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Show the number of points
    * skipped through culling.
    *
    * When set to true, the number of points skipped in series processing is
    * outputted. Points are skipped if they are closer than 1 pixel from each
    * other.
    */
  var showSkipSummary: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the WebGL to SVG buffer
    * copy
    *
    * After rendering, the result is copied to an image which is injected into
    * the SVG.
    *
    * If this property is set to true, the time it takes for the buffer copy to
    * complete is outputted.
    */
  var timeBufferCopy: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the building of the k-d
    * tree.
    *
    * This outputs the time spent building the k-d tree used for markers etc.
    *
    * Note that the k-d tree is built async, and runs post-rendering.
    * Following, it does not affect the performance of the rendering itself.
    */
  var timeKDTree: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the series rendering.
    *
    * This outputs the time spent on actual rendering in the console when set
    * to true.
    */
  var timeRendering: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the series processing.
    *
    * This outputs the time spent on transforming the series data to vertex
    * buffers when set to true.
    */
  var timeSeriesProcessing: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the the WebGL setup.
    *
    * This outputs the time spent on setting up the WebGL context, creating
    * shaders, and textures.
    */
  var timeSetup: js.UndefOr[Boolean] = js.undefined
}

object BoostDebugOptions {
  @scala.inline
  def apply(
    showSkipSummary: js.UndefOr[Boolean] = js.undefined,
    timeBufferCopy: js.UndefOr[Boolean] = js.undefined,
    timeKDTree: js.UndefOr[Boolean] = js.undefined,
    timeRendering: js.UndefOr[Boolean] = js.undefined,
    timeSeriesProcessing: js.UndefOr[Boolean] = js.undefined,
    timeSetup: js.UndefOr[Boolean] = js.undefined
  ): BoostDebugOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showSkipSummary)) __obj.updateDynamic("showSkipSummary")(showSkipSummary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeBufferCopy)) __obj.updateDynamic("timeBufferCopy")(timeBufferCopy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeKDTree)) __obj.updateDynamic("timeKDTree")(timeKDTree.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeRendering)) __obj.updateDynamic("timeRendering")(timeRendering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeSeriesProcessing)) __obj.updateDynamic("timeSeriesProcessing")(timeSeriesProcessing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeSetup)) __obj.updateDynamic("timeSetup")(timeSetup.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoostDebugOptions]
  }
}

