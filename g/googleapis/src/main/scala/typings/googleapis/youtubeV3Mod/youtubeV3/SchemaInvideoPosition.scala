package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInvideoPosition extends StObject {
  
  /**
    * Describes in which corner of the video the visual widget will appear.
    */
  var cornerPosition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines the position type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaInvideoPosition {
  
  inline def apply(): SchemaInvideoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvideoPosition]
  }
  
  extension [Self <: SchemaInvideoPosition](x: Self) {
    
    inline def setCornerPosition(value: String): Self = StObject.set(x, "cornerPosition", value.asInstanceOf[js.Any])
    
    inline def setCornerPositionNull: Self = StObject.set(x, "cornerPosition", null)
    
    inline def setCornerPositionUndefined: Self = StObject.set(x, "cornerPosition", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
