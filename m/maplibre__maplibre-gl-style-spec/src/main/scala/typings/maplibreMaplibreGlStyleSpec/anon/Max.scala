package typings.maplibreMaplibreGlStyleSpec.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  var max: String
  
  var mid: String
  
  var min: String
}
object Max {
  
  inline def apply(max: String, mid: String, min: String): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], mid = mid.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
