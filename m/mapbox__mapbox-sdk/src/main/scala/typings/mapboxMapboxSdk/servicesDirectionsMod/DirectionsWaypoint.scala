package typings.mapboxMapboxSdk.servicesDirectionsMod

import typings.mapboxMapboxSdk.libClassesMapiRequestMod.Coordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsWaypoint
  extends StObject
     with Waypoint {
  
  /**
    * Custom name for the waypoint used for the arrival instruction in banners and voice instructions.
    */
  var waypointName: js.UndefOr[String] = js.undefined
}
object DirectionsWaypoint {
  
  inline def apply(coordinates: Coordinates): DirectionsWaypoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsWaypoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsWaypoint] (val x: Self) extends AnyVal {
    
    inline def setWaypointName(value: String): Self = StObject.set(x, "waypointName", value.asInstanceOf[js.Any])
    
    inline def setWaypointNameUndefined: Self = StObject.set(x, "waypointName", js.undefined)
  }
}
