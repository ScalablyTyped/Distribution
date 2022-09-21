package typings.jitsiMeet.mod

import typings.jitsiMeet.jitsiMeetStrings.flac
import typings.jitsiMeet.jitsiMeetStrings.ogg
import typings.jitsiMeet.jitsiMeetStrings.wav
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigLocalRecording extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[ogg | flac | wav] = js.undefined
}
object ConfigLocalRecording {
  
  inline def apply(): ConfigLocalRecording = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigLocalRecording]
  }
  
  extension [Self <: ConfigLocalRecording](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFormat(value: ogg | flac | wav): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
