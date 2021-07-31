package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacesServiceStatus extends StObject
@JSGlobal("google.maps.places.PlacesServiceStatus")
@js.native
object PlacesServiceStatus extends StObject {
  
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with PlacesServiceStatus
  
  @js.native
  sealed trait NOT_FOUND
    extends StObject
       with PlacesServiceStatus
  
  @js.native
  sealed trait OK
    extends StObject
       with PlacesServiceStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends StObject
       with PlacesServiceStatus
  
  @js.native
  sealed trait REQUEST_DENIED
    extends StObject
       with PlacesServiceStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with PlacesServiceStatus
  
  @js.native
  sealed trait ZERO_RESULTS
    extends StObject
       with PlacesServiceStatus
}
