package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.instagramPrivateApiStrings.date_followed_earliest
import typings.instagramPrivateApi.instagramPrivateApiStrings.date_followed_latest
import typings.instagramPrivateApi.instagramPrivateApiStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<instagram-private-api.instagram-private-api/dist/feeds.AccountFollowingFeed, 'searchSurface' | 'order' | 'query' | 'enableGroups' | 'includesHashtags' | 'id'>> */
@js.native
trait PartialPickAccountFollowi extends js.Object {
  
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
  implicit class PartialPickAccountFollowiOps[Self <: PartialPickAccountFollowi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnableGroups(value: Boolean): Self = this.set("enableGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGroups: Self = this.set("enableGroups", js.undefined)
    
    @scala.inline
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIncludesHashtags(value: Boolean): Self = this.set("includesHashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludesHashtags: Self = this.set("includesHashtags", js.undefined)
    
    @scala.inline
    def setOrder(value: default | date_followed_latest | date_followed_earliest): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setSearchSurface(value: String): Self = this.set("searchSurface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchSurface: Self = this.set("searchSurface", js.undefined)
  }
}
