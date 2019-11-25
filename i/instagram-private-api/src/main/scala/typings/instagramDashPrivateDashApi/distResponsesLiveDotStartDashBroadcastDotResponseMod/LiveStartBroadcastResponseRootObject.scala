package typings.instagramDashPrivateDashApi.distResponsesLiveDotStartDashBroadcastDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStartBroadcastResponseRootObject extends js.Object {
  var media_id: String
  var status: String
}

object LiveStartBroadcastResponseRootObject {
  @scala.inline
  def apply(media_id: String, status: String): LiveStartBroadcastResponseRootObject = {
    val __obj = js.Dynamic.literal(media_id = media_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LiveStartBroadcastResponseRootObject]
  }
}

