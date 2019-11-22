package typings.instagramDashPrivateDashApi.distResponsesLiveDotFinalDashViewersDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveFinalViewersResponseRootObject extends js.Object {
  var status: String
  var total_unique_viewer_count: Double
  var users: js.Array[LiveFinalViewersResponseUsersItem]
}

object LiveFinalViewersResponseRootObject {
  @scala.inline
  def apply(
    status: String,
    total_unique_viewer_count: Double,
    users: js.Array[LiveFinalViewersResponseUsersItem]
  ): LiveFinalViewersResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status, total_unique_viewer_count = total_unique_viewer_count, users = users)
  
    __obj.asInstanceOf[LiveFinalViewersResponseRootObject]
  }
}

