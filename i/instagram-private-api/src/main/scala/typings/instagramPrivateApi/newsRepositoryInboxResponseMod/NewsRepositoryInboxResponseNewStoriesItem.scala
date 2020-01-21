package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsRepositoryInboxResponseNewStoriesItem extends js.Object {
  var args: NewsRepositoryInboxResponseArgs
  var counts: NewsRepositoryInboxResponseCounts
  var pk: String
  var story_type: Double
  var `type`: Double
}

object NewsRepositoryInboxResponseNewStoriesItem {
  @scala.inline
  def apply(
    args: NewsRepositoryInboxResponseArgs,
    counts: NewsRepositoryInboxResponseCounts,
    pk: String,
    story_type: Double,
    `type`: Double
  ): NewsRepositoryInboxResponseNewStoriesItem = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], counts = counts.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], story_type = story_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseNewStoriesItem]
  }
}

