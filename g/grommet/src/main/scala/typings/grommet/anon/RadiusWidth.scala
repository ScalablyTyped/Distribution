package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadiusWidth extends StObject {
  
  var radius: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object RadiusWidth {
  
  inline def apply(): RadiusWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadiusWidth]
  }
  
  extension [Self <: RadiusWidth](x: Self) {
    
    inline def setRadius(value: String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
