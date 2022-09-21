package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreGalleryRequest extends StObject {
  
  var format: String
  
  var path: StoreGalleryRequestPath
  
  var photo_gallery: js.Array[String]
}
object StoreGalleryRequest {
  
  inline def apply(format: String, path: StoreGalleryRequestPath, photo_gallery: js.Array[String]): StoreGalleryRequest = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], photo_gallery = photo_gallery.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreGalleryRequest]
  }
  
  extension [Self <: StoreGalleryRequest](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setPath(value: StoreGalleryRequestPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPhoto_gallery(value: js.Array[String]): Self = StObject.set(x, "photo_gallery", value.asInstanceOf[js.Any])
    
    inline def setPhoto_galleryVarargs(value: String*): Self = StObject.set(x, "photo_gallery", js.Array(value*))
  }
}
