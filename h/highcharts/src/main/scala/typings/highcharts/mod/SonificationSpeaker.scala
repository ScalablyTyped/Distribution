package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def say(
    message: String,
    options: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSpeakerOptionsObject
  ): Unit = js.native
  
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
  def sayAtTime(
    time: Double,
    message: String,
    options: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSpeakerOptionsObject
  ): Unit = js.native
  
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
