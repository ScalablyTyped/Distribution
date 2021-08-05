package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImagesUploadResponse extends StObject {
  
  var image: js.UndefOr[SchemaImage] = js.undefined
}
object SchemaImagesUploadResponse {
  
  inline def apply(): SchemaImagesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImagesUploadResponse]
  }
  
  extension [Self <: SchemaImagesUploadResponse](x: Self) {
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
