package typings.keenTracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjectId extends js.Object {
  var projectId: String
  var requestType: js.UndefOr[String] = js.undefined
  var writeKey: String
}

object AnonProjectId {
  @scala.inline
  def apply(projectId: String, writeKey: String, requestType: String = null): AnonProjectId = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], writeKey = writeKey.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjectId]
  }
}

