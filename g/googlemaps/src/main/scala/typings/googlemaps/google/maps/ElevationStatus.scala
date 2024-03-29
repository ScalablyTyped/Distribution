package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElevationStatus extends StObject
@JSGlobal("google.maps.ElevationStatus")
@js.native
object ElevationStatus extends StObject {
  
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with ElevationStatus
  
  @js.native
  sealed trait OK
    extends StObject
       with ElevationStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends StObject
       with ElevationStatus
  
  @js.native
  sealed trait REQUEST_DENIED
    extends StObject
       with ElevationStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with ElevationStatus
}
