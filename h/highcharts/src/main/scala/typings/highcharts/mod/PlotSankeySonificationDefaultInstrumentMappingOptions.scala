package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSankeySonificationDefaultInstrumentMappingOptions extends StObject {
  
  /**
    * (Highcharts) Frequency in Hertz of notes. Overrides pitch mapping if set.
    */
  var frequency: js.UndefOr[
    Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingFrequencyOptions
  ] = js.undefined
  
  /**
    * (Highcharts) Gap in milliseconds between notes if pitch is mapped to an
    * array of notes.
    *
    * Can be set to a fixed value, a prop to map to, a function, or a mapping
    * object.
    */
  var gapBetweenNotes: js.UndefOr[
    Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingGapBetweenNotesOptions
  ] = js.undefined
  
  /**
    * (Highcharts) Mapping options for the highpass filter.
    *
    * A highpass filter lets high frequencies through, but stops low
    * frequencies, making the sound thinner.
    */
  var highpass: js.UndefOr[PlotSankeySonificationDefaultInstrumentMappingHighpassOptions] = js.undefined
  
  /**
    * (Highcharts) Mapping options for the lowpass filter.
    *
    * A lowpass filter lets low frequencies through, but stops high
    * frequencies, making the sound more dull.
    */
  var lowpass: js.UndefOr[PlotSankeySonificationDefaultInstrumentMappingLowpassOptions] = js.undefined
  
  /**
    * (Highcharts) Note duration determines for how long a note plays, in
    * milliseconds.
    *
    * It only affects instruments that are able to play continuous sustained
    * notes. Examples of these instruments from the presets include `flute`,
    * `saxophone`, `trumpet`, `sawsynth`, `wobble`, `basic1`, `basic2`, `sine`,
    * `sineGlide`, `triangle`, `square`, `sawtooth`, `noise`, `filteredNoise`,
    * and `wind`.
    *
    * Can be set to a fixed value, a prop to map to, a function, or a mapping
    * object.
    */
  var noteDuration: js.UndefOr[
    Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingNoteDurationOptions
  ] = js.undefined
  
  /**
    * (Highcharts) Pan refers to the stereo panning position of the sound. It
    * is defined from -1 (left) to 1 (right).
    *
    * By default it is mapped to `x`, making the sound move from left to right
    * as the chart plays.
    *
    * Can be set to a fixed value, a prop to map to, a function, or a mapping
    * object.
    */
  var pan: js.UndefOr[
    Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingPanOptions
  ] = js.undefined
  
  /**
    * (Highcharts) Musical pitch refers to how high or low notes are played.
    *
    * By default it is mapped to `y` so low `y` values are played with a lower
    * pitch, and high values are played with a higher pitch.
    *
    * Pitch mapping has a few extra features compared to other audio
    * parameters.
    *
    * Firstly, it accepts not only number values, but also string values
    * denoting note names. These are given in the form `<note><octave>`, for
    * example `"c6"` or `"F#2"`.
    *
    * Secondly, it is possible to map pitch to an array of notes. In this case,
    * the `gapBetweenNotes` mapping determines the delay between these notes.
    *
    * Thirdly, it is possible to define a musical scale to follow when mapping.
    *
    * Can be set to a fixed value, an array, a prop to map to, a function, or a
    * mapping object.
    */
  var pitch: js.UndefOr[
    Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingPitchOptions | (js.Array[String | Double])
  ] = js.undefined
  
  /**
    * (Highcharts) Milliseconds to wait before playing, comes in addition to
    * the time determined by the `time` mapping.
    *
    * Can also be negative to play before the mapped time.
    */
  var playDelay: js.UndefOr[
    Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingPlayDelayOptions
  ] = js.undefined
  
  /**
    * (Highcharts) Time mapping determines what time each point plays. It is
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
    Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingTimeOptions
  ] = js.undefined
  
  /**
    * (Highcharts) Mapping options for tremolo effects.
    *
    * Tremolo is repeated changes of volume over time.
    */
  var tremolo: js.UndefOr[PlotSankeySonificationDefaultInstrumentMappingTremoloOptions] = js.undefined
  
  /**
    * (Highcharts) The volume of notes, from 0 to 1.
    */
  var volume: js.UndefOr[
    Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingVolumeOptions
  ] = js.undefined
}
object PlotSankeySonificationDefaultInstrumentMappingOptions {
  
  inline def apply(): PlotSankeySonificationDefaultInstrumentMappingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSankeySonificationDefaultInstrumentMappingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotSankeySonificationDefaultInstrumentMappingOptions] (val x: Self) extends AnyVal {
    
    inline def setFrequency(
      value: Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingFrequencyOptions
    ): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setGapBetweenNotes(
      value: Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingGapBetweenNotesOptions
    ): Self = StObject.set(x, "gapBetweenNotes", value.asInstanceOf[js.Any])
    
    inline def setGapBetweenNotesUndefined: Self = StObject.set(x, "gapBetweenNotes", js.undefined)
    
    inline def setHighpass(value: PlotSankeySonificationDefaultInstrumentMappingHighpassOptions): Self = StObject.set(x, "highpass", value.asInstanceOf[js.Any])
    
    inline def setHighpassUndefined: Self = StObject.set(x, "highpass", js.undefined)
    
    inline def setLowpass(value: PlotSankeySonificationDefaultInstrumentMappingLowpassOptions): Self = StObject.set(x, "lowpass", value.asInstanceOf[js.Any])
    
    inline def setLowpassUndefined: Self = StObject.set(x, "lowpass", js.undefined)
    
    inline def setNoteDuration(
      value: Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingNoteDurationOptions
    ): Self = StObject.set(x, "noteDuration", value.asInstanceOf[js.Any])
    
    inline def setNoteDurationUndefined: Self = StObject.set(x, "noteDuration", js.undefined)
    
    inline def setPan(
      value: Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingPanOptions
    ): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setPitch(
      value: Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingPitchOptions | (js.Array[String | Double])
    ): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setPitchVarargs(value: (String | Double)*): Self = StObject.set(x, "pitch", js.Array(value*))
    
    inline def setPlayDelay(
      value: Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingPlayDelayOptions
    ): Self = StObject.set(x, "playDelay", value.asInstanceOf[js.Any])
    
    inline def setPlayDelayUndefined: Self = StObject.set(x, "playDelay", js.undefined)
    
    inline def setTime(
      value: Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingTimeOptions
    ): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTremolo(value: PlotSankeySonificationDefaultInstrumentMappingTremoloOptions): Self = StObject.set(x, "tremolo", value.asInstanceOf[js.Any])
    
    inline def setTremoloUndefined: Self = StObject.set(x, "tremolo", js.undefined)
    
    inline def setVolume(
      value: Double | js.Object | String | js.Function | PlotSankeySonificationDefaultInstrumentMappingVolumeOptions
    ): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
