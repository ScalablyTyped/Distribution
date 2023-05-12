package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotCmoSonificationContextTracksOptions extends StObject {
  
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
  var activeWhen: js.UndefOr[js.Object | js.Function | PlotCmoSonificationContextTracksActiveWhenOptions] = js.undefined
  
  /**
    * (Highstock) Instrument to use for playing.
    *
    * Can either be a string referencing a synth preset, or it can be a synth
    * configuration object.
    */
  var instrument: js.UndefOr[String | SynthPatchOptionsObject] = js.undefined
  
  /**
    * (Highstock) Mapping options for the audio parameters.
    *
    * All parameters can be either:
    *
    * - A string, referencing a point property to map to.
    *
    * - A number, setting the value of the audio parameter directly.
    *
    * - A callback function, returning the value programmatically.
    *
    * - An object defining detailed configuration of the mapping.
    *
    * If a function is used, it should return the desired value for the audio
    * parameter. The function is called for each audio event to be played, and
    * receives a context object parameter with `time`, and potentially `point`
    * and `value` depending on the track. `point` is available if the audio
    * event is related to a data point, and `value` is available if the track
    * is used for a context track using `valueInterval`.
    */
  var mapping: js.UndefOr[PlotCmoSonificationContextTracksMappingOptions] = js.undefined
  
  /**
    * (Highstock) Name to use for a track when exporting to MIDI. By default it
    * uses the series name if the track is related to a series.
    */
  var midiName: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Options for point grouping, specifically for instrument
    * tracks.
    */
  var pointGrouping: js.UndefOr[PlotCmoSonificationContextTracksPointGroupingOptions] = js.undefined
  
  /**
    * (Highstock) Round pitch mapping to musical notes.
    *
    * If `false`, will play the exact mapped note, even if it is out of tune
    * compared to the musical notes as defined by 440Hz standard tuning.
    */
  var roundToMusicalNotes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) Show play marker (tooltip and/or crosshair) for a track.
    */
  var showPlayMarker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) Set a context track to play periodically every `timeInterval`
    * milliseconds while the sonification is playing.
    */
  var timeInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Type of track. Always `"instrument"` for instrument tracks,
    * and `"speech"` for speech tracks.
    */
  var `type`: js.UndefOr[OptionsTypeValue] = js.undefined
  
  /**
    * (Highstock) Set a context track to play periodically every
    * `valueInterval` units of a data property `valueProp` while the
    * sonification is playing.
    *
    * For example, setting `valueProp` to `x` and `valueInterval` to 5 will
    * play the context track for every 5th X value.
    *
    * The context audio events will be mapped to time according to the prop
    * value relative to the min/max values for that prop.
    */
  var valueInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) How to map context events to time when using the
    * `valueInterval` option.
    */
  var valueMapFunction: js.UndefOr[OptionsValueMapFunctionValue] = js.undefined
  
  /**
    * (Highstock) The point property to play context for when using
    * `valueInterval`.
    */
  var valueProp: js.UndefOr[String] = js.undefined
}
object PlotCmoSonificationContextTracksOptions {
  
  inline def apply(): PlotCmoSonificationContextTracksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotCmoSonificationContextTracksOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotCmoSonificationContextTracksOptions] (val x: Self) extends AnyVal {
    
    inline def setActiveWhen(value: js.Object | js.Function | PlotCmoSonificationContextTracksActiveWhenOptions): Self = StObject.set(x, "activeWhen", value.asInstanceOf[js.Any])
    
    inline def setActiveWhenUndefined: Self = StObject.set(x, "activeWhen", js.undefined)
    
    inline def setInstrument(value: String | SynthPatchOptionsObject): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    
    inline def setInstrumentUndefined: Self = StObject.set(x, "instrument", js.undefined)
    
    inline def setMapping(value: PlotCmoSonificationContextTracksMappingOptions): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMidiName(value: String): Self = StObject.set(x, "midiName", value.asInstanceOf[js.Any])
    
    inline def setMidiNameUndefined: Self = StObject.set(x, "midiName", js.undefined)
    
    inline def setPointGrouping(value: PlotCmoSonificationContextTracksPointGroupingOptions): Self = StObject.set(x, "pointGrouping", value.asInstanceOf[js.Any])
    
    inline def setPointGroupingUndefined: Self = StObject.set(x, "pointGrouping", js.undefined)
    
    inline def setRoundToMusicalNotes(value: Boolean): Self = StObject.set(x, "roundToMusicalNotes", value.asInstanceOf[js.Any])
    
    inline def setRoundToMusicalNotesUndefined: Self = StObject.set(x, "roundToMusicalNotes", js.undefined)
    
    inline def setShowPlayMarker(value: Boolean): Self = StObject.set(x, "showPlayMarker", value.asInstanceOf[js.Any])
    
    inline def setShowPlayMarkerUndefined: Self = StObject.set(x, "showPlayMarker", js.undefined)
    
    inline def setTimeInterval(value: Double): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
    
    inline def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
    
    inline def setType(value: OptionsTypeValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueInterval(value: Double): Self = StObject.set(x, "valueInterval", value.asInstanceOf[js.Any])
    
    inline def setValueIntervalUndefined: Self = StObject.set(x, "valueInterval", js.undefined)
    
    inline def setValueMapFunction(value: OptionsValueMapFunctionValue): Self = StObject.set(x, "valueMapFunction", value.asInstanceOf[js.Any])
    
    inline def setValueMapFunctionUndefined: Self = StObject.set(x, "valueMapFunction", js.undefined)
    
    inline def setValueProp(value: String): Self = StObject.set(x, "valueProp", value.asInstanceOf[js.Any])
    
    inline def setValuePropUndefined: Self = StObject.set(x, "valueProp", js.undefined)
  }
}
