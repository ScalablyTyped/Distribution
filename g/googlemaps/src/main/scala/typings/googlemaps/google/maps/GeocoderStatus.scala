package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeocoderStatus extends StObject
@JSGlobal("google.maps.GeocoderStatus")
@js.native
object GeocoderStatus extends StObject {
  
  @js.native
  sealed trait ERROR
    extends StObject
       with GeocoderStatus
  
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with GeocoderStatus
  
  @js.native
  sealed trait OK
    extends StObject
       with GeocoderStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends StObject
       with GeocoderStatus
  
  @js.native
  sealed trait REQUEST_DENIED
    extends StObject
       with GeocoderStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with GeocoderStatus
  
  @js.native
  sealed trait ZERO_RESULTS
    extends StObject
       with GeocoderStatus
}
