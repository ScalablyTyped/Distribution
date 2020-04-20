package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseTopPostsUnit extends js.Object {
  var last_week_posts_count: Double
  var top_posts: InsightsServiceAccountResponseTopPosts
  var week_over_week_posts_delta: Double
}

object InsightsServiceAccountResponseTopPostsUnit {
  @scala.inline
  def apply(
    last_week_posts_count: Double,
    top_posts: InsightsServiceAccountResponseTopPosts,
    week_over_week_posts_delta: Double
  ): InsightsServiceAccountResponseTopPostsUnit = {
    val __obj = js.Dynamic.literal(last_week_posts_count = last_week_posts_count.asInstanceOf[js.Any], top_posts = top_posts.asInstanceOf[js.Any], week_over_week_posts_delta = week_over_week_posts_delta.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseTopPostsUnit]
  }
}

