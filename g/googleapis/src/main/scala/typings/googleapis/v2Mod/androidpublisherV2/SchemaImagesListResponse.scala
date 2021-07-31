package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImagesListResponse extends StObject {
  
  var images: js.UndefOr[js.Array[SchemaImage]] = js.undefined
}
object SchemaImagesListResponse {
  
  @scala.inline
  def apply(): SchemaImagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImagesListResponse]
  }
  
  @scala.inline
  implicit class SchemaImagesListResponseMutableBuilder[Self <: SchemaImagesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: js.Array[SchemaImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: SchemaImage*): Self = StObject.set(x, "images", js.Array(value :_*))
  }
}
