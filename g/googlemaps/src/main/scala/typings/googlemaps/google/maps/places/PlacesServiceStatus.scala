package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacesServiceStatus extends js.Object
@JSGlobal("google.maps.places.PlacesServiceStatus")
@js.native
object PlacesServiceStatus extends js.Object {
  
  @js.native
  sealed trait INVALID_REQUEST extends PlacesServiceStatus
  
  @js.native
  sealed trait NOT_FOUND extends PlacesServiceStatus
  
  @js.native
  sealed trait OK extends PlacesServiceStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT extends PlacesServiceStatus
  
  @js.native
  sealed trait REQUEST_DENIED extends PlacesServiceStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends PlacesServiceStatus
  
  @js.native
  sealed trait ZERO_RESULTS extends PlacesServiceStatus
}
