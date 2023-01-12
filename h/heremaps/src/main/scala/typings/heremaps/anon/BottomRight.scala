package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomRight extends StObject {
  
  var BottomRight: Longitude
  
  var TopLeft: Longitude
}
object BottomRight {
  
  inline def apply(BottomRight: Longitude, TopLeft: Longitude): BottomRight = {
    val __obj = js.Dynamic.literal(BottomRight = BottomRight.asInstanceOf[js.Any], TopLeft = TopLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomRight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BottomRight] (val x: Self) extends AnyVal {
    
    inline def setBottomRight(value: Longitude): Self = StObject.set(x, "BottomRight", value.asInstanceOf[js.Any])
    
    inline def setTopLeft(value: Longitude): Self = StObject.set(x, "TopLeft", value.asInstanceOf[js.Any])
  }
}
