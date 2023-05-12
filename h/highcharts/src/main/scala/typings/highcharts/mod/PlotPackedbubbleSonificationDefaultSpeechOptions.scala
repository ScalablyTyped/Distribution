package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPackedbubbleSonificationDefaultSpeechOptions extends StObject {
  
  /**
    * (Highcharts) Define a condition for when a track should be active and
    * not.
    *
    * Can either be a function callback or a configuration object.
    *
    * If a function is used, it should return a `boolean` for whether or not
    * the track should be active. The function is called for each audio event,
    * and receives a parameter object with `time`, and potentially `point` and
    * `value` properties depending on the track. `point` is available if the
    * audio event is related to a data point. `value` is available if the track
    * is used as a context track, and `valueInterval` is used.
    */
  var activeWhen: js.UndefOr[
    js.Object | js.Function | PlotPackedbubbleSonificationDefaultSpeechActiveWhenOptions
  ] = js.undefined
  
  /**
    * (Highcharts) The language to speak in for speech tracks, as an IETF BCP
    * 47 language tag.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) Mapping configuration for the speech/audio parameters.
    *
    * All parameters except `text` can be either:
    *
    * - A string, referencing a point property to map to.
    *
    * - A number, setting the value of the speech parameter directly.
    *
    * - A callback function, returning the value programmatically.
    *
    * - An object defining detailed configuration of the mapping.
    *
    * If a function is used, it should return the desired value for the speech
    * parameter. The function is called for each speech event to be played, and
    * receives a context object parameter with `time`, and potentially `point`
    * and `value` depending on the track. `point` is available if the audio
    * event is related to a data point, and `value` is available if the track
    * is used for a context track using `valueInterval`.
    */
  var mapping: js.UndefOr[PlotPackedbubbleSonificationDefaultSpeechMappingOptions] = js.undefined
  
  /**
    * (Highcharts) Options for point grouping, specifically for instrument
    * tracks.
    */
  var pointGrouping: js.UndefOr[PlotPackedbubbleSonificationDefaultSpeechPointGroupingOptions] = js.undefined
  
  /**
    * (Highcharts) Name of the voice synthesis to prefer for speech tracks.
    *
    * If not available, falls back to the default voice for the selected
    * language.
    *
    * Different platforms provide different voices for web speech synthesis.
    */
  var preferredVoice: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) Show play marker (tooltip and/or crosshair) for a track.
    */
  var showPlayMarker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) Type of track. Always `"instrument"` for instrument tracks,
    * and `"speech"` for speech tracks.
    */
  var `type`: js.UndefOr[OptionsTypeValue] = js.undefined
}
object PlotPackedbubbleSonificationDefaultSpeechOptions {
  
  inline def apply(): PlotPackedbubbleSonificationDefaultSpeechOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPackedbubbleSonificationDefaultSpeechOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotPackedbubbleSonificationDefaultSpeechOptions] (val x: Self) extends AnyVal {
    
    inline def setActiveWhen(value: js.Object | js.Function | PlotPackedbubbleSonificationDefaultSpeechActiveWhenOptions): Self = StObject.set(x, "activeWhen", value.asInstanceOf[js.Any])
    
    inline def setActiveWhenUndefined: Self = StObject.set(x, "activeWhen", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMapping(value: PlotPackedbubbleSonificationDefaultSpeechMappingOptions): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setPointGrouping(value: PlotPackedbubbleSonificationDefaultSpeechPointGroupingOptions): Self = StObject.set(x, "pointGrouping", value.asInstanceOf[js.Any])
    
    inline def setPointGroupingUndefined: Self = StObject.set(x, "pointGrouping", js.undefined)
    
    inline def setPreferredVoice(value: String): Self = StObject.set(x, "preferredVoice", value.asInstanceOf[js.Any])
    
    inline def setPreferredVoiceUndefined: Self = StObject.set(x, "preferredVoice", js.undefined)
    
    inline def setShowPlayMarker(value: Boolean): Self = StObject.set(x, "showPlayMarker", value.asInstanceOf[js.Any])
    
    inline def setShowPlayMarkerUndefined: Self = StObject.set(x, "showPlayMarker", js.undefined)
    
    inline def setType(value: OptionsTypeValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
