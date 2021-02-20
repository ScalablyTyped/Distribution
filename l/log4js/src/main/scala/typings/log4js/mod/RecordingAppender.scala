package typings.log4js.mod

import typings.log4js.log4jsStrings.recording
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordingAppender extends Appender {
  
  var `type`: recording = js.native
}
object RecordingAppender {
  
  @scala.inline
  def apply(`type`: recording): RecordingAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingAppender]
  }
  
  @scala.inline
  implicit class RecordingAppenderMutableBuilder[Self <: RecordingAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: recording): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
