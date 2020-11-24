package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instrument definition for a point, specifying the instrument to play
  * and how to play it.
  */
@js.native
trait PointInstrumentObject extends js.Object {
  
  /**
    * An Instrument instance or the name of the instrument in the
    * Highcharts.sonification.instruments map.
    */
  var instrument: String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Instrument = js.native
  
  /**
    * Mapping of instrument parameters for this instrument.
    */
  var instrumentMapping: typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentMappingObject = js.native
  
  /**
    * Options for this instrument.
    */
  var instrumentOptions: js.UndefOr[
    typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentOptionsObject
  ] = js.native
  
  /**
    * Callback to call when the instrument has stopped playing.
    */
  var onEnd: js.UndefOr[js.Function] = js.native
}
object PointInstrumentObject {
  
  @scala.inline
  def apply(
    instrument: String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Instrument,
    instrumentMapping: typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentMappingObject
  ): PointInstrumentObject = {
    val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any], instrumentMapping = instrumentMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInstrumentObject]
  }
  
  @scala.inline
  implicit class PointInstrumentObjectOps[Self <: PointInstrumentObject] (val x: Self) extends AnyVal {
    
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
    def setInstrument(value: String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Instrument): Self = this.set("instrument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentMapping(value: typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentMappingObject): Self = this.set("instrumentMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentOptions(value: typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentOptionsObject): Self = this.set("instrumentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstrumentOptions: Self = this.set("instrumentOptions", js.undefined)
    
    @scala.inline
    def setOnEnd(value: js.Function): Self = this.set("onEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
  }
}
