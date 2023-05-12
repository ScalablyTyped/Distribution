package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def scheduleEventAtTime(
    time: Double,
    params: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationInstrumentScheduledEventOptionsObject
  ): Unit = js.native
  
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
