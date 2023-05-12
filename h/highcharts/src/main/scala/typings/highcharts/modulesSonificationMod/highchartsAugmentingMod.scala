package typings.highcharts.modulesSonificationMod

import typings.highcharts.anon.RecordSonificationSynthPr
import typings.highcharts.mod.SynthPatchOptionsObject
import typings.std.AudioDestinationNode
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object highchartsAugmentingMod {
  
  @js.native
  trait Chart extends StObject {
    
    /**
      * Sonification capabilities for the chart.
      */
    var sonification: js.UndefOr[Sonification] = js.native
    
    /**
      * Play a sonification of a chart.
      *
      * @param onEnd
      *        Callback to call after play completed
      */
    def sonify(): Unit = js.native
    def sonify(onEnd: SonificationChartEventCallback): Unit = js.native
    
    /**
      * Play/pause sonification of a chart.
      *
      * @param reset
      *        Reset the playing cursor after play completed. Defaults to
      *        `true`.
      *
      * @param onEnd
      *        Callback to call after play completed
      */
    def toggleSonify(): Unit = js.native
    def toggleSonify(reset: Boolean): Unit = js.native
    def toggleSonify(reset: Boolean, onEnd: SonificationChartEventCallback): Unit = js.native
    def toggleSonify(reset: Unit, onEnd: SonificationChartEventCallback): Unit = js.native
  }
  
  @js.native
  trait Point extends StObject {
    
    /**
      * Play a sonification of a point.
      *
      * @param onEnd
      *        Callback to call after play completed
      */
    def sonify(): Unit = js.native
    def sonify(onEnd: SonificationChartEventCallback): Unit = js.native
  }
  
  @js.native
  trait Series extends StObject {
    
    /**
      * Play a sonification of a series.
      *
      * @param onEnd
      *        Callback to call after play completed
      */
    def sonify(): Unit = js.native
    def sonify(onEnd: SonificationChartEventCallback): Unit = js.native
  }
  
  /**
    * The Sonification class. This class represents a chart's sonification
    * capabilities. A chart automatically gets an instance of this class when
    * applicable.
    */
  @js.native
  trait Sonification extends StObject {
    
    /**
      * Cancel current playing audio and reset the timeline.
      */
    def cancel(): Unit = js.native
    
    /**
      * Start download of a MIDI file export of the timeline.
      */
    def downloadMIDI(): Unit = js.native
    
    /**
      * Get last played point
      *
      * @return The point, or null if none
      */
    def getLastPlayedPoint(): Point | Null = js.native
    
    /**
      * Check if sonification is playing currently
      *
      * @return `true` if currently playing, `false` if not
      */
    def isPlaying(): Boolean = js.native
    
    /**
      * Play point(s)/event(s) adjacent to current timeline cursor location.
      *
      * @param next
      *        Pass `true` to play next point, `false` for previous
      *
      * @param onEnd
      *        Callback to call after play completed
      *
      * @param eventFilter
      *        Filter to apply to the events before finding adjacent to play
      */
    def playAdjacent(next: Double): Unit = js.native
    def playAdjacent(next: Double, onEnd: Unit, eventFilter: SonificationTimelineFilterCallback): Unit = js.native
    def playAdjacent(next: Double, onEnd: SonificationChartEventCallback): Unit = js.native
    def playAdjacent(
      next: Double,
      onEnd: SonificationChartEventCallback,
      eventFilter: SonificationTimelineFilterCallback
    ): Unit = js.native
    
    /**
      * Play next/previous series, picking the point closest to a prop value
      * from last played point. By default picks the point in the adjacent
      * series with the closest x value as the last played point.
      *
      * @param next
      *        Pass `true` to play next series, `false` for previous
      *
      * @param prop
      *        Prop to find closest value of, defaults to `x`.
      *
      * @param onEnd
      *        Callback to call after play completed
      *
      * @return The played series, or `null` if none found
      */
    def playAdjacentSeries(next: Double): Series | Null = js.native
    def playAdjacentSeries(next: Double, prop: String): Series | Null = js.native
    def playAdjacentSeries(next: Double, prop: String, onEnd: SonificationChartEventCallback): Series | Null = js.native
    def playAdjacentSeries(next: Double, prop: Unit, onEnd: SonificationChartEventCallback): Series | Null = js.native
    
    /**
      * Play point(s)/event(s) closest to a prop relative to a reference
      * value.
      *
      * @param prop
      *        Prop to compare.
      *
      * @param targetValue
      *        Target value to find closest value of.
      *
      * @param targetFilter
      *        Filter to apply to the events before finding closest point(s)
      *
      * @param onEnd
      *        Callback to call after play completed
      */
    def playClosestToProp(prop: String, targetValue: Double): Unit = js.native
    def playClosestToProp(prop: String, targetValue: Double, targetFilter: Unit, onEnd: SonificationChartEventCallback): Unit = js.native
    def playClosestToProp(prop: String, targetValue: Double, targetFilter: SonificationTimelineFilterCallback): Unit = js.native
    def playClosestToProp(
      prop: String,
      targetValue: Double,
      targetFilter: SonificationTimelineFilterCallback,
      onEnd: SonificationChartEventCallback
    ): Unit = js.native
    
    def playNote(instrument: SynthPatchOptionsObject, options: SonificationInstrumentScheduledEventOptionsObject): Unit = js.native
    def playNote(
      instrument: SynthPatchOptionsObject,
      options: SonificationInstrumentScheduledEventOptionsObject,
      delayMs: Double
    ): Unit = js.native
    /**
      * Play a note with a specific instrument, and optionally a time offset.
      *
      * @param instrument
      *        The instrument to play. Can be either a string referencing the
      *        instrument presets, or an actual SynthPatch configuration.
      *
      * @param options
      *        Configuration for the instrument event to play.
      *
      * @param delayMs
      *        Time offset from now, in milliseconds. Defaults to 0.
      */
    def playNote(instrument: SonificationSynthPreset, options: SonificationInstrumentScheduledEventOptionsObject): Unit = js.native
    def playNote(
      instrument: SonificationSynthPreset,
      options: SonificationInstrumentScheduledEventOptionsObject,
      delayMs: Double
    ): Unit = js.native
    
    /**
      * Divide timeline into 100 parts of equal time, and play one of them.
      * Can be used for scrubbing navigation.
      *
      * @param segment
      *        The segment to play, from 0 to 100
      *
      * @param onEnd
      *        Callback to call after play completed
      */
    def playSegment(segment: Double): Unit = js.native
    def playSegment(segment: Double, onEnd: SonificationChartEventCallback): Unit = js.native
    
    /**
      * Set the audio destination node to something other than the default
      * output. This allows for inserting custom WebAudio chains after the
      * sonification.
      *
      * @param audioDestination
      *        The destination node
      */
    def setAudioDestination(audioDestination: AudioDestinationNode): Unit = js.native
    
    /**
      * Speak a text string, optionally with a custom speaker configuration
      *
      * @param text
      *        Text to announce
      *
      * @param speakerOptions
      *        Options for the announcement
      *
      * @param delayMs
      *        Time offset from now, in milliseconds. Defaults to 0.
      */
    def speak(text: String): Unit = js.native
    def speak(text: String, speakerOptions: Unit, delayMs: Double): Unit = js.native
    def speak(text: String, speakerOptions: SonificationSpeakerOptionsObject): Unit = js.native
    def speak(text: String, speakerOptions: SonificationSpeakerOptionsObject, delayMs: Double): Unit = js.native
  }
  
  /**
    * Callback function for sonification events on chart.
    *
    * @param e
    *        Sonification chart event context
    */
  type SonificationChartEventCallback = js.Function1[/* e */ SonificationChartEventCallbackContext, Unit]
  
  /**
    * Event context object sent to sonification chart events.
    */
  trait SonificationChartEventCallbackContext extends StObject {
    
    /**
      * The relevant chart
      */
    var chart: js.UndefOr[Chart] = js.undefined
    
    /**
      * The points that were played, if any
      */
    var pointsPlayed: js.UndefOr[js.Array[Point]] = js.undefined
    
    /**
      * The playing timeline object with advanced and internal content
      */
    var timeline: js.UndefOr[js.Object] = js.undefined
  }
  object SonificationChartEventCallbackContext {
    
    inline def apply(): SonificationChartEventCallbackContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SonificationChartEventCallbackContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SonificationChartEventCallbackContext] (val x: Self) extends AnyVal {
      
      inline def setChart(value: Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
      
      inline def setPointsPlayed(value: js.Array[Point]): Self = StObject.set(x, "pointsPlayed", value.asInstanceOf[js.Any])
      
      inline def setPointsPlayedUndefined: Self = StObject.set(x, "pointsPlayed", js.undefined)
      
      inline def setPointsPlayedVarargs(value: Point*): Self = StObject.set(x, "pointsPlayed", js.Array(value*))
      
      inline def setTimeline(value: js.Object): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
      
      inline def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
    }
  }
  
  /**
    * Collection of Sonification classes and objects.
    */
  trait SonificationGlobalObject extends StObject {
    
    /**
      * SynthPatch presets
      */
    var InstrumentPresets: js.UndefOr[RecordSonificationSynthPr] = js.undefined
    
    /**
      * Musical scale presets
      */
    var Scales: js.UndefOr[SonificationScalePresetsObject] = js.undefined
    
    /**
      * SonificationInstrument class
      */
    var SonificationInstrument: js.UndefOr[
        typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationInstrument
      ] = js.undefined
    
    /**
      * SonificationSpeaker class
      */
    var SonificationSpeaker: js.UndefOr[
        typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSpeaker
      ] = js.undefined
    
    /**
      * SynthPatch class
      */
    var SynthPatch: js.UndefOr[typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SynthPatch] = js.undefined
  }
  object SonificationGlobalObject {
    
    inline def apply(): SonificationGlobalObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SonificationGlobalObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SonificationGlobalObject] (val x: Self) extends AnyVal {
      
      inline def setInstrumentPresets(value: RecordSonificationSynthPr): Self = StObject.set(x, "InstrumentPresets", value.asInstanceOf[js.Any])
      
      inline def setInstrumentPresetsUndefined: Self = StObject.set(x, "InstrumentPresets", js.undefined)
      
      inline def setScales(value: SonificationScalePresetsObject): Self = StObject.set(x, "Scales", value.asInstanceOf[js.Any])
      
      inline def setScalesUndefined: Self = StObject.set(x, "Scales", js.undefined)
      
      inline def setSonificationInstrument(value: SonificationInstrument): Self = StObject.set(x, "SonificationInstrument", value.asInstanceOf[js.Any])
      
      inline def setSonificationInstrumentUndefined: Self = StObject.set(x, "SonificationInstrument", js.undefined)
      
      inline def setSonificationSpeaker(value: SonificationSpeaker): Self = StObject.set(x, "SonificationSpeaker", value.asInstanceOf[js.Any])
      
      inline def setSonificationSpeakerUndefined: Self = StObject.set(x, "SonificationSpeaker", js.undefined)
      
      inline def setSynthPatch(value: SynthPatch): Self = StObject.set(x, "SynthPatch", value.asInstanceOf[js.Any])
      
      inline def setSynthPatchUndefined: Self = StObject.set(x, "SynthPatch", js.undefined)
    }
  }
  
  /**
    * The SonificationInstrument class. This class represents an instrument
    * with mapping capabilities. The instrument wraps a SynthPatch object, and
    * extends it with functionality such as panning, tremolo, and global
    * low/highpass filters.
    */
  @js.native
  trait SonificationInstrument extends StObject {
    
    /**
      * Cancel currently playing sounds and any scheduled actions.
      */
    def cancel(): Unit = js.native
    
    /**
      * Stop instrument and destroy it, cleaning up used resources.
      */
    def destroy(): Unit = js.native
    
    def musicalNoteToFrequency(note: String): Double = js.native
    /**
      * Convert a note value to a frequency.
      *
      * @param note
      *        Note to convert. Can be a string 'c0' to 'b8' or a number of
      *        semitones from c0.
      *
      * @return The converted frequency
      */
    def musicalNoteToFrequency(note: Double): Double = js.native
    
    /**
      * Schedule an instrument event at a given time offset, whether it is
      * playing a note or changing the parameters of the instrument.
      *
      * @param time
      *        Time is given in seconds, where 0 is now.
      *
      * @param params
      *        Parameters for the instrument event.
      */
    def scheduleEventAtTime(time: Double, params: SonificationInstrumentScheduledEventOptionsObject): Unit = js.native
    
    /**
      * Set the overall volume.
      *
      * @param volume
      *        The volume to set, from 0 to 1.
      */
    def setMasterVolume(volume: Double): Unit = js.native
    
    /**
      * Schedule silencing the instrument at a given time offset.
      *
      * @param time
      *        Time is given in seconds, where 0 is now.
      */
    def silenceAtTime(time: Double): Unit = js.native
  }
  
  /**
    * Capabilities configuration for a SonificationInstrument.
    */
  trait SonificationInstrumentCapabilitiesOptionsObject extends StObject {
    
    /**
      * Whether or not instrument should be able to use filter effects.
      * Defaults to `false`.
      */
    var filters: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not instrument should be able to pan. Defaults to `true`.
      */
    var pan: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not instrument should be able to use tremolo effects.
      * Defaults to `false`.
      */
    var tremolo: js.UndefOr[Boolean] = js.undefined
  }
  object SonificationInstrumentCapabilitiesOptionsObject {
    
    inline def apply(): SonificationInstrumentCapabilitiesOptionsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SonificationInstrumentCapabilitiesOptionsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SonificationInstrumentCapabilitiesOptionsObject] (val x: Self) extends AnyVal {
      
      inline def setFilters(value: Boolean): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setPan(value: Boolean): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
      
      inline def setTremolo(value: Boolean): Self = StObject.set(x, "tremolo", value.asInstanceOf[js.Any])
      
      inline def setTremoloUndefined: Self = StObject.set(x, "tremolo", js.undefined)
    }
  }
  
  /**
    * Configuration for a SonificationInstrument.
    */
  trait SonificationInstrumentOptionsObject extends StObject {
    
    /**
      * Define additional capabilities for the instrument, such as panning,
      * filters, and tremolo effects.
      */
    var capabilities: js.UndefOr[SonificationInstrumentCapabilitiesOptionsObject] = js.undefined
    
    /**
      * A track name to use for this instrument in MIDI export.
      */
    var midiTrackName: js.UndefOr[String] = js.undefined
    
    /**
      * The synth configuration for the instrument. Can be either a string,
      * referencing the instrument presets, or an actual SynthPatch
      * configuration.
      */
    var synthPatch: SonificationSynthPreset | SynthPatchOptionsObject
  }
  object SonificationInstrumentOptionsObject {
    
    inline def apply(synthPatch: SonificationSynthPreset | SynthPatchOptionsObject): SonificationInstrumentOptionsObject = {
      val __obj = js.Dynamic.literal(synthPatch = synthPatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[SonificationInstrumentOptionsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SonificationInstrumentOptionsObject] (val x: Self) extends AnyVal {
      
      inline def setCapabilities(value: SonificationInstrumentCapabilitiesOptionsObject): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      inline def setMidiTrackName(value: String): Self = StObject.set(x, "midiTrackName", value.asInstanceOf[js.Any])
      
      inline def setMidiTrackNameUndefined: Self = StObject.set(x, "midiTrackName", js.undefined)
      
      inline def setSynthPatch(value: SonificationSynthPreset | SynthPatchOptionsObject): Self = StObject.set(x, "synthPatch", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options for a scheduled event for a SonificationInstrument
    */
  trait SonificationInstrumentScheduledEventOptionsObject extends StObject {
    
    /**
      * Note frequency in Hertz. Overrides note, if both are given.
      */
    var frequency: js.UndefOr[Double] = js.undefined
    
    /**
      * Frequency of the highpass filter, in Hertz.
      */
    var highpassFreq: js.UndefOr[Double] = js.undefined
    
    /**
      * Resonance of the highpass filter, in dB. Can be negative for a dip,
      * or positive for a bump.
      */
    var highpassResonance: js.UndefOr[Double] = js.undefined
    
    /**
      * Frequency of the lowpass filter, in Hertz.
      */
    var lowpassFreq: js.UndefOr[Double] = js.undefined
    
    /**
      * Resonance of the lowpass filter, in dB. Can be negative for a dip, or
      * positive for a bump.
      */
    var lowpassResonance: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of semitones from c0, or a note string - such as "c4" or
      * "F#6".
      */
    var note: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Duration to play the note in milliseconds. If not given, the note
      * keeps playing indefinitely
      */
    var noteDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Stereo panning value, from -1 (left) to 1 (right).
      */
    var pan: js.UndefOr[Double] = js.undefined
    
    /**
      * Depth/intensity of the tremolo effect - which is a periodic change in
      * volume. From 0 to 1.
      */
    var tremoloDepth: js.UndefOr[Double] = js.undefined
    
    /**
      * Speed of the tremolo effect, from 0 to 1.
      */
    var tremoloSpeed: js.UndefOr[Double] = js.undefined
    
    /**
      * Volume of the instrument, from 0 to 1. Can be set independent of the
      * master/overall volume.
      */
    var volume: js.UndefOr[Double] = js.undefined
  }
  object SonificationInstrumentScheduledEventOptionsObject {
    
    inline def apply(): SonificationInstrumentScheduledEventOptionsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SonificationInstrumentScheduledEventOptionsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SonificationInstrumentScheduledEventOptionsObject] (val x: Self) extends AnyVal {
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      inline def setHighpassFreq(value: Double): Self = StObject.set(x, "highpassFreq", value.asInstanceOf[js.Any])
      
      inline def setHighpassFreqUndefined: Self = StObject.set(x, "highpassFreq", js.undefined)
      
      inline def setHighpassResonance(value: Double): Self = StObject.set(x, "highpassResonance", value.asInstanceOf[js.Any])
      
      inline def setHighpassResonanceUndefined: Self = StObject.set(x, "highpassResonance", js.undefined)
      
      inline def setLowpassFreq(value: Double): Self = StObject.set(x, "lowpassFreq", value.asInstanceOf[js.Any])
      
      inline def setLowpassFreqUndefined: Self = StObject.set(x, "lowpassFreq", js.undefined)
      
      inline def setLowpassResonance(value: Double): Self = StObject.set(x, "lowpassResonance", value.asInstanceOf[js.Any])
      
      inline def setLowpassResonanceUndefined: Self = StObject.set(x, "lowpassResonance", js.undefined)
      
      inline def setNote(value: Double | String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setNoteDuration(value: Double): Self = StObject.set(x, "noteDuration", value.asInstanceOf[js.Any])
      
      inline def setNoteDurationUndefined: Self = StObject.set(x, "noteDuration", js.undefined)
      
      inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
      
      inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
      
      inline def setTremoloDepth(value: Double): Self = StObject.set(x, "tremoloDepth", value.asInstanceOf[js.Any])
      
      inline def setTremoloDepthUndefined: Self = StObject.set(x, "tremoloDepth", js.undefined)
      
      inline def setTremoloSpeed(value: Double): Self = StObject.set(x, "tremoloSpeed", value.asInstanceOf[js.Any])
      
      inline def setTremoloSpeedUndefined: Self = StObject.set(x, "tremoloSpeed", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  /**
    * Preset scales for pitch mapping.
    */
  trait SonificationScalePresetsObject extends StObject {
    
    /**
      * Dorian scale
      */
    var dorian: js.Array[Double]
    
    /**
      * Harmonic minor scale
      */
    var harmonicMinor: js.Array[Double]
    
    /**
      * Lydian scale
      */
    var lydian: js.Array[Double]
    
    /**
      * Major (ionian) scale
      */
    var major: js.Array[Double]
    
    /**
      * Major pentatonic scale
      */
    var majorPentatonic: js.Array[Double]
    
    /**
      * Minor scale (aeolian)
      */
    var minor: js.Array[Double]
    
    /**
      * Minor pentatonic scale
      */
    var minorPentatonic: js.Array[Double]
    
    /**
      * Mixolydian scale
      */
    var mixolydian: js.Array[Double]
    
    /**
      * Phrygian scale
      */
    var phrygian: js.Array[Double]
  }
  object SonificationScalePresetsObject {
    
    inline def apply(
      dorian: js.Array[Double],
      harmonicMinor: js.Array[Double],
      lydian: js.Array[Double],
      major: js.Array[Double],
      majorPentatonic: js.Array[Double],
      minor: js.Array[Double],
      minorPentatonic: js.Array[Double],
      mixolydian: js.Array[Double],
      phrygian: js.Array[Double]
    ): SonificationScalePresetsObject = {
      val __obj = js.Dynamic.literal(dorian = dorian.asInstanceOf[js.Any], harmonicMinor = harmonicMinor.asInstanceOf[js.Any], lydian = lydian.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], majorPentatonic = majorPentatonic.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], minorPentatonic = minorPentatonic.asInstanceOf[js.Any], mixolydian = mixolydian.asInstanceOf[js.Any], phrygian = phrygian.asInstanceOf[js.Any])
      __obj.asInstanceOf[SonificationScalePresetsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SonificationScalePresetsObject] (val x: Self) extends AnyVal {
      
      inline def setDorian(value: js.Array[Double]): Self = StObject.set(x, "dorian", value.asInstanceOf[js.Any])
      
      inline def setDorianVarargs(value: Double*): Self = StObject.set(x, "dorian", js.Array(value*))
      
      inline def setHarmonicMinor(value: js.Array[Double]): Self = StObject.set(x, "harmonicMinor", value.asInstanceOf[js.Any])
      
      inline def setHarmonicMinorVarargs(value: Double*): Self = StObject.set(x, "harmonicMinor", js.Array(value*))
      
      inline def setLydian(value: js.Array[Double]): Self = StObject.set(x, "lydian", value.asInstanceOf[js.Any])
      
      inline def setLydianVarargs(value: Double*): Self = StObject.set(x, "lydian", js.Array(value*))
      
      inline def setMajor(value: js.Array[Double]): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMajorPentatonic(value: js.Array[Double]): Self = StObject.set(x, "majorPentatonic", value.asInstanceOf[js.Any])
      
      inline def setMajorPentatonicVarargs(value: Double*): Self = StObject.set(x, "majorPentatonic", js.Array(value*))
      
      inline def setMajorVarargs(value: Double*): Self = StObject.set(x, "major", js.Array(value*))
      
      inline def setMinor(value: js.Array[Double]): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setMinorPentatonic(value: js.Array[Double]): Self = StObject.set(x, "minorPentatonic", value.asInstanceOf[js.Any])
      
      inline def setMinorPentatonicVarargs(value: Double*): Self = StObject.set(x, "minorPentatonic", js.Array(value*))
      
      inline def setMinorVarargs(value: Double*): Self = StObject.set(x, "minor", js.Array(value*))
      
      inline def setMixolydian(value: js.Array[Double]): Self = StObject.set(x, "mixolydian", value.asInstanceOf[js.Any])
      
      inline def setMixolydianVarargs(value: Double*): Self = StObject.set(x, "mixolydian", js.Array(value*))
      
      inline def setPhrygian(value: js.Array[Double]): Self = StObject.set(x, "phrygian", value.asInstanceOf[js.Any])
      
      inline def setPhrygianVarargs(value: Double*): Self = StObject.set(x, "phrygian", js.Array(value*))
    }
  }
  
  /**
    * Callback function for sonification events on series.
    *
    * @param e
    *        Sonification series event context
    */
  type SonificationSeriesEventCallback = js.Function1[/* e */ SonificationSeriesEventCallbackContext, Unit]
  
  /**
    * Event context object sent to sonification series events.
    */
  trait SonificationSeriesEventCallbackContext extends StObject {
    
    /**
      * The relevant series
      */
    var series: js.UndefOr[Series] = js.undefined
    
    /**
      * The playing timeline object with advanced and internal content
      */
    var timeline: js.UndefOr[js.Object] = js.undefined
  }
  object SonificationSeriesEventCallbackContext {
    
    inline def apply(): SonificationSeriesEventCallbackContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SonificationSeriesEventCallbackContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SonificationSeriesEventCallbackContext] (val x: Self) extends AnyVal {
      
      inline def setSeries(value: Series): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setTimeline(value: js.Object): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
      
      inline def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
    }
  }
  
  /**
    * The SonificationSpeaker class. This class represents an announcer using
    * speech synthesis. It allows for scheduling speech announcements, as well
    * as speech parameter changes - including rate, volume and pitch.
    */
  @js.native
  trait SonificationSpeaker extends StObject {
    
    /**
      * Clear scheduled announcements, and stop current speech.
      */
    def cancel(): Unit = js.native
    
    /**
      * Say a message using the speaker voice. Interrupts other currently
      * speaking announcements from this speaker.
      *
      * @param message
      *        The message to speak.
      *
      * @param options
      *        Optionally override spaker configuration.
      */
    def say(message: String): Unit = js.native
    def say(message: String, options: SonificationSpeakerOptionsObject): Unit = js.native
    
    /**
      * Schedule a message using the speaker voice.
      *
      * @param time
      *        The time offset to speak at, in milliseconds from now.
      *
      * @param message
      *        The message to speak.
      *
      * @param options
      *        Optionally override spaker configuration.
      */
    def sayAtTime(time: Double, message: String): Unit = js.native
    def sayAtTime(time: Double, message: String, options: SonificationSpeakerOptionsObject): Unit = js.native
    
    /**
      * Set speaker overall/master volume modifier. This affects all
      * announcements, and applies in addition to the individual announcement
      * volume.
      *
      * @param vol
      *        Volume from 0 to 1.
      */
    def setMasterVolume(vol: Double): Unit = js.native
  }
  
  /**
    * Configuration for a SonificationSpeaker.
    */
  trait SonificationSpeakerOptionsObject extends StObject {
    
    /**
      * The language of the voice synthesis. Defaults to `"en-US"`.
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the voice synthesis to use. If not found, reverts to the
      * default voice for the language chosen.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The pitch modifier of the voice. Defaults to `1`. Set higher for a
      * higher voice pitch.
      */
    var pitch: js.UndefOr[Double] = js.undefined
    
    /**
      * The speech rate modifier. Defaults to `1`.
      */
    var rate: js.UndefOr[Double] = js.undefined
    
    /**
      * The speech volume, from 0 to 1. Defaults to `1`.
      */
    var volume: js.UndefOr[Double] = js.undefined
  }
  object SonificationSpeakerOptionsObject {
    
    inline def apply(): SonificationSpeakerOptionsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SonificationSpeakerOptionsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SonificationSpeakerOptionsObject] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.highcharts.highchartsStrings.basic1
    - typings.highcharts.highchartsStrings.basic2
    - typings.highcharts.highchartsStrings.chop
    - typings.highcharts.highchartsStrings.chord
    - typings.highcharts.highchartsStrings.flute
    - typings.highcharts.highchartsStrings.kick
    - typings.highcharts.highchartsStrings.lead
    - typings.highcharts.highchartsStrings.noise
    - typings.highcharts.highchartsStrings.piano
    - typings.highcharts.highchartsStrings.plucked
    - typings.highcharts.highchartsStrings.sawsynth
    - typings.highcharts.highchartsStrings.sawtooth
    - typings.highcharts.highchartsStrings.saxophone
    - typings.highcharts.highchartsStrings.shaker
    - typings.highcharts.highchartsStrings.shortnote
    - typings.highcharts.highchartsStrings.sine
    - typings.highcharts.highchartsStrings.square
    - typings.highcharts.highchartsStrings.step
    - typings.highcharts.highchartsStrings.triangle
    - typings.highcharts.highchartsStrings.trumpet
    - typings.highcharts.highchartsStrings.vibraphone
    - typings.highcharts.highchartsStrings.wind
    - typings.highcharts.highchartsStrings.wobble
    - typings.highcharts.highchartsStrings.filteredNoise
    - typings.highcharts.highchartsStrings.sineGlide
  */
  trait SonificationSynthPreset extends StObject
  object SonificationSynthPreset {
    
    inline def basic1: typings.highcharts.highchartsStrings.basic1 = "basic1".asInstanceOf[typings.highcharts.highchartsStrings.basic1]
    
    inline def basic2: typings.highcharts.highchartsStrings.basic2 = "basic2".asInstanceOf[typings.highcharts.highchartsStrings.basic2]
    
    inline def chop: typings.highcharts.highchartsStrings.chop = "chop".asInstanceOf[typings.highcharts.highchartsStrings.chop]
    
    inline def chord: typings.highcharts.highchartsStrings.chord = "chord".asInstanceOf[typings.highcharts.highchartsStrings.chord]
    
    inline def filteredNoise: typings.highcharts.highchartsStrings.filteredNoise = "filteredNoise".asInstanceOf[typings.highcharts.highchartsStrings.filteredNoise]
    
    inline def flute: typings.highcharts.highchartsStrings.flute = "flute".asInstanceOf[typings.highcharts.highchartsStrings.flute]
    
    inline def kick: typings.highcharts.highchartsStrings.kick = "kick".asInstanceOf[typings.highcharts.highchartsStrings.kick]
    
    inline def lead: typings.highcharts.highchartsStrings.lead = "lead".asInstanceOf[typings.highcharts.highchartsStrings.lead]
    
    inline def noise: typings.highcharts.highchartsStrings.noise = "noise".asInstanceOf[typings.highcharts.highchartsStrings.noise]
    
    inline def piano: typings.highcharts.highchartsStrings.piano = "piano".asInstanceOf[typings.highcharts.highchartsStrings.piano]
    
    inline def plucked: typings.highcharts.highchartsStrings.plucked = "plucked".asInstanceOf[typings.highcharts.highchartsStrings.plucked]
    
    inline def sawsynth: typings.highcharts.highchartsStrings.sawsynth = "sawsynth".asInstanceOf[typings.highcharts.highchartsStrings.sawsynth]
    
    inline def sawtooth: typings.highcharts.highchartsStrings.sawtooth = "sawtooth".asInstanceOf[typings.highcharts.highchartsStrings.sawtooth]
    
    inline def saxophone: typings.highcharts.highchartsStrings.saxophone = "saxophone".asInstanceOf[typings.highcharts.highchartsStrings.saxophone]
    
    inline def shaker: typings.highcharts.highchartsStrings.shaker = "shaker".asInstanceOf[typings.highcharts.highchartsStrings.shaker]
    
    inline def shortnote: typings.highcharts.highchartsStrings.shortnote = "shortnote".asInstanceOf[typings.highcharts.highchartsStrings.shortnote]
    
    inline def sine: typings.highcharts.highchartsStrings.sine = "sine".asInstanceOf[typings.highcharts.highchartsStrings.sine]
    
    inline def sineGlide: typings.highcharts.highchartsStrings.sineGlide = "sineGlide".asInstanceOf[typings.highcharts.highchartsStrings.sineGlide]
    
    inline def square: typings.highcharts.highchartsStrings.square = "square".asInstanceOf[typings.highcharts.highchartsStrings.square]
    
    inline def step: typings.highcharts.highchartsStrings.step = "step".asInstanceOf[typings.highcharts.highchartsStrings.step]
    
    inline def triangle: typings.highcharts.highchartsStrings.triangle = "triangle".asInstanceOf[typings.highcharts.highchartsStrings.triangle]
    
    inline def trumpet: typings.highcharts.highchartsStrings.trumpet = "trumpet".asInstanceOf[typings.highcharts.highchartsStrings.trumpet]
    
    inline def vibraphone: typings.highcharts.highchartsStrings.vibraphone = "vibraphone".asInstanceOf[typings.highcharts.highchartsStrings.vibraphone]
    
    inline def wind: typings.highcharts.highchartsStrings.wind = "wind".asInstanceOf[typings.highcharts.highchartsStrings.wind]
    
    inline def wobble: typings.highcharts.highchartsStrings.wobble = "wobble".asInstanceOf[typings.highcharts.highchartsStrings.wobble]
  }
  
  /**
    * A TimelineEvent object represents a scheduled audio event to play for a
    * SonificationTimeline.
    */
  trait SonificationTimelineEvent extends StObject {
    
    /**
      * Callback to call when playing the event.
      */
    var callback: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Options for an instrument event to be played.
      */
    var instrumentEventOptions: js.UndefOr[SonificationInstrumentScheduledEventOptionsObject] = js.undefined
    
    /**
      * The message to speak for speech events.
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * A reference to a data point related to the TimelineEvent. Populated
      * when sonifying points.
      */
    var relatedPoint: js.UndefOr[Point] = js.undefined
    
    /**
      * Options for a speech event to be played.
      */
    var speechOptions: js.UndefOr[SonificationSpeakerOptionsObject] = js.undefined
    
    /**
      * Time is given in milliseconds, where 0 is now.
      */
    var time: Double
  }
  object SonificationTimelineEvent {
    
    inline def apply(time: Double): SonificationTimelineEvent = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[SonificationTimelineEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SonificationTimelineEvent] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setInstrumentEventOptions(value: SonificationInstrumentScheduledEventOptionsObject): Self = StObject.set(x, "instrumentEventOptions", value.asInstanceOf[js.Any])
      
      inline def setInstrumentEventOptionsUndefined: Self = StObject.set(x, "instrumentEventOptions", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setRelatedPoint(value: Point): Self = StObject.set(x, "relatedPoint", value.asInstanceOf[js.Any])
      
      inline def setRelatedPointUndefined: Self = StObject.set(x, "relatedPoint", js.undefined)
      
      inline def setSpeechOptions(value: SonificationSpeakerOptionsObject): Self = StObject.set(x, "speechOptions", value.asInstanceOf[js.Any])
      
      inline def setSpeechOptionsUndefined: Self = StObject.set(x, "speechOptions", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Filter callback for filtering timeline events on a SonificationTimeline.
    *
    * @param e
    *        TimelineEvent being filtered
    *
    * @param ix
    *        Index of TimelineEvent in current event array
    *
    * @param arr
    *        The current event array
    *
    * @return The function should return true if the TimelineEvent should be
    *         included, false otherwise.
    */
  type SonificationTimelineFilterCallback = js.Function3[
    /* e */ SonificationTimelineEvent, 
    /* ix */ Double, 
    /* arr */ js.Array[SonificationTimelineEvent], 
    Boolean
  ]
  
  /**
    * The SynthPatch class. This class represents an instance and configuration
    * of the built-in Highcharts synthesizer. It can be used to play various
    * generated sounds.
    */
  @js.native
  trait SynthPatch extends StObject {
    
    /**
      * Cancel any scheduled actions
      */
    def cancelScheduled(): Unit = js.native
    
    /**
      * Connect the SynthPatch output to an audio node / destination.
      *
      * @param destinationNode
      *        The node to connect to.
      *
      * @return The destination node, to allow chaining.
      */
    def connect(destinationNode: AudioNode): AudioNode = js.native
    
    /**
      * Mute sound immediately.
      */
    def mute(): Unit = js.native
    
    /**
      * Mute sound at time (in seconds). Will still run release envelope.
      * Note: If scheduled multiple times in succession, the release envelope
      * will run, and that could make sound.
      *
      * @param time
      *        Time offset from now, in seconds
      */
    def silenceAtTime(time: Double): Unit = js.native
    /**
      * Play a frequency at time (in seconds). Time denotes when the attack
      * ramp starts. Note duration is given in milliseconds. If note duration
      * is not given, the note plays indefinitely.
      *
      * @param time
      *        Time offset from now, in seconds
      *
      * @param frequency
      *        The frequency to play at
      *
      * @param noteDuration
      *        Duration to play, in milliseconds
      */
    def silenceAtTime(time: Double, frequency: Double): Unit = js.native
    def silenceAtTime(time: Double, frequency: Double, noteDuration: Double): Unit = js.native
    
    /**
      * Start the oscillators, but don't output sound.
      */
    def startSilently(): Unit = js.native
    
    /**
      * Stop the synth. It can't be started again.
      */
    def stop(): Unit = js.native
  }
}
