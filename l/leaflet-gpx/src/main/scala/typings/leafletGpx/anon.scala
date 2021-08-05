package typings.leafletGpx

import typings.leafletGpx.leafletGpxStrings.route
import typings.leafletGpx.leafletGpxStrings.track
import typings.leafletGpx.leafletGpxStrings.waypoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ParseElements extends StObject {
    
    var parseElements: js.Tuple3[track, route, waypoint]
  }
  object ParseElements {
    
    inline def apply(parseElements: js.Tuple3[track, route, waypoint]): ParseElements = {
      val __obj = js.Dynamic.literal(parseElements = parseElements.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseElements]
    }
    
    extension [Self <: ParseElements](x: Self) {
      
      inline def setParseElements(value: js.Tuple3[track, route, waypoint]): Self = StObject.set(x, "parseElements", value.asInstanceOf[js.Any])
    }
  }
}
