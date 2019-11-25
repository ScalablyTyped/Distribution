package typings.instagramDashPrivateDashApi.distTypesMediaDotLikeDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.feed_contextual_location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedContextualLocation extends js.Object {
  var location_id: String | Double
  var module_name: feed_contextual_location
}

object FeedContextualLocation {
  @scala.inline
  def apply(location_id: String | Double, module_name: feed_contextual_location): FeedContextualLocation = {
    val __obj = js.Dynamic.literal(location_id = location_id.asInstanceOf[js.Any], module_name = module_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeedContextualLocation]
  }
}

