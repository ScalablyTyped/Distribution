package typings.instagramPrivateApi.discoverFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverFeedResponseSuggestedUsers extends js.Object {
  
  var suggestions: js.Array[DiscoverFeedResponseSuggestionsItem] = js.native
}
object DiscoverFeedResponseSuggestedUsers {
  
  @scala.inline
  def apply(suggestions: js.Array[DiscoverFeedResponseSuggestionsItem]): DiscoverFeedResponseSuggestedUsers = {
    val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverFeedResponseSuggestedUsers]
  }
  
  @scala.inline
  implicit class DiscoverFeedResponseSuggestedUsersOps[Self <: DiscoverFeedResponseSuggestedUsers] (val x: Self) extends AnyVal {
    
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
    def setSuggestionsVarargs(value: DiscoverFeedResponseSuggestionsItem*): Self = this.set("suggestions", js.Array(value :_*))
    
    @scala.inline
    def setSuggestions(value: js.Array[DiscoverFeedResponseSuggestionsItem]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
  }
}
