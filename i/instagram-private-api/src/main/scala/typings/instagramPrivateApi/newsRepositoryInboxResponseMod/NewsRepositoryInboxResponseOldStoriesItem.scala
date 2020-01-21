package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsRepositoryInboxResponseOldStoriesItem extends js.Object {
  var args: NewsRepositoryInboxResponseArgs
  var counts: NewsRepositoryInboxResponseCounts
  var pk: js.UndefOr[String] = js.undefined
  var story_type: Double
  var `type`: Double
}

object NewsRepositoryInboxResponseOldStoriesItem {
  @scala.inline
  def apply(
    args: NewsRepositoryInboxResponseArgs,
    counts: NewsRepositoryInboxResponseCounts,
    story_type: Double,
    `type`: Double,
    pk: String = null
  ): NewsRepositoryInboxResponseOldStoriesItem = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], counts = counts.asInstanceOf[js.Any], story_type = story_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (pk != null) __obj.updateDynamic("pk")(pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseOldStoriesItem]
  }
}

