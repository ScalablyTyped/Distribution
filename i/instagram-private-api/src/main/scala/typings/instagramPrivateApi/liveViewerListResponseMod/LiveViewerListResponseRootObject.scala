package typings.instagramPrivateApi.liveViewerListResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveViewerListResponseRootObject extends js.Object {
  var status: String
  var users: js.Array[LiveViewerListResponseUsersItem]
}

object LiveViewerListResponseRootObject {
  @scala.inline
  def apply(status: String, users: js.Array[LiveViewerListResponseUsersItem]): LiveViewerListResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveViewerListResponseRootObject]
  }
}

