package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotAdSonificationDefaultSpeechMappingOptions extends StObject {
  
  /**
    * (Highstock) Speech pitch (how high/low the voice is) multiplier.
    */
  var pitch: js.UndefOr[
    Double | js.Object | String | js.Function | PlotAdSonificationDefaultSpeechMappingPitchOptions
  ] = js.undefined
  
  /**
    * (Highstock) Milliseconds to wait before playing, comes in addition to the
    * time determined by the `time` mapping.
    *
    * Can also be negative to play before the mapped time.
    */
  var playDelay: js.UndefOr[
    Double | js.Object | String | js.Function | PlotAdSonificationDefaultSpeechMappingPlayDelayOptions
  ] = js.undefined
  
  /**
    * (Highstock) Speech rate (speed) multiplier.
    */
  var rate: js.UndefOr[
    Double | js.Object | String | js.Function | PlotAdSonificationDefaultSpeechMappingRateOptions
  ] = js.undefined
  
  /**
    * (Highstock) The text to announce for speech tracks. Can either be a
    * format string or a function.
    *
    * If it is a function, it should return the format string to announce. The
    * function is called for each audio event, and receives a parameter object
    * with `time`, and potentially `point` and `value` properties depending on
    * the track. `point` is available if the audio event is related to a data
    * point. `value` is available if the track is used as a context track, and
    * `valueInterval` is used.
    *
    * If it is a format string, in addition to normal string content, format
    * values can be accessed using bracket notation. For example `"Value is
    * {point.y}%"`.
    *
    * `time`, `point` and `value` are available to the format strings similarly
    * to with functions. Nested properties can be accessed with dot notation,
    * for example `"Density: {point.options.custom.density}"`
    */
  var text: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * (Highstock) Time mapping determines what time each point plays. It is
    * defined as an offset in milliseconds, where 0 means it plays immediately
    * when the chart is sonified.
    *
    * By default time is mapped to `x`, meaning points with the lowest `x`
    * value plays first, and points with the highest `x` value plays last.
    *
    * Can be set to a fixed value, a prop to map to, a function, or a mapping
    * object.
    */
  var time: js.UndefOr[
    Double | js.Object | String | js.Function | PlotAdSonificationDefaultSpeechMappingTimeOptions
  ] = js.undefined
  
  /**
    * (Highstock) Volume of the speech announcement.
    */
  var volume: js.UndefOr[
    Double | js.Object | String | js.Function | PlotAdSonificationDefaultSpeechMappingVolumeOptions
  ] = js.undefined
}
object PlotAdSonificationDefaultSpeechMappingOptions {
  
  inline def apply(): PlotAdSonificationDefaultSpeechMappingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAdSonificationDefaultSpeechMappingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotAdSonificationDefaultSpeechMappingOptions] (val x: Self) extends AnyVal {
    
    inline def setPitch(
      value: Double | js.Object | String | js.Function | PlotAdSonificationDefaultSpeechMappingPitchOptions
    ): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setPlayDelay(
      value: Double | js.Object | String | js.Function | PlotAdSonificationDefaultSpeechMappingPlayDelayOptions
    ): Self = StObject.set(x, "playDelay", value.asInstanceOf[js.Any])
    
    inline def setPlayDelayUndefined: Self = StObject.set(x, "playDelay", js.undefined)
    
    inline def setRate(
      value: Double | js.Object | String | js.Function | PlotAdSonificationDefaultSpeechMappingRateOptions
    ): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setText(value: String | js.Function): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTime(
      value: Double | js.Object | String | js.Function | PlotAdSonificationDefaultSpeechMappingTimeOptions
    ): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setVolume(
      value: Double | js.Object | String | js.Function | PlotAdSonificationDefaultSpeechMappingVolumeOptions
    ): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
