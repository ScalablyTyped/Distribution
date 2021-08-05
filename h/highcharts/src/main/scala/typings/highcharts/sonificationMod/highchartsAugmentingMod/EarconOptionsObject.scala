package typings.highcharts.sonificationMod.highchartsAugmentingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for an Earcon.
  */
trait EarconOptionsObject extends StObject {
  
  /**
    * The unique ID of the Earcon. Generated if not supplied.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The instruments and their options defining this earcon.
    */
  var instruments: js.Array[EarconInstrument]
  
  /**
    * Callback function to call when earcon has finished playing.
    */
  var onEnd: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Global panning of all instruments. Overrides all panning on
    * individual instruments. Can be a number between -1 and 1.
    */
  var pan: js.UndefOr[Double] = js.undefined
  
  /**
    * Master volume for all instruments. Volume settings on individual
    * instruments can still be used for relative volume between the
    * instruments. This setting does not affect volumes set by functions in
    * individual instruments. Can be a number between 0 and 1. Defaults to
    * 1.
    */
  var volume: js.UndefOr[Double] = js.undefined
}
object EarconOptionsObject {
  
  inline def apply(instruments: js.Array[EarconInstrument]): EarconOptionsObject = {
    val __obj = js.Dynamic.literal(instruments = instruments.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconOptionsObject]
  }
  
  extension [Self <: EarconOptionsObject](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstruments(value: js.Array[EarconInstrument]): Self = StObject.set(x, "instruments", value.asInstanceOf[js.Any])
    
    inline def setInstrumentsVarargs(value: EarconInstrument*): Self = StObject.set(x, "instruments", js.Array(value :_*))
    
    inline def setOnEnd(value: js.Function): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
