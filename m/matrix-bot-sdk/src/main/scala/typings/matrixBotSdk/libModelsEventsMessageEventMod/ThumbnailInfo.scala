package typings.matrixBotSdk.libModelsEventsMessageEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbnailInfo extends StObject {
  
  /**
    * The intended height of the thumbnail in pixels.
    */
  var h: Double
  
  /**
    * The type of thumbnail.
    */
  var mimetype: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the thumbnail in bytes.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * The intended width of the thumbnail in pixels.
    */
  var w: Double
}
object ThumbnailInfo {
  
  inline def apply(h: Double, w: Double): ThumbnailInfo = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbnailInfo]
  }
  
  extension [Self <: ThumbnailInfo](x: Self) {
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    
    inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
