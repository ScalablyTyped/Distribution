package typings.atMapboxMapboxDashSdk.servicesDirectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceInstruction extends js.Object {
  /**
    * String containing the text of the verbal instruction.
    */
  var announcement: String
  /**
    * Float indicating in meters, how far from the upcoming maneuver the voice instruction should begin.
    */
  var distanceAlongGeometry: Double
  /**
    * String with SSML markup for proper text and pronunciation. Note: this property is designed for use with Amazon Polly.
    * The SSML tags contained here may not work with other text-to-speech engines.
    */
  var ssmlAnnouncement: String
}

object VoiceInstruction {
  @scala.inline
  def apply(announcement: String, distanceAlongGeometry: Double, ssmlAnnouncement: String): VoiceInstruction = {
    val __obj = js.Dynamic.literal(announcement = announcement.asInstanceOf[js.Any], distanceAlongGeometry = distanceAlongGeometry.asInstanceOf[js.Any], ssmlAnnouncement = ssmlAnnouncement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoiceInstruction]
  }
}

