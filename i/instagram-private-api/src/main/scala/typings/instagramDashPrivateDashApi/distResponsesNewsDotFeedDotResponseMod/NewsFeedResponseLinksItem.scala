package typings.instagramDashPrivateDashApi.distResponsesNewsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsFeedResponseLinksItem extends js.Object {
  var end: Double
  var id: String
  var start: Double
  var `type`: String
}

object NewsFeedResponseLinksItem {
  @scala.inline
  def apply(end: Double, id: String, start: Double, `type`: String): NewsFeedResponseLinksItem = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsFeedResponseLinksItem]
  }
}

