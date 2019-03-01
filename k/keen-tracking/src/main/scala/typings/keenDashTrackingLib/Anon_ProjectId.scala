package typings
package keenDashTrackingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProjectId extends js.Object {
  var projectId: java.lang.String
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  var writeKey: java.lang.String
}

object Anon_ProjectId {
  @scala.inline
  def apply(projectId: java.lang.String, writeKey: java.lang.String, requestType: java.lang.String = null): Anon_ProjectId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("projectId")(projectId)
    __obj.updateDynamic("writeKey")(writeKey)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    __obj.asInstanceOf[Anon_ProjectId]
  }
}

