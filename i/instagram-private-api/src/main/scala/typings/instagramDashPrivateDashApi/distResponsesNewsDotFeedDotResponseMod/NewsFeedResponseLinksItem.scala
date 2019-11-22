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
    val __obj = js.Dynamic.literal(end = end, id = id, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NewsFeedResponseLinksItem]
  }
}

