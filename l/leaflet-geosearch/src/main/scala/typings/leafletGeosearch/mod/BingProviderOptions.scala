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
  
  @scala.inline
  def apply(key: String): BingProviderOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingProviderOptions]
  }
  
  @scala.inline
  implicit class BingProviderOptionsMutableBuilder[Self <: BingProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminDistrict(value: String): Self = StObject.set(x, "adminDistrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminDistrictUndefined: Self = StObject.set(x, "adminDistrict", js.undefined)
    
    @scala.inline
    def setIncl(value: String): Self = StObject.set(x, "incl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclUndefined: Self = StObject.set(x, "incl", js.undefined)
    
    @scala.inline
    def setInclnb(value: `-1` | `0` | `1`): Self = StObject.set(x, "inclnb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclnbUndefined: Self = StObject.set(x, "inclnb", js.undefined)
    
    @scala.inline
    def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNeighborhood(value: `-1` | `0` | `1`): Self = StObject.set(x, "includeNeighborhood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNeighborhoodUndefined: Self = StObject.set(x, "includeNeighborhood", js.undefined)
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
  }
}
