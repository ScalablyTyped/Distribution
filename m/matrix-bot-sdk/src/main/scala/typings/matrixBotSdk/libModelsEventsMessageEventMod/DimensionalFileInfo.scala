package typings.matrixBotSdk.libModelsEventsMessageEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionalFileInfo
  extends StObject
     with FileWithThumbnailInfo {
  
  /**
    * The intended height of the media in pixels.
    */
  var h: Double
  
  /**
    * The intended width of the media in pixels.
    */
  var w: Double
}
object DimensionalFileInfo {
  
  inline def apply(h: Double, w: Double): DimensionalFileInfo = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionalFileInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionalFileInfo] (val x: Self) extends AnyVal {
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
