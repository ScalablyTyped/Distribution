package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.places.PlacesService")
@js.native
class PlacesService protected () extends js.Object {
  def this(attrContainer: googlemapsLib.googleNs.mapsNs.Map) = this()
  def this(attrContainer: stdLib.HTMLDivElement) = this()
  def findPlaceFromPhoneNumber(
    request: FindPlaceFromPhoneNumberRequest,
    callback: js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, scala.Unit]
  ): scala.Unit = js.native
  def findPlaceFromQuery(
    request: FindPlaceFromQueryRequest,
    callback: js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, scala.Unit]
  ): scala.Unit = js.native
  def getDetails(
    request: PlaceDetailsRequest,
    callback: js.Function2[/* result */ PlaceResult, /* status */ PlacesServiceStatus, scala.Unit]
  ): scala.Unit = js.native
  def nearbySearch(
    request: PlaceSearchRequest,
    callback: js.Function3[
      /* results */ js.Array[PlaceResult], 
      /* status */ PlacesServiceStatus, 
      /* pagination */ PlaceSearchPagination, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
         * @deprecated Radar search is deprecated as of June 30, 2018. After that
         *     time, this feature will no longer be available.
         */
  def radarSearch(
    request: RadarSearchRequest,
    callback: js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, scala.Unit]
  ): scala.Unit = js.native
  def textSearch(
    request: TextSearchRequest,
    callback: js.Function3[
      /* results */ js.Array[PlaceResult], 
      /* status */ PlacesServiceStatus, 
      /* pagination */ PlaceSearchPagination, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

