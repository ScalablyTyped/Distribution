package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacesService extends StObject {
  
  def findPlaceFromPhoneNumber(
    request: FindPlaceFromPhoneNumberRequest,
    callback: js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]
  ): Unit
  
  def findPlaceFromQuery(
    request: FindPlaceFromQueryRequest,
    callback: js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]
  ): Unit
  
  def getDetails(
    request: PlaceDetailsRequest,
    callback: js.Function2[/* result */ PlaceResult, /* status */ PlacesServiceStatus, Unit]
  ): Unit
  
  def nearbySearch(
    request: PlaceSearchRequest,
    callback: js.Function3[
      /* results */ js.Array[PlaceResult], 
      /* status */ PlacesServiceStatus, 
      /* pagination */ PlaceSearchPagination, 
      Unit
    ]
  ): Unit
  
  /**
    * @deprecated Radar search is deprecated as of June 30, 2018. After that
    *     time, this feature will no longer be available.
    */
  def radarSearch(
    request: RadarSearchRequest,
    callback: js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]
  ): Unit
  
  def textSearch(
    request: TextSearchRequest,
    callback: js.Function3[
      /* results */ js.Array[PlaceResult], 
      /* status */ PlacesServiceStatus, 
      /* pagination */ PlaceSearchPagination, 
      Unit
    ]
  ): Unit
}
object PlacesService {
  
  @scala.inline
  def apply(
    findPlaceFromPhoneNumber: (FindPlaceFromPhoneNumberRequest, js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]) => Unit,
    findPlaceFromQuery: (FindPlaceFromQueryRequest, js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]) => Unit,
    getDetails: (PlaceDetailsRequest, js.Function2[/* result */ PlaceResult, /* status */ PlacesServiceStatus, Unit]) => Unit,
    nearbySearch: (PlaceSearchRequest, js.Function3[
      /* results */ js.Array[PlaceResult], 
      /* status */ PlacesServiceStatus, 
      /* pagination */ PlaceSearchPagination, 
      Unit
    ]) => Unit,
    radarSearch: (RadarSearchRequest, js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]) => Unit,
    textSearch: (TextSearchRequest, js.Function3[
      /* results */ js.Array[PlaceResult], 
      /* status */ PlacesServiceStatus, 
      /* pagination */ PlaceSearchPagination, 
      Unit
    ]) => Unit
  ): PlacesService = {
    val __obj = js.Dynamic.literal(findPlaceFromPhoneNumber = js.Any.fromFunction2(findPlaceFromPhoneNumber), findPlaceFromQuery = js.Any.fromFunction2(findPlaceFromQuery), getDetails = js.Any.fromFunction2(getDetails), nearbySearch = js.Any.fromFunction2(nearbySearch), radarSearch = js.Any.fromFunction2(radarSearch), textSearch = js.Any.fromFunction2(textSearch))
    __obj.asInstanceOf[PlacesService]
  }
  
  @scala.inline
  implicit class PlacesServiceMutableBuilder[Self <: PlacesService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindPlaceFromPhoneNumber(
      value: (FindPlaceFromPhoneNumberRequest, js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]) => Unit
    ): Self = StObject.set(x, "findPlaceFromPhoneNumber", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindPlaceFromQuery(
      value: (FindPlaceFromQueryRequest, js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]) => Unit
    ): Self = StObject.set(x, "findPlaceFromQuery", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDetails(
      value: (PlaceDetailsRequest, js.Function2[/* result */ PlaceResult, /* status */ PlacesServiceStatus, Unit]) => Unit
    ): Self = StObject.set(x, "getDetails", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNearbySearch(
      value: (PlaceSearchRequest, js.Function3[
          /* results */ js.Array[PlaceResult], 
          /* status */ PlacesServiceStatus, 
          /* pagination */ PlaceSearchPagination, 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "nearbySearch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRadarSearch(
      value: (RadarSearchRequest, js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]) => Unit
    ): Self = StObject.set(x, "radarSearch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTextSearch(
      value: (TextSearchRequest, js.Function3[
          /* results */ js.Array[PlaceResult], 
          /* status */ PlacesServiceStatus, 
          /* pagination */ PlaceSearchPagination, 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "textSearch", js.Any.fromFunction2(value))
  }
}
