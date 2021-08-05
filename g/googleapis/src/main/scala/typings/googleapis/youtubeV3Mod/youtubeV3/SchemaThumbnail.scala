package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A thumbnail is an image representing a YouTube resource.
  */
trait SchemaThumbnail extends StObject {
  
  /**
    * (Optional) Height of the thumbnail image.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The thumbnail image&#39;s URL.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) Width of the thumbnail image.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SchemaThumbnail {
  
  inline def apply(): SchemaThumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThumbnail]
  }
  
  extension [Self <: SchemaThumbnail](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
