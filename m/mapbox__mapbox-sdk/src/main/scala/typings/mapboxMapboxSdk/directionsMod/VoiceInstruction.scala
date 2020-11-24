package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceInstruction extends js.Object {
  
  /**
    * String containing the text of the verbal instruction.
    */
  var announcement: String = js.native
  
  /**
    * Float indicating in meters, how far from the upcoming maneuver the voice instruction should begin.
    */
  var distanceAlongGeometry: Double = js.native
  
  /**
    * String with SSML markup for proper text and pronunciation. Note: this property is designed for use with Amazon Polly.
    * The SSML tags contained here may not work with other text-to-speech engines.
    */
  var ssmlAnnouncement: String = js.native
}
object VoiceInstruction {
  
  @scala.inline
  def apply(announcement: String, distanceAlongGeometry: Double, ssmlAnnouncement: String): VoiceInstruction = {
    val __obj = js.Dynamic.literal(announcement = announcement.asInstanceOf[js.Any], distanceAlongGeometry = distanceAlongGeometry.asInstanceOf[js.Any], ssmlAnnouncement = ssmlAnnouncement.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceInstruction]
  }
  
  @scala.inline
  implicit class VoiceInstructionOps[Self <: VoiceInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnouncement(value: String): Self = this.set("announcement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceAlongGeometry(value: Double): Self = this.set("distanceAlongGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmlAnnouncement(value: String): Self = this.set("ssmlAnnouncement", value.asInstanceOf[js.Any])
  }
}
