package typings.highcharts.mod

import typings.std.AudioDestinationNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def getLastPlayedPoint(): typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Point | Null = js.native
  
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
  def playAdjacent(
    next: Double,
    onEnd: Unit,
    eventFilter: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationTimelineFilterCallback
  ): Unit = js.native
  def playAdjacent(
    next: Double,
    onEnd: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationChartEventCallback
  ): Unit = js.native
  def playAdjacent(
    next: Double,
    onEnd: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationChartEventCallback,
    eventFilter: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationTimelineFilterCallback
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
  def playAdjacentSeries(next: Double): typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Series | Null = js.native
  def playAdjacentSeries(next: Double, prop: String): typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Series | Null = js.native
  def playAdjacentSeries(
    next: Double,
    prop: String,
    onEnd: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationChartEventCallback
  ): typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Series | Null = js.native
  def playAdjacentSeries(
    next: Double,
    prop: Unit,
    onEnd: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationChartEventCallback
  ): typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Series | Null = js.native
  
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
  def playClosestToProp(
    prop: String,
    targetValue: Double,
    targetFilter: Unit,
    onEnd: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationChartEventCallback
  ): Unit = js.native
  def playClosestToProp(
    prop: String,
    targetValue: Double,
    targetFilter: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationTimelineFilterCallback
  ): Unit = js.native
  def playClosestToProp(
    prop: String,
    targetValue: Double,
    targetFilter: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationTimelineFilterCallback,
    onEnd: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationChartEventCallback
  ): Unit = js.native
  
  def playNote(
    instrument: SynthPatchOptionsObject,
    options: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationInstrumentScheduledEventOptionsObject
  ): Unit = js.native
  def playNote(
    instrument: SynthPatchOptionsObject,
    options: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationInstrumentScheduledEventOptionsObject,
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
  def playNote(
    instrument: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSynthPreset,
    options: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationInstrumentScheduledEventOptionsObject
  ): Unit = js.native
  def playNote(
    instrument: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSynthPreset,
    options: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationInstrumentScheduledEventOptionsObject,
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
  def playSegment(
    segment: Double,
    onEnd: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationChartEventCallback
  ): Unit = js.native
  
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
  def speak(
    text: String,
    speakerOptions: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSpeakerOptionsObject
  ): Unit = js.native
  def speak(
    text: String,
    speakerOptions: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSpeakerOptionsObject,
    delayMs: Double
  ): Unit = js.native
}
