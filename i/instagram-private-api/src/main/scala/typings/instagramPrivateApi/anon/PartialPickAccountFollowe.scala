package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.instagramPrivateApiStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<instagram-private-api.instagram-private-api/dist/feeds.AccountFollowersFeed, 'searchSurface' | 'order' | 'query' | 'enableGroups' | 'id'>> */
trait PartialPickAccountFollowe extends StObject {
  
  var enableGroups: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[Double | String] = js.undefined
  
  var order: js.UndefOr[default] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var searchSurface: js.UndefOr[String] = js.undefined
}
object PartialPickAccountFollowe {
  
  @scala.inline
  def apply(): PartialPickAccountFollowe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickAccountFollowe]
  }
  
  @scala.inline
  implicit class PartialPickAccountFolloweMutableBuilder[Self <: PartialPickAccountFollowe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableGroups(value: Boolean): Self = StObject.set(x, "enableGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableGroupsUndefined: Self = StObject.set(x, "enableGroups", js.undefined)
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOrder(value: default): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
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
