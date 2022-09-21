package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreImageRequest extends StObject {
  
  var format: String
  
  var image: String
  
  var key: String
  
  var path: StoreImageRequestPath
}
object StoreImageRequest {
  
  inline def apply(format: String, image: String, key: String, path: StoreImageRequestPath): StoreImageRequest = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreImageRequest]
  }
  
  extension [Self <: StoreImageRequest](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPath(value: StoreImageRequestPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
