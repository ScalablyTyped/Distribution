package typings.kakaomaps.kakao.maps.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerOptions extends StObject {
  
  var draggable: Boolean
  
  var markerImages: js.Array[MarkerImageOptions]
  
  var removable: Boolean
}
object MarkerOptions {
  
  inline def apply(draggable: Boolean, markerImages: js.Array[MarkerImageOptions], removable: Boolean): MarkerOptions = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], markerImages = markerImages.asInstanceOf[js.Any], removable = removable.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerOptions] (val x: Self) extends AnyVal {
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setMarkerImages(value: js.Array[MarkerImageOptions]): Self = StObject.set(x, "markerImages", value.asInstanceOf[js.Any])
    
    inline def setMarkerImagesVarargs(value: MarkerImageOptions*): Self = StObject.set(x, "markerImages", js.Array(value*))
    
    inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
  }
}
