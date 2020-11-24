package typings.jiraClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchUserOptions extends js.Object {
  
  var includeActive: js.UndefOr[Boolean] = js.native
  
  var includeInactive: js.UndefOr[Boolean] = js.native
  
  var maxResults: js.UndefOr[Double] = js.native
  
  var startAt: js.UndefOr[Double] = js.native
  
  var username: String = js.native
}
object SearchUserOptions {
  
  @scala.inline
  def apply(username: String): SearchUserOptions = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUserOptions]
  }
  
  @scala.inline
  implicit class SearchUserOptionsOps[Self <: SearchUserOptions] (val x: Self) extends AnyVal {
    
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
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeActive(value: Boolean): Self = this.set("includeActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeActive: Self = this.set("includeActive", js.undefined)
    
    @scala.inline
    def setIncludeInactive(value: Boolean): Self = this.set("includeInactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInactive: Self = this.set("includeInactive", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setStartAt(value: Double): Self = this.set("startAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
  }
}
