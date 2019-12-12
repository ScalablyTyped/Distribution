package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.TopLevel
import typings.googlemaps.google.maps.places.PlacesServiceStatus.INVALID_REQUEST
import typings.googlemaps.google.maps.places.PlacesServiceStatus.NOT_FOUND
import typings.googlemaps.google.maps.places.PlacesServiceStatus.OK
import typings.googlemaps.google.maps.places.PlacesServiceStatus.OVER_QUERY_LIMIT
import typings.googlemaps.google.maps.places.PlacesServiceStatus.REQUEST_DENIED
import typings.googlemaps.google.maps.places.PlacesServiceStatus.UNKNOWN_ERROR
import typings.googlemaps.google.maps.places.PlacesServiceStatus.ZERO_RESULTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlacesServiceStatus with String] = js.native
  /* "INVALID_REQUEST" */ @js.native
  object INVALID_REQUEST extends TopLevel[INVALID_REQUEST with String]
  
  /* "NOT_FOUND" */ @js.native
  object NOT_FOUND extends TopLevel[NOT_FOUND with String]
  
  /* "OK" */ @js.native
  object OK extends TopLevel[OK with String]
  
  /* "OVER_QUERY_LIMIT" */ @js.native
  object OVER_QUERY_LIMIT extends TopLevel[OVER_QUERY_LIMIT with String]
  
  /* "REQUEST_DENIED" */ @js.native
  object REQUEST_DENIED extends TopLevel[REQUEST_DENIED with String]
  
  /* "UNKNOWN_ERROR" */ @js.native
  object UNKNOWN_ERROR extends TopLevel[UNKNOWN_ERROR with String]
  
  /* "ZERO_RESULTS" */ @js.native
  object ZERO_RESULTS extends TopLevel[ZERO_RESULTS with String]
  
}

