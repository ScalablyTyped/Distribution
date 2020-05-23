package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.places.AutocompleteOptions
import typings.googlemaps.google.maps.places.AutocompletePrediction
import typings.googlemaps.google.maps.places.AutocompletionRequest
import typings.googlemaps.google.maps.places.FindPlaceFromPhoneNumberRequest
import typings.googlemaps.google.maps.places.FindPlaceFromQueryRequest
import typings.googlemaps.google.maps.places.PlaceDetailsRequest
import typings.googlemaps.google.maps.places.PlaceResult
import typings.googlemaps.google.maps.places.PlaceSearchPagination
import typings.googlemaps.google.maps.places.PlaceSearchRequest
import typings.googlemaps.google.maps.places.PlacesServiceStatus
import typings.googlemaps.google.maps.places.QueryAutocompletePrediction
import typings.googlemaps.google.maps.places.QueryAutocompletionRequest
import typings.googlemaps.google.maps.places.RadarSearchRequest
import typings.googlemaps.google.maps.places.SearchBoxOptions
import typings.googlemaps.google.maps.places.TextSearchRequest
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.places")
@js.native
object places extends js.Object {
  @js.native
  class Autocomplete protected ()
    extends typings.googlemaps.google.maps.places.Autocomplete {
    def this(inputField: HTMLInputElement) = this()
    def this(inputField: HTMLInputElement, opts: AutocompleteOptions) = this()
  }
  
  @js.native
  class AutocompleteService ()
    extends typings.googlemaps.google.maps.places.AutocompleteService {
    /* CompleteClass */
    override def getPlacePredictions(
      request: AutocompletionRequest,
      callback: js.Function2[
          /* result */ js.Array[AutocompletePrediction], 
          /* status */ PlacesServiceStatus, 
          Unit
        ]
    ): Unit = js.native
    /* CompleteClass */
    override def getQueryPredictions(
      request: QueryAutocompletionRequest,
      callback: js.Function2[
          /* result */ js.Array[QueryAutocompletePrediction], 
          /* status */ PlacesServiceStatus, 
          Unit
        ]
    ): Unit = js.native
  }
  
  @js.native
  class AutocompleteSessionToken ()
    extends typings.googlemaps.google.maps.places.AutocompleteSessionToken
  
  @js.native
  class PlacesService protected ()
    extends typings.googlemaps.google.maps.places.PlacesService {
    def this(attrContainer: typings.googlemaps.google.maps.Map[Element]) = this()
    def this(attrContainer: HTMLDivElement) = this()
    /* CompleteClass */
    override def findPlaceFromPhoneNumber(
      request: FindPlaceFromPhoneNumberRequest,
      callback: js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]
    ): Unit = js.native
    /* CompleteClass */
    override def findPlaceFromQuery(
      request: FindPlaceFromQueryRequest,
      callback: js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]
    ): Unit = js.native
    /* CompleteClass */
    override def getDetails(
      request: PlaceDetailsRequest,
      callback: js.Function2[/* result */ PlaceResult, /* status */ PlacesServiceStatus, Unit]
    ): Unit = js.native
    /* CompleteClass */
    override def nearbySearch(
      request: PlaceSearchRequest,
      callback: js.Function3[
          /* results */ js.Array[PlaceResult], 
          /* status */ PlacesServiceStatus, 
          /* pagination */ PlaceSearchPagination, 
          Unit
        ]
    ): Unit = js.native
    /**
      * @deprecated Radar search is deprecated as of June 30, 2018. After that
      *     time, this feature will no longer be available.
      */
    /* CompleteClass */
    override def radarSearch(
      request: RadarSearchRequest,
      callback: js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]
    ): Unit = js.native
    /* CompleteClass */
    override def textSearch(
      request: TextSearchRequest,
      callback: js.Function3[
          /* results */ js.Array[PlaceResult], 
          /* status */ PlacesServiceStatus, 
          /* pagination */ PlaceSearchPagination, 
          Unit
        ]
    ): Unit = js.native
  }
  
  @js.native
  class SearchBox protected ()
    extends typings.googlemaps.google.maps.places.SearchBox {
    def this(inputField: HTMLInputElement) = this()
    def this(inputField: HTMLInputElement, opts: SearchBoxOptions) = this()
  }
  
  @js.native
  object PlacesServiceStatus extends js.Object {
    /* "INVALID_REQUEST" */ val INVALID_REQUEST: typings.googlemaps.google.maps.places.PlacesServiceStatus.INVALID_REQUEST with String = js.native
    /* "NOT_FOUND" */ val NOT_FOUND: typings.googlemaps.google.maps.places.PlacesServiceStatus.NOT_FOUND with String = js.native
    /* "OK" */ val OK: typings.googlemaps.google.maps.places.PlacesServiceStatus.OK with String = js.native
    /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typings.googlemaps.google.maps.places.PlacesServiceStatus.OVER_QUERY_LIMIT with String = js.native
    /* "REQUEST_DENIED" */ val REQUEST_DENIED: typings.googlemaps.google.maps.places.PlacesServiceStatus.REQUEST_DENIED with String = js.native
    /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googlemaps.google.maps.places.PlacesServiceStatus.UNKNOWN_ERROR with String = js.native
    /* "ZERO_RESULTS" */ val ZERO_RESULTS: typings.googlemaps.google.maps.places.PlacesServiceStatus.ZERO_RESULTS with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googlemaps.google.maps.places.PlacesServiceStatus with String] = js.native
  }
  
  @js.native
  object RankBy extends js.Object {
    /* 1 */ val DISTANCE: typings.googlemaps.google.maps.places.RankBy.DISTANCE with Double = js.native
    /* 0 */ val PROMINENCE: typings.googlemaps.google.maps.places.RankBy.PROMINENCE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googlemaps.google.maps.places.RankBy with Double] = js.native
  }
  
}

