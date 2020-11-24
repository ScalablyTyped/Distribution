package typings.instagramPrivateApi.discoverFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverFeedResponseNewSuggestedUsers extends js.Object {
  
  var suggestions: js.Array[_] = js.native
}
object DiscoverFeedResponseNewSuggestedUsers {
  
  @scala.inline
  def apply(suggestions: js.Array[_]): DiscoverFeedResponseNewSuggestedUsers = {
    val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverFeedResponseNewSuggestedUsers]
  }
  
  @scala.inline
  implicit class DiscoverFeedResponseNewSuggestedUsersOps[Self <: DiscoverFeedResponseNewSuggestedUsers] (val x: Self) extends AnyVal {
    
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
    def setSuggestionsVarargs(value: js.Any*): Self = this.set("suggestions", js.Array(value :_*))
    
    @scala.inline
    def setSuggestions(value: js.Array[_]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
  }
}
