package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A stop is a single small point or structure at which vehicles stop.
  * A stop always belongs to a station. It may for example be a sign, a basic shelter or a railway platform.
  */
trait Stop extends StObject {
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var entrances: js.UndefOr[js.Array[Location]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var ids: js.UndefOr[Ids] = js.undefined
  
  var isMeta: js.UndefOr[Boolean] = js.undefined
  
  var lines: js.UndefOr[js.Array[Line]] = js.undefined
  
  var loadFactor: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[Location] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var products: js.UndefOr[Products] = js.undefined
  
  var reisezentrumOpeningHours: js.UndefOr[ReisezentrumOpeningHours] = js.undefined
  
  var station: js.UndefOr[Station] = js.undefined
  
  var transitAuthority: js.UndefOr[String] = js.undefined
  
  var `type`: stop
}
object Stop {
  
  inline def apply(): Stop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stop")
    __obj.asInstanceOf[Stop]
  }
  
  extension [Self <: Stop](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setEntrances(value: js.Array[Location]): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    inline def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    inline def setEntrancesVarargs(value: Location*): Self = StObject.set(x, "entrances", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIds(value: Ids): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIsMeta(value: Boolean): Self = StObject.set(x, "isMeta", value.asInstanceOf[js.Any])
    
    inline def setIsMetaUndefined: Self = StObject.set(x, "isMeta", js.undefined)
    
    inline def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setLoadFactor(value: String): Self = StObject.set(x, "loadFactor", value.asInstanceOf[js.Any])
    
    inline def setLoadFactorUndefined: Self = StObject.set(x, "loadFactor", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setReisezentrumOpeningHours(value: ReisezentrumOpeningHours): Self = StObject.set(x, "reisezentrumOpeningHours", value.asInstanceOf[js.Any])
    
    inline def setReisezentrumOpeningHoursUndefined: Self = StObject.set(x, "reisezentrumOpeningHours", js.undefined)
    
    inline def setStation(value: Station): Self = StObject.set(x, "station", value.asInstanceOf[js.Any])
    
    inline def setStationUndefined: Self = StObject.set(x, "station", js.undefined)
    
    inline def setTransitAuthority(value: String): Self = StObject.set(x, "transitAuthority", value.asInstanceOf[js.Any])
    
    inline def setTransitAuthorityUndefined: Self = StObject.set(x, "transitAuthority", js.undefined)
    
    inline def setType(value: stop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
