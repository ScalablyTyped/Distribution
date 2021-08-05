package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleMarkerOptions
  extends StObject
     with PathOptions {
  
  var radius: js.UndefOr[Double] = js.undefined
}
object CircleMarkerOptions {
  
  inline def apply(): CircleMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleMarkerOptions]
  }
  
  extension [Self <: CircleMarkerOptions](x: Self) {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
