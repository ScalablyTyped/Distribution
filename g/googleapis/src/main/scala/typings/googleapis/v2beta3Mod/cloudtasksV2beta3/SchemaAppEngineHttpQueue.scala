package typings.googleapis.v2beta3Mod.cloudtasksV2beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * App Engine HTTP queue.  The task will be delivered to the App Engine
  * application hostname specified by its AppEngineHttpQueue and
  * AppEngineHttpRequest. The documentation for AppEngineHttpRequest explains
  * how the task&#39;s host URL is constructed.  Using AppEngineHttpQueue
  * requires
  * [`appengine.applications.get`](https://cloud.google.com/appengine/docs/admin-api/access-control)
  * Google IAM permission for the project and the following scope:
  * `https://www.googleapis.com/auth/cloud-platform`
  */
@js.native
trait SchemaAppEngineHttpQueue extends js.Object {
  /**
    * Overrides for the task-level app_engine_routing.  If set,
    * `app_engine_routing_override` is used for all tasks in the queue, no
    * matter what the setting is for the task-level app_engine_routing.
    */
  var appEngineRoutingOverride: js.UndefOr[SchemaAppEngineRouting] = js.native
}

object SchemaAppEngineHttpQueue {
  @scala.inline
  def apply(appEngineRoutingOverride: SchemaAppEngineRouting = null): SchemaAppEngineHttpQueue = {
    val __obj = js.Dynamic.literal()
    if (appEngineRoutingOverride != null) __obj.updateDynamic("appEngineRoutingOverride")(appEngineRoutingOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppEngineHttpQueue]
  }
}

