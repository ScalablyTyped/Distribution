package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.instagramPrivateApiStrings.date_followed_earliest
import typings.instagramPrivateApi.instagramPrivateApiStrings.date_followed_latest
import typings.instagramPrivateApi.instagramPrivateApiStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<instagram-private-api.instagram-private-api/dist/feeds.AccountFollowingFeed, 'searchSurface' | 'order' | 'query' | 'enableGroups' | 'includesHashtags' | 'id'>> */
trait PartialPickAccountFollowi extends StObject {
  
  var enableGroups: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[Double | String] = js.undefined
  
  var includesHashtags: js.UndefOr[Boolean] = js.undefined
  
  var order: js.UndefOr[default | date_followed_latest | date_followed_earliest] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var searchSurface: js.UndefOr[String] = js.undefined
}
object PartialPickAccountFollowi {
  
  inline def apply(): PartialPickAccountFollowi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickAccountFollowi]
  }
  
  extension [Self <: PartialPickAccountFollowi](x: Self) {
    
    inline def setEnableGroups(value: Boolean): Self = StObject.set(x, "enableGroups", value.asInstanceOf[js.Any])
    
    inline def setEnableGroupsUndefined: Self = StObject.set(x, "enableGroups", js.undefined)
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIncludesHashtags(value: Boolean): Self = StObject.set(x, "includesHashtags", value.asInstanceOf[js.Any])
    
    inline def setIncludesHashtagsUndefined: Self = StObject.set(x, "includesHashtags", js.undefined)
    
    inline def setOrder(value: default | date_followed_latest | date_followed_earliest): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSearchSurface(value: String): Self = StObject.set(x, "searchSurface", value.asInstanceOf[js.Any])
    
    inline def setSearchSurfaceUndefined: Self = StObject.set(x, "searchSurface", js.undefined)
  }
}
