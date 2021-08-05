package typings.mapboxMapboxSdk.directionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsResponse extends StObject {
  
  /**
    * String indicating the state of the response. This is a separate code than the HTTP status code.
    * On normal valid responses, the value will be Ok.
    */
  var code: String
  
  /**
    * Array of Route objects ordered by descending recommendation rank. May contain at most two routes.
    */
  var routes: js.Array[Route]
  
  var uuid: String
  
  /**
    * Array of Waypoint objects. Each waypoints is an input coordinate snapped to the road and path network.
    * The waypoints appear in the array in the order of the input coordinates.
    */
  var waypoints: js.Array[Waypoint]
}
object DirectionsResponse {
  
  inline def apply(code: String, routes: js.Array[Route], uuid: String, waypoints: js.Array[Waypoint]): DirectionsResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsResponse]
  }
  
  extension [Self <: DirectionsResponse](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setWaypoints(value: js.Array[Waypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    inline def setWaypointsVarargs(value: Waypoint*): Self = StObject.set(x, "waypoints", js.Array(value :_*))
  }
}
