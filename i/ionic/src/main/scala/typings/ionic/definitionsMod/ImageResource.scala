package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.landscape
import typings.ionic.ionicStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageResource extends StObject {
  
  var density: js.UndefOr[String] = js.undefined
  
  var dest: String
  
  var height: Double
  
  var imageId: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var nodeAttributes: js.Array[String]
  
  var nodeName: String
  
  var orientation: js.UndefOr[landscape | portrait] = js.undefined
  
  var platform: String
  
  var resType: String
  
  var width: Double
}
object ImageResource {
  
  inline def apply(
    dest: String,
    height: Double,
    name: String,
    nodeAttributes: js.Array[String],
    nodeName: String,
    platform: String,
    resType: String,
    width: Double
  ): ImageResource = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeAttributes = nodeAttributes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], resType = resType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageResource] (val x: Self) extends AnyVal {
    
    inline def setDensity(value: String): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodeAttributes(value: js.Array[String]): Self = StObject.set(x, "nodeAttributes", value.asInstanceOf[js.Any])
    
    inline def setNodeAttributesVarargs(value: String*): Self = StObject.set(x, "nodeAttributes", js.Array(value*))
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: landscape | portrait): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setResType(value: String): Self = StObject.set(x, "resType", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
