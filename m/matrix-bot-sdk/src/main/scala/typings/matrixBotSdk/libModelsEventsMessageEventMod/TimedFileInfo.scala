package typings.matrixBotSdk.libModelsEventsMessageEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimedFileInfo
  extends StObject
     with FileInfo {
  
  /**
    * The duration of the media in milliseconds.
    */
  var duration: Double
}
object TimedFileInfo {
  
  inline def apply(duration: Double): TimedFileInfo = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedFileInfo]
  }
  
  extension [Self <: TimedFileInfo](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}
