package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSupertrendSonificationDefaultSpeechOptions extends StObject {
  
  /**
    * (Highstock) Define a condition for when a track should be active and not.
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
    js.Object | js.Function | PlotSupertrendSonificationDefaultSpeechActiveWhenOptions
  ] = js.undefined
  
  /**
    * (Highstock) The language to speak in for speech tracks, as an IETF BCP 47
    * language tag.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Mapping configuration for the speech/audio parameters.
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
  var mapping: js.UndefOr[PlotSupertrendSonificationDefaultSpeechMappingOptions] = js.undefined
  
  /**
    * (Highstock) Options for point grouping, specifically for instrument
    * tracks.
    */
  var pointGrouping: js.UndefOr[PlotSupertrendSonificationDefaultSpeechPointGroupingOptions] = js.undefined
  
  /**
    * (Highstock) Name of the voice synthesis to prefer for speech tracks.
    *
    * If not available, falls back to the default voice for the selected
    * language.
    *
    * Different platforms provide different voices for web speech synthesis.
    */
  var preferredVoice: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Show play marker (tooltip and/or crosshair) for a track.
    */
  var showPlayMarker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) Type of track. Always `"instrument"` for instrument tracks,
    * and `"speech"` for speech tracks.
    */
  var `type`: js.UndefOr[OptionsTypeValue] = js.undefined
}
object PlotSupertrendSonificationDefaultSpeechOptions {
  
  inline def apply(): PlotSupertrendSonificationDefaultSpeechOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSupertrendSonificationDefaultSpeechOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotSupertrendSonificationDefaultSpeechOptions] (val x: Self) extends AnyVal {
    
    inline def setActiveWhen(value: js.Object | js.Function | PlotSupertrendSonificationDefaultSpeechActiveWhenOptions): Self = StObject.set(x, "activeWhen", value.asInstanceOf[js.Any])
    
    inline def setActiveWhenUndefined: Self = StObject.set(x, "activeWhen", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMapping(value: PlotSupertrendSonificationDefaultSpeechMappingOptions): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setPointGrouping(value: PlotSupertrendSonificationDefaultSpeechPointGroupingOptions): Self = StObject.set(x, "pointGrouping", value.asInstanceOf[js.Any])
    
    inline def setPointGroupingUndefined: Self = StObject.set(x, "pointGrouping", js.undefined)
    
    inline def setPreferredVoice(value: String): Self = StObject.set(x, "preferredVoice", value.asInstanceOf[js.Any])
    
    inline def setPreferredVoiceUndefined: Self = StObject.set(x, "preferredVoice", js.undefined)
    
    inline def setShowPlayMarker(value: Boolean): Self = StObject.set(x, "showPlayMarker", value.asInstanceOf[js.Any])
    
    inline def setShowPlayMarkerUndefined: Self = StObject.set(x, "showPlayMarker", js.undefined)
    
    inline def setType(value: OptionsTypeValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
