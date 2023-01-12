package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceImage extends StObject {
  
  var cachedId: js.UndefOr[String] = js.undefined
  
  var ext: String
  
  var height: Double
  
  var imageId: js.UndefOr[String] = js.undefined
  
  var path: String
  
  var platform: String
  
  var resType: String
  
  var vector: Boolean
  
  var width: Double
}
object SourceImage {
  
  inline def apply(
    ext: String,
    height: Double,
    path: String,
    platform: String,
    resType: String,
    vector: Boolean,
    width: Double
  ): SourceImage = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], resType = resType.asInstanceOf[js.Any], vector = vector.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceImage] (val x: Self) extends AnyVal {
    
    inline def setCachedId(value: String): Self = StObject.set(x, "cachedId", value.asInstanceOf[js.Any])
    
    inline def setCachedIdUndefined: Self = StObject.set(x, "cachedId", js.undefined)
    
    inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setResType(value: String): Self = StObject.set(x, "resType", value.asInstanceOf[js.Any])
    
    inline def setVector(value: Boolean): Self = StObject.set(x, "vector", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
