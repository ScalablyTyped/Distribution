package typings.instagramDashPrivateDashApi.distTypesStoriesDotTypesMod

import typings.instagramDashPrivateDashApi.Anon_Pk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryServiceSeenInputItems extends js.Object {
  var id: String
  var taken_at: Double
  var user: Anon_Pk
}

object StoryServiceSeenInputItems {
  @scala.inline
  def apply(id: String, taken_at: Double, user: Anon_Pk): StoryServiceSeenInputItems = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryServiceSeenInputItems]
  }
}

