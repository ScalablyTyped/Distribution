package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeocoderStatus extends js.Object

@JSGlobal("google.maps.GeocoderStatus")
@js.native
object GeocoderStatus extends js.Object {
  @js.native
  sealed trait ERROR extends GeocoderStatus
  
  @js.native
  sealed trait INVALID_REQUEST extends GeocoderStatus
  
  @js.native
  sealed trait OK extends GeocoderStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT extends GeocoderStatus
  
  @js.native
  sealed trait REQUEST_DENIED extends GeocoderStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends GeocoderStatus
  
  @js.native
  sealed trait ZERO_RESULTS extends GeocoderStatus
  
}

