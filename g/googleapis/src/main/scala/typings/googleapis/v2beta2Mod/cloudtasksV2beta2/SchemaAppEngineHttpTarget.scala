package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * App Engine HTTP target.  The task will be delivered to the App Engine
  * application hostname specified by its AppEngineHttpTarget and
  * AppEngineHttpRequest. The documentation for AppEngineHttpRequest explains
  * how the task&#39;s host URL is constructed.  Using AppEngineHttpTarget
  * requires
  * [`appengine.applications.get`](https://cloud.google.com/appengine/docs/admin-api/access-control)
  * Google IAM permission for the project and the following scope:
  * `https://www.googleapis.com/auth/cloud-platform`
  */
@js.native
trait SchemaAppEngineHttpTarget extends js.Object {
  /**
    * Overrides for the task-level app_engine_routing.  If set,
    * `app_engine_routing_override` is used for all tasks in the queue, no
    * matter what the setting is for the task-level app_engine_routing.
    */
  var appEngineRoutingOverride: js.UndefOr[SchemaAppEngineRouting] = js.native
}

object SchemaAppEngineHttpTarget {
  @scala.inline
  def apply(): SchemaAppEngineHttpTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppEngineHttpTarget]
  }
  @scala.inline
  implicit class SchemaAppEngineHttpTargetOps[Self <: SchemaAppEngineHttpTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppEngineRoutingOverride(value: SchemaAppEngineRouting): Self = this.set("appEngineRoutingOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppEngineRoutingOverride: Self = this.set("appEngineRoutingOverride", js.undefined)
  }
  
}

