package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instrument definition for a point, specifying the instrument to play
  * and how to play it.
  */
trait PointInstrumentObject extends StObject {
  
  /**
    * An Instrument instance or the name of the instrument in the
    * Highcharts.sonification.instruments map.
    */
  var instrument: String | typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Instrument
  
  /**
    * Mapping of instrument parameters for this instrument.
    */
  var instrumentMapping: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.PointInstrumentMappingObject
  
  /**
    * Options for this instrument.
    */
  var instrumentOptions: js.UndefOr[
    typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.PointInstrumentOptionsObject
  ] = js.undefined
  
  /**
    * Callback to call when the instrument has stopped playing.
    */
  var onEnd: js.UndefOr[js.Function] = js.undefined
}
object PointInstrumentObject {
  
  inline def apply(
    instrument: String | typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Instrument,
    instrumentMapping: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.PointInstrumentMappingObject
  ): PointInstrumentObject = {
    val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any], instrumentMapping = instrumentMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInstrumentObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointInstrumentObject] (val x: Self) extends AnyVal {
    
    inline def setInstrument(value: String | typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Instrument): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    
    inline def setInstrumentMapping(
      value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.PointInstrumentMappingObject
    ): Self = StObject.set(x, "instrumentMapping", value.asInstanceOf[js.Any])
    
    inline def setInstrumentOptions(
      value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.PointInstrumentOptionsObject
    ): Self = StObject.set(x, "instrumentOptions", value.asInstanceOf[js.Any])
    
    inline def setInstrumentOptionsUndefined: Self = StObject.set(x, "instrumentOptions", js.undefined)
    
    inline def setOnEnd(value: js.Function): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
  }
}
