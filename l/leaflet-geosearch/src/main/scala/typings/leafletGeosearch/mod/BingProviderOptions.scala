package typings.leafletGeosearch.mod

import typings.leafletGeosearch.leafletGeosearchNumbers.`-1`
import typings.leafletGeosearch.leafletGeosearchNumbers.`0`
import typings.leafletGeosearch.leafletGeosearchNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BingProviderOptions
  extends StObject
     with BingProviderCultureOptions
     with BingProviderUserContextOptions {
  
  var adminDistrict: js.UndefOr[String] = js.undefined
  
  var incl: js.UndefOr[String] = js.undefined
  
  var inclnb: js.UndefOr[`-1` | `0` | `1`] = js.undefined
  
  var include: js.UndefOr[String] = js.undefined
  
  var includeNeighborhood: js.UndefOr[`-1` | `0` | `1`] = js.undefined
  
  var key: String
  
  var maxResults: js.UndefOr[Double] = js.undefined
}
object BingProviderOptions {
  
  inline def apply(key: String): BingProviderOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingProviderOptions]
  }
  
  extension [Self <: BingProviderOptions](x: Self) {
    
    inline def setAdminDistrict(value: String): Self = StObject.set(x, "adminDistrict", value.asInstanceOf[js.Any])
    
    inline def setAdminDistrictUndefined: Self = StObject.set(x, "adminDistrict", js.undefined)
    
    inline def setIncl(value: String): Self = StObject.set(x, "incl", value.asInstanceOf[js.Any])
    
    inline def setInclUndefined: Self = StObject.set(x, "incl", js.undefined)
    
    inline def setInclnb(value: `-1` | `0` | `1`): Self = StObject.set(x, "inclnb", value.asInstanceOf[js.Any])
    
    inline def setInclnbUndefined: Self = StObject.set(x, "inclnb", js.undefined)
    
    inline def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeNeighborhood(value: `-1` | `0` | `1`): Self = StObject.set(x, "includeNeighborhood", value.asInstanceOf[js.Any])
    
    inline def setIncludeNeighborhoodUndefined: Self = StObject.set(x, "includeNeighborhood", js.undefined)
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
  }
}
