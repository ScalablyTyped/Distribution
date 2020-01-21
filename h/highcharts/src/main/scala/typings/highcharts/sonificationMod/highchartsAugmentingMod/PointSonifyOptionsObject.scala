package typings.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for sonifying a point.
  */
trait PointSonifyOptionsObject extends js.Object {
  /**
    * Optionally provide the minimum/maximum values for the points. If this
    * is not supplied, it is calculated from the points in the chart on
    * demand. This option is supplied in the following format, as a map of
    * point data properties to objects with min/max values: (see online
    * documentation for example)
    */
  var dataExtremes: js.UndefOr[js.Object] = js.undefined
  /**
    * The instrument definitions for this point.
    */
  var instruments: js.Array[PointInstrumentObject]
  /**
    * Callback called when the sonification has finished.
    */
  var onEnd: js.UndefOr[js.Function] = js.undefined
}

object PointSonifyOptionsObject {
  @scala.inline
  def apply(
    instruments: js.Array[PointInstrumentObject],
    dataExtremes: js.Object = null,
    onEnd: js.Function = null
  ): PointSonifyOptionsObject = {
    val __obj = js.Dynamic.literal(instruments = instruments.asInstanceOf[js.Any])
    if (dataExtremes != null) __obj.updateDynamic("dataExtremes")(dataExtremes.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointSonifyOptionsObject]
  }
}

