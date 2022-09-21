package typings.kakaoJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageUrl extends StObject {
  
  var imageUrl: String
}
object ImageUrl {
  
  inline def apply(imageUrl: String): ImageUrl = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrl]
  }
  
  extension [Self <: ImageUrl](x: Self) {
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
  }
}
