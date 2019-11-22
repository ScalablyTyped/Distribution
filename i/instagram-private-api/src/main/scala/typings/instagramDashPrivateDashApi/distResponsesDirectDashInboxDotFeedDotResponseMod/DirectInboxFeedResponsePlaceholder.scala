package typings.instagramDashPrivateDashApi.distResponsesDirectDashInboxDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectInboxFeedResponsePlaceholder extends js.Object {
  var is_linked: Boolean
  var message: String
  var title: String
}

object DirectInboxFeedResponsePlaceholder {
  @scala.inline
  def apply(is_linked: Boolean, message: String, title: String): DirectInboxFeedResponsePlaceholder = {
    val __obj = js.Dynamic.literal(is_linked = is_linked, message = message, title = title)
  
    __obj.asInstanceOf[DirectInboxFeedResponsePlaceholder]
  }
}

