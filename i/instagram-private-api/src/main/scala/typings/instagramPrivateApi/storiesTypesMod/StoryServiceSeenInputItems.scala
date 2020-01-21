package typings.instagramPrivateApi.storiesTypesMod

import typings.instagramPrivateApi.AnonPk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryServiceSeenInputItems extends js.Object {
  var id: String
  var taken_at: Double
  var user: AnonPk
}

object StoryServiceSeenInputItems {
  @scala.inline
  def apply(id: String, taken_at: Double, user: AnonPk): StoryServiceSeenInputItems = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryServiceSeenInputItems]
  }
}

