package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DirectionsStatus extends StObject
@JSGlobal("google.maps.DirectionsStatus")
@js.native
object DirectionsStatus extends StObject {
  
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with DirectionsStatus
  
  @js.native
  sealed trait MAX_WAYPOINTS_EXCEEDED
    extends StObject
       with DirectionsStatus
  
  @js.native
  sealed trait NOT_FOUND
    extends StObject
       with DirectionsStatus
  
  @js.native
  sealed trait OK
    extends StObject
       with DirectionsStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends StObject
       with DirectionsStatus
  
  @js.native
  sealed trait REQUEST_DENIED
    extends StObject
       with DirectionsStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with DirectionsStatus
  
  @js.native
  sealed trait ZERO_RESULTS
    extends StObject
       with DirectionsStatus
}
