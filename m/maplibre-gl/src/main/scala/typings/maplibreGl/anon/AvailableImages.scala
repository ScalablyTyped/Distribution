package typings.maplibreGl.anon

import typings.maplibreGl.mod.FilterSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableImages extends StObject {
  
  var availableImages: js.Array[String]
  
  var filter: FilterSpecification
  
  var layers: js.Array[String]
}
object AvailableImages {
  
  inline def apply(availableImages: js.Array[String], filter: FilterSpecification, layers: js.Array[String]): AvailableImages = {
    val __obj = js.Dynamic.literal(availableImages = availableImages.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableImages]
  }
  
  extension [Self <: AvailableImages](x: Self) {
    
    inline def setAvailableImages(value: js.Array[String]): Self = StObject.set(x, "availableImages", value.asInstanceOf[js.Any])
    
    inline def setAvailableImagesVarargs(value: String*): Self = StObject.set(x, "availableImages", js.Array(value*))
    
    inline def setFilter(value: FilterSpecification): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
  }
}
