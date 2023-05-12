package typings.highcharts.mod

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
