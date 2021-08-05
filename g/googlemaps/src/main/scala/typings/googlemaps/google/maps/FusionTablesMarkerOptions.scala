package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
trait FusionTablesMarkerOptions extends StObject {
  
  var iconName: String
}
object FusionTablesMarkerOptions {
  
  inline def apply(iconName: String): FusionTablesMarkerOptions = {
    val __obj = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesMarkerOptions]
  }
  
  extension [Self <: FusionTablesMarkerOptions](x: Self) {
    
    inline def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
  }
}
