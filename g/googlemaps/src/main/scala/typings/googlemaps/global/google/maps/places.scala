package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.places.AutocompleteOptions
import typings.googlemaps.google.maps.places.SearchBoxOptions
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    extends typings.googlemaps.google.maps.places.AutocompleteService
  
  @js.native
  class AutocompleteSessionToken ()
    extends typings.googlemaps.google.maps.places.AutocompleteSessionToken
  
  @js.native
  class PlacesService protected ()
    extends typings.googlemaps.google.maps.places.PlacesService {
    def this(attrContainer: typings.googlemaps.google.maps.Map[Element]) = this()
    def this(attrContainer: HTMLDivElement) = this()
  }
  
  @js.native
  object PlacesServiceStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googlemaps.google.maps.places.PlacesServiceStatus with String] = js.native
    
    /* "INVALID_REQUEST" */ val INVALID_REQUEST: typings.googlemaps.google.maps.places.PlacesServiceStatus.INVALID_REQUEST with String = js.native
    
    /* "NOT_FOUND" */ val NOT_FOUND: typings.googlemaps.google.maps.places.PlacesServiceStatus.NOT_FOUND with String = js.native
    
    /* "OK" */ val OK: typings.googlemaps.google.maps.places.PlacesServiceStatus.OK with String = js.native
    
    /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typings.googlemaps.google.maps.places.PlacesServiceStatus.OVER_QUERY_LIMIT with String = js.native
    
    /* "REQUEST_DENIED" */ val REQUEST_DENIED: typings.googlemaps.google.maps.places.PlacesServiceStatus.REQUEST_DENIED with String = js.native
    
    /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googlemaps.google.maps.places.PlacesServiceStatus.UNKNOWN_ERROR with String = js.native
    
    /* "ZERO_RESULTS" */ val ZERO_RESULTS: typings.googlemaps.google.maps.places.PlacesServiceStatus.ZERO_RESULTS with String = js.native
  }
  
  @js.native
  object RankBy extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googlemaps.google.maps.places.RankBy with Double] = js.native
    
    /* 1 */ val DISTANCE: typings.googlemaps.google.maps.places.RankBy.DISTANCE with Double = js.native
    
    /* 0 */ val PROMINENCE: typings.googlemaps.google.maps.places.RankBy.PROMINENCE with Double = js.native
  }
  
  @js.native
  class SearchBox protected ()
    extends typings.googlemaps.google.maps.places.SearchBox {
    def this(inputField: HTMLInputElement) = this()
    def this(inputField: HTMLInputElement, opts: SearchBoxOptions) = this()
  }
}
