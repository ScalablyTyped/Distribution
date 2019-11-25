package typings.instagramDashPrivateDashApi.distResponsesDirectDotRepositoryDotGetDashPresenceDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectRepositoryGetPresenceResponseRootObject extends js.Object {
  var status: String
  var user_presence: js.Any
}

object DirectRepositoryGetPresenceResponseRootObject {
  @scala.inline
  def apply(status: String, user_presence: js.Any): DirectRepositoryGetPresenceResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user_presence = user_presence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectRepositoryGetPresenceResponseRootObject]
  }
}

