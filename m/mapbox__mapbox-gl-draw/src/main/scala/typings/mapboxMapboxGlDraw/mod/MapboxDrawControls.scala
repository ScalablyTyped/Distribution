package typings.mapboxMapboxGlDraw.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapboxDrawControls extends StObject {
  
  var combine_features: js.UndefOr[Boolean] = js.undefined
  
  var line_string: js.UndefOr[Boolean] = js.undefined
  
  var point: js.UndefOr[Boolean] = js.undefined
  
  var polygon: js.UndefOr[Boolean] = js.undefined
  
  var trash: js.UndefOr[Boolean] = js.undefined
  
  var uncombine_features: js.UndefOr[Boolean] = js.undefined
}
object MapboxDrawControls {
  
  inline def apply(): MapboxDrawControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapboxDrawControls]
  }
  
  extension [Self <: MapboxDrawControls](x: Self) {
    
    inline def setCombine_features(value: Boolean): Self = StObject.set(x, "combine_features", value.asInstanceOf[js.Any])
    
    inline def setCombine_featuresUndefined: Self = StObject.set(x, "combine_features", js.undefined)
    
    inline def setLine_string(value: Boolean): Self = StObject.set(x, "line_string", value.asInstanceOf[js.Any])
    
    inline def setLine_stringUndefined: Self = StObject.set(x, "line_string", js.undefined)
    
    inline def setPoint(value: Boolean): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setPolygon(value: Boolean): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
    
    inline def setTrash(value: Boolean): Self = StObject.set(x, "trash", value.asInstanceOf[js.Any])
    
    inline def setTrashUndefined: Self = StObject.set(x, "trash", js.undefined)
    
    inline def setUncombine_features(value: Boolean): Self = StObject.set(x, "uncombine_features", value.asInstanceOf[js.Any])
    
    inline def setUncombine_featuresUndefined: Self = StObject.set(x, "uncombine_features", js.undefined)
  }
}
