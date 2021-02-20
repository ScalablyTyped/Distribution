package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.instagramPrivateApiStrings.date_followed_earliest
import typings.instagramPrivateApi.instagramPrivateApiStrings.date_followed_latest
import typings.instagramPrivateApi.instagramPrivateApiStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<instagram-private-api.instagram-private-api/dist/feeds.AccountFollowingFeed, 'searchSurface' | 'order' | 'query' | 'enableGroups' | 'includesHashtags' | 'id'>> */
@js.native
trait PartialPickAccountFollowi extends StObject {
  
  var enableGroups: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[Double | String] = js.native
  
  var includesHashtags: js.UndefOr[Boolean] = js.native
  
  var order: js.UndefOr[default | date_followed_latest | date_followed_earliest] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var searchSurface: js.UndefOr[String] = js.native
}
object PartialPickAccountFollowi {
  
  @scala.inline
  def apply(): PartialPickAccountFollowi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickAccountFollowi]
  }
  
  @scala.inline
  implicit class PartialPickAccountFollowiMutableBuilder[Self <: PartialPickAccountFollowi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableGroups(value: Boolean): Self = StObject.set(x, "enableGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableGroupsUndefined: Self = StObject.set(x, "enableGroups", js.undefined)
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIncludesHashtags(value: Boolean): Self = StObject.set(x, "includesHashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesHashtagsUndefined: Self = StObject.set(x, "includesHashtags", js.undefined)
    
    @scala.inline
    def setOrder(value: default | date_followed_latest | date_followed_earliest): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSearchSurface(value: String): Self = StObject.set(x, "searchSurface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchSurfaceUndefined: Self = StObject.set(x, "searchSurface", js.undefined)
  }
}
