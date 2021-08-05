package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.station
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A station is a larger building or area that can be identified by a name.
  * It is usually represented by a single node on a public transport map.
  * Whereas a stop usually specifies a location, a station often is a broader area
  * that may span across multiple levels or buildings.
  */
trait Station extends StObject {
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var entrances: js.UndefOr[js.Array[Location]] = js.undefined
  
  var facilities: js.UndefOr[Facilities] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var isMeta: js.UndefOr[Boolean] = js.undefined
  
  var location: js.UndefOr[Location] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var products: js.UndefOr[Products] = js.undefined
  
  /** region ids */
  var regions: js.UndefOr[js.Array[String]] = js.undefined
  
  var reisezentrumOpeningHours: js.UndefOr[ReisezentrumOpeningHours] = js.undefined
  
  var station: js.UndefOr[Station] = js.undefined
  
  var stops: js.UndefOr[js.Array[Station | Stop | Location]] = js.undefined
  
  var transitAuthority: js.UndefOr[String] = js.undefined
  
  var `type`: station
}
object Station {
  
  inline def apply(): Station = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("station")
    __obj.asInstanceOf[Station]
  }
  
  extension [Self <: Station](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setEntrances(value: js.Array[Location]): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    inline def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    inline def setEntrancesVarargs(value: Location*): Self = StObject.set(x, "entrances", js.Array(value :_*))
    
    inline def setFacilities(value: Facilities): Self = StObject.set(x, "facilities", value.asInstanceOf[js.Any])
    
    inline def setFacilitiesUndefined: Self = StObject.set(x, "facilities", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsMeta(value: Boolean): Self = StObject.set(x, "isMeta", value.asInstanceOf[js.Any])
    
    inline def setIsMetaUndefined: Self = StObject.set(x, "isMeta", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
    
    inline def setReisezentrumOpeningHours(value: ReisezentrumOpeningHours): Self = StObject.set(x, "reisezentrumOpeningHours", value.asInstanceOf[js.Any])
    
    inline def setReisezentrumOpeningHoursUndefined: Self = StObject.set(x, "reisezentrumOpeningHours", js.undefined)
    
    inline def setStation(value: Station): Self = StObject.set(x, "station", value.asInstanceOf[js.Any])
    
    inline def setStationUndefined: Self = StObject.set(x, "station", js.undefined)
    
    inline def setStops(value: js.Array[Station | Stop | Location]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: (Station | Stop | Location)*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    inline def setTransitAuthority(value: String): Self = StObject.set(x, "transitAuthority", value.asInstanceOf[js.Any])
    
    inline def setTransitAuthorityUndefined: Self = StObject.set(x, "transitAuthority", js.undefined)
    
    inline def setType(value: station): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
