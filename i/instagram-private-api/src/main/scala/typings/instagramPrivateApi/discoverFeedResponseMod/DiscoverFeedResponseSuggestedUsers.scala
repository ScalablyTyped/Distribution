package typings.instagramPrivateApi.discoverFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverFeedResponseSuggestedUsers extends js.Object {
  var suggestions: js.Array[DiscoverFeedResponseSuggestionsItem]
}

object DiscoverFeedResponseSuggestedUsers {
  @scala.inline
  def apply(suggestions: js.Array[DiscoverFeedResponseSuggestionsItem]): DiscoverFeedResponseSuggestedUsers = {
    val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverFeedResponseSuggestedUsers]
  }
}

