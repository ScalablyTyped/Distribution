package typings.keenDashTracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProjectId extends js.Object {
  var projectId: String
  var requestType: js.UndefOr[String] = js.undefined
  var writeKey: String
}

object Anon_ProjectId {
  @scala.inline
  def apply(projectId: String, writeKey: String, requestType: String = null): Anon_ProjectId = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], writeKey = writeKey.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProjectId]
  }
}

