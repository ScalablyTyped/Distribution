package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instrument definition for a point, specifying the instrument to play
  * and how to play it.
  */
trait PointInstrumentObject extends js.Object {
  /**
    * An Instrument instance or the name of the instrument in the
    * Highcharts.sonification.instruments map.
    */
  var instrument: String | typings.highcharts.modulesSonificationMod.highchartsMod.Instrument
  /**
    * Mapping of instrument parameters for this instrument.
    */
  var instrumentMapping: typings.highcharts.modulesSonificationMod.highchartsMod.PointInstrumentMappingObject
  /**
    * Options for this instrument.
    */
  var instrumentOptions: js.UndefOr[
    typings.highcharts.modulesSonificationMod.highchartsMod.PointInstrumentOptionsObject
  ] = js.undefined
  /**
    * Callback to call when the instrument has stopped playing.
    */
  var onEnd: js.UndefOr[js.Function] = js.undefined
}

object PointInstrumentObject {
  @scala.inline
  def apply(
    instrument: String | typings.highcharts.modulesSonificationMod.highchartsMod.Instrument,
    instrumentMapping: typings.highcharts.modulesSonificationMod.highchartsMod.PointInstrumentMappingObject,
    instrumentOptions: typings.highcharts.modulesSonificationMod.highchartsMod.PointInstrumentOptionsObject = null,
    onEnd: js.Function = null
  ): PointInstrumentObject = {
    val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any], instrumentMapping = instrumentMapping.asInstanceOf[js.Any])
    if (instrumentOptions != null) __obj.updateDynamic("instrumentOptions")(instrumentOptions.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInstrumentObject]
  }
}

