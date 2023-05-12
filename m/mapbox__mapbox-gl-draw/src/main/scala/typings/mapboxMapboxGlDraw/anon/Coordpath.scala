package typings.mapboxMapboxGlDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coordpath extends StObject {
  
  var coord_path: String
  
  var feature_id: String
}
object Coordpath {
  
  inline def apply(coord_path: String, feature_id: String): Coordpath = {
    val __obj = js.Dynamic.literal(coord_path = coord_path.asInstanceOf[js.Any], feature_id = feature_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordpath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Coordpath] (val x: Self) extends AnyVal {
    
    inline def setCoord_path(value: String): Self = StObject.set(x, "coord_path", value.asInstanceOf[js.Any])
    
    inline def setFeature_id(value: String): Self = StObject.set(x, "feature_id", value.asInstanceOf[js.Any])
  }
}
