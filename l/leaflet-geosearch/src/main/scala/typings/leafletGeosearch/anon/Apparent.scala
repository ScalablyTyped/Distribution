package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apparent extends StObject {
  
  var apparent: Double
  
  var astronomical: Double
  
  var civil: Double
  
  var nautical: Double
}
object Apparent {
  
  inline def apply(apparent: Double, astronomical: Double, civil: Double, nautical: Double): Apparent = {
    val __obj = js.Dynamic.literal(apparent = apparent.asInstanceOf[js.Any], astronomical = astronomical.asInstanceOf[js.Any], civil = civil.asInstanceOf[js.Any], nautical = nautical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apparent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Apparent] (val x: Self) extends AnyVal {
    
    inline def setApparent(value: Double): Self = StObject.set(x, "apparent", value.asInstanceOf[js.Any])
    
    inline def setAstronomical(value: Double): Self = StObject.set(x, "astronomical", value.asInstanceOf[js.Any])
    
    inline def setCivil(value: Double): Self = StObject.set(x, "civil", value.asInstanceOf[js.Any])
    
    inline def setNautical(value: Double): Self = StObject.set(x, "nautical", value.asInstanceOf[js.Any])
  }
}
