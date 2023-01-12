package typings.highcharts.modulesSonificationMod.highchartsAugmentingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define the parameter mapping for an instrument.
  */
trait PointInstrumentMappingObject extends StObject {
  
  /**
    * Define the duration of the notes for this instrument. This can be a
    * string with a data property name, e.g. `'y'`, in which case this data
    * property is used to define the duration relative to the `y`-values of
    * the other points. A higher `y` value would then result in a longer
    * duration. Alternatively, `'-y'` can be used, in which case the
    * polarity is inverted, and a higher `y` value would result in a
    * shorter duration. This option can also be a fixed number or a
    * function. If it is a function, this function is called once before
    * the note starts playing, and should return the duration in
    * milliseconds. It receives two arguments: The point, and the
    * dataExtremes.
    */
  var duration: Double | String | js.Function
  
  /**
    * Define the frequency of the instrument. This can be a string with a
    * data property name, e.g. `'y'`, in which case this data property is
    * used to define the frequency relative to the `y`-values of the other
    * points. A higher `y` value would then result in a higher frequency.
    * Alternatively, `'-y'` can be used, in which case the polarity is
    * inverted, and a higher `y` value would result in a lower frequency.
    * This option can also be a fixed number or a function. If it is a
    * function, this function is called in regular intervals while the note
    * is playing. It receives three arguments: The point, the dataExtremes,
    * and the current relative time - where 0 is the beginning of the note
    * and 1 is the end. The function should return the frequency of the
    * note as a number (in Hz).
    */
  var frequency: Double | String | js.Function
  
  /**
    * Define the panning of the instrument. This can be a string with a
    * data property name, e.g. `'x'`, in which case this data property is
    * used to define the panning relative to the `x`-values of the other
    * points. A higher `x` value would then result in a higher panning
    * value (panned further to the right). Alternatively, `'-x'` can be
    * used, in which case the polarity is inverted, and a higher `x` value
    * would result in a lower panning value (panned further to the left).
    * This option can also be a fixed number or a function. If it is a
    * function, this function is called in regular intervals while the note
    * is playing. It receives three arguments: The point, the dataExtremes,
    * and the current relative time - where 0 is the beginning of the note
    * and 1 is the end. The function should return the panning of the note
    * as a number between -1 and 1.
    */
  var pan: js.UndefOr[Double | String | js.Function] = js.undefined
  
  /**
    * Define the volume of the instrument. This can be a string with a data
    * property name, e.g. `'y'`, in which case this data property is used
    * to define the volume relative to the `y`-values of the other points.
    * A higher `y` value would then result in a higher volume.
    * Alternatively, `'-y'` can be used, which inverts the polarity, so
    * that a higher `y` value results in a lower volume. This option can
    * also be a fixed number or a function. If it is a function, this
    * function is called in regular intervals while the note is playing. It
    * receives three arguments: The point, the dataExtremes, and the
    * current relative time - where 0 is the beginning of the note and 1 is
    * the end. The function should return the volume of the note as a
    * number between 0 and 1.
    */
  var volume: Double | String | js.Function
}
object PointInstrumentMappingObject {
  
  inline def apply(
    duration: Double | String | js.Function,
    frequency: Double | String | js.Function,
    volume: Double | String | js.Function
  ): PointInstrumentMappingObject = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInstrumentMappingObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointInstrumentMappingObject] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double | String | js.Function): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setFrequency(value: Double | String | js.Function): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setPan(value: Double | String | js.Function): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setVolume(value: Double | String | js.Function): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
