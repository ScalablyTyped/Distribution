package typings.ionic.anon

import typings.ionic.definitionsMod.ResourcesImageConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Images extends StObject {
  
  var images: js.Array[ResourcesImageConfig]
  
  var nodeAttributes: js.Array[String]
  
  var nodeName: String
}
object Images {
  
  inline def apply(images: js.Array[ResourcesImageConfig], nodeAttributes: js.Array[String], nodeName: String): Images = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], nodeAttributes = nodeAttributes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Images]
  }
  
  extension [Self <: Images](x: Self) {
    
    inline def setImages(value: js.Array[ResourcesImageConfig]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: ResourcesImageConfig*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    inline def setNodeAttributes(value: js.Array[String]): Self = StObject.set(x, "nodeAttributes", value.asInstanceOf[js.Any])
    
    inline def setNodeAttributesVarargs(value: String*): Self = StObject.set(x, "nodeAttributes", js.Array(value :_*))
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
  }
}
