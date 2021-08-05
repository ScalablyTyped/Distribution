package typings.mapboxMapboxSdk.directionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceInstruction extends StObject {
  
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
  
  inline def apply(announcement: String, distanceAlongGeometry: Double, ssmlAnnouncement: String): VoiceInstruction = {
    val __obj = js.Dynamic.literal(announcement = announcement.asInstanceOf[js.Any], distanceAlongGeometry = distanceAlongGeometry.asInstanceOf[js.Any], ssmlAnnouncement = ssmlAnnouncement.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceInstruction]
  }
  
  extension [Self <: VoiceInstruction](x: Self) {
    
    inline def setAnnouncement(value: String): Self = StObject.set(x, "announcement", value.asInstanceOf[js.Any])
    
    inline def setDistanceAlongGeometry(value: Double): Self = StObject.set(x, "distanceAlongGeometry", value.asInstanceOf[js.Any])
    
    inline def setSsmlAnnouncement(value: String): Self = StObject.set(x, "ssmlAnnouncement", value.asInstanceOf[js.Any])
  }
}
