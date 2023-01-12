package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagesListResponse extends StObject {
  
  /** All listed Images. */
  var images: js.UndefOr[js.Array[Image]] = js.undefined
}
object ImagesListResponse {
  
  inline def apply(): ImagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagesListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagesListResponse] (val x: Self) extends AnyVal {
    
    inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
  }
}
