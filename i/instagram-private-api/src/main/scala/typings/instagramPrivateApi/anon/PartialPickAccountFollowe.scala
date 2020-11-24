package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.instagramPrivateApiStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<instagram-private-api.instagram-private-api/dist/feeds.AccountFollowersFeed, 'searchSurface' | 'order' | 'query' | 'enableGroups' | 'id'>> */
@js.native
trait PartialPickAccountFollowe extends js.Object {
  
  var enableGroups: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[Double | String] = js.native
  
  var order: js.UndefOr[default] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var searchSurface: js.UndefOr[String] = js.native
}
object PartialPickAccountFollowe {
  
  @scala.inline
  def apply(): PartialPickAccountFollowe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickAccountFollowe]
  }
  
  @scala.inline
  implicit class PartialPickAccountFolloweOps[Self <: PartialPickAccountFollowe] (val x: Self) extends AnyVal {
    
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
    def setOrder(value: default): Self = this.set("order", value.asInstanceOf[js.Any])
    
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
