package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoItem extends StObject {
  
  /**
    * The text displayed below the video.
    */
  var caption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The video displayed in the item.
    */
  var video: js.UndefOr[SchemaVideo] = js.undefined
}
object SchemaVideoItem {
  
  inline def apply(): SchemaVideoItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoItem]
  }
  
  extension [Self <: SchemaVideoItem](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionNull: Self = StObject.set(x, "caption", null)
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setVideo(value: SchemaVideo): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
