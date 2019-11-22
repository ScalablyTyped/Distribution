package typings.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseAdMetadataItem extends js.Object {
  var `type`: Double
  var value: String
}

object TimelineFeedResponseAdMetadataItem {
  @scala.inline
  def apply(`type`: Double, value: String): TimelineFeedResponseAdMetadataItem = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TimelineFeedResponseAdMetadataItem]
  }
}

