package typings.instagramDashPrivateDashApi.distResponsesNewsDotRepositoryDotInboxDotResponseMod

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
    val __obj = js.Dynamic.literal(args = args, counts = counts, pk = pk, story_type = story_type)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NewsRepositoryInboxResponseNewStoriesItem]
  }
}

