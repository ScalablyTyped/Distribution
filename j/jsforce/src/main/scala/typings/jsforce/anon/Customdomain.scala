package typings.jsforce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Customdomain extends js.Object {
  
  var custom_domain: js.UndefOr[String] = js.native
  
  var enterprise: String = js.native
  
  var feed_elements: String = js.native
  
  var feed_items: String = js.native
  
  var feeds: String = js.native
  
  var groups: String = js.native
  
  var metadata: String = js.native
  
  var partner: String = js.native
  
  var profile: String = js.native
  
  var query: String = js.native
  
  var recent: String = js.native
  
  var rest: String = js.native
  
  var search: String = js.native
  
  var sobjects: String = js.native
  
  var tooling_rest: String = js.native
  
  var tooling_soap: String = js.native
  
  var users: String = js.native
}
object Customdomain {
  
  @scala.inline
  def apply(
    enterprise: String,
    feed_elements: String,
    feed_items: String,
    feeds: String,
    groups: String,
    metadata: String,
    partner: String,
    profile: String,
    query: String,
    recent: String,
    rest: String,
    search: String,
    sobjects: String,
    tooling_rest: String,
    tooling_soap: String,
    users: String
  ): Customdomain = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], feed_elements = feed_elements.asInstanceOf[js.Any], feed_items = feed_items.asInstanceOf[js.Any], feeds = feeds.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], partner = partner.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], recent = recent.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], sobjects = sobjects.asInstanceOf[js.Any], tooling_rest = tooling_rest.asInstanceOf[js.Any], tooling_soap = tooling_soap.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customdomain]
  }
  
  @scala.inline
  implicit class CustomdomainOps[Self <: Customdomain] (val x: Self) extends AnyVal {
    
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
    def setEnterprise(value: String): Self = this.set("enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeed_elements(value: String): Self = this.set("feed_elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeed_items(value: String): Self = this.set("feed_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeeds(value: String): Self = this.set("feeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: String): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartner(value: String): Self = this.set("partner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecent(value: String): Self = this.set("recent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRest(value: String): Self = this.set("rest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSobjects(value: String): Self = this.set("sobjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooling_rest(value: String): Self = this.set("tooling_rest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooling_soap(value: String): Self = this.set("tooling_soap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: String): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_domain(value: String): Self = this.set("custom_domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_domain: Self = this.set("custom_domain", js.undefined)
  }
}
