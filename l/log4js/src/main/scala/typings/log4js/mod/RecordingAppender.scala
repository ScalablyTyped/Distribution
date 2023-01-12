package typings.log4js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingAppender extends StObject {
  
  var `type`: typings.log4js.log4jsStrings.recording
}
object RecordingAppender {
  
  inline def apply(): RecordingAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("recording")
    __obj.asInstanceOf[RecordingAppender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordingAppender] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.log4js.log4jsStrings.recording): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
