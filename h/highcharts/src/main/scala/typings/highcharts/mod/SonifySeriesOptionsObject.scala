package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for sonifying a series.
  */
trait SonifySeriesOptionsObject extends js.Object {
  /**
    * Optionally provide the minimum/maximum data values for the points. If
    * this is not supplied, it is calculated from all points in the chart
    * on demand. This option is supplied in the following format, as a map
    * of point data properties to objects with min/max values: (see online
    * documentation for example)
    */
  var dataExtremes: js.UndefOr[js.Object] = js.undefined
  /**
    * The duration for playing the points. Note that points might continue
    * to play after the duration has passed, but no new points will start
    * playing.
    */
  var duration: Double
  /**
    * Earcons to add to the series.
    */
  var earcons: js.UndefOr[
    js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.EarconConfiguration]
  ] = js.undefined
  /**
    * The instrument definitions for the points in this series.
    */
  var instruments: js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject]
  /**
    * Callback after the series has played.
    */
  var onEnd: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback after a point has finished playing.
    */
  var onPointEnd: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback before a point is played.
    */
  var onPointStart: js.UndefOr[js.Function] = js.undefined
  /**
    * The axis to use for when to play the points. Can be a string with a
    * data property (e.g. `x`), or a function. If it is a function, this
    * function receives the point as argument, and should return a numeric
    * value. The points with the lowest numeric values are then played
    * first, and the time between points will be proportional to the
    * distance between the numeric values.
    */
  var pointPlayTime: String | js.Function
}

object SonifySeriesOptionsObject {
  @scala.inline
  def apply(
    duration: Double,
    instruments: js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject],
    pointPlayTime: String | js.Function,
    dataExtremes: js.Object = null,
    earcons: js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.EarconConfiguration] = null,
    onEnd: js.Function = null,
    onPointEnd: js.Function = null,
    onPointStart: js.Function = null
  ): SonifySeriesOptionsObject = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], instruments = instruments.asInstanceOf[js.Any], pointPlayTime = pointPlayTime.asInstanceOf[js.Any])
    if (dataExtremes != null) __obj.updateDynamic("dataExtremes")(dataExtremes.asInstanceOf[js.Any])
    if (earcons != null) __obj.updateDynamic("earcons")(earcons.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd.asInstanceOf[js.Any])
    if (onPointEnd != null) __obj.updateDynamic("onPointEnd")(onPointEnd.asInstanceOf[js.Any])
    if (onPointStart != null) __obj.updateDynamic("onPointStart")(onPointStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonifySeriesOptionsObject]
  }
}

