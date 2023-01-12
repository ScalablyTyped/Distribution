package typings.matrixBotSdk.libModelsEventsMessageEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.matrixBotSdk.libModelsEventsMessageEventMod.FileInfo because Already inherited
- typings.matrixBotSdk.libModelsEventsMessageEventMod.TimedFileInfo because var conflicts: mimetype, size. Inlined duration */ trait VideoFileInfo
  extends StObject
     with DimensionalFileInfo {
  
  /**
    * The duration of the media in milliseconds.
    */
  var duration: Double
}
object VideoFileInfo {
  
  inline def apply(duration: Double, h: Double, w: Double): VideoFileInfo = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFileInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoFileInfo] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}
