package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceImage extends StObject {
  
  var cachedId: js.UndefOr[String] = js.native
  
  var ext: String = js.native
  
  var height: Double = js.native
  
  var imageId: js.UndefOr[String] = js.native
  
  var path: String = js.native
  
  var platform: String = js.native
  
  var resType: String = js.native
  
  var vector: Boolean = js.native
  
  var width: Double = js.native
}
object SourceImage {
  
  @scala.inline
  def apply(
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
  implicit class SourceImageMutableBuilder[Self <: SourceImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachedId(value: String): Self = StObject.set(x, "cachedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachedIdUndefined: Self = StObject.set(x, "cachedId", js.undefined)
    
    @scala.inline
    def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResType(value: String): Self = StObject.set(x, "resType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVector(value: Boolean): Self = StObject.set(x, "vector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
