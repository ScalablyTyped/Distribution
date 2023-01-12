package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coordinate extends StObject {
  
  var canonical: CanonicalCoordinate
  
  var key: Double
  
  var wrap: Double
}
object Coordinate {
  
  inline def apply(canonical: CanonicalCoordinate, key: Double, wrap: Double): Coordinate = {
    val __obj = js.Dynamic.literal(canonical = canonical.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Coordinate] (val x: Self) extends AnyVal {
    
    inline def setCanonical(value: CanonicalCoordinate): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setWrap(value: Double): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
  }
}
