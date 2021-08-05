package typings.log4js.mod

import typings.log4js.log4jsStrings.recording
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingAppender
  extends StObject
     with Appender {
  
  var `type`: recording
}
object RecordingAppender {
  
  inline def apply(): RecordingAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("recording")
    __obj.asInstanceOf[RecordingAppender]
  }
  
  extension [Self <: RecordingAppender](x: Self) {
    
    inline def setType(value: recording): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
