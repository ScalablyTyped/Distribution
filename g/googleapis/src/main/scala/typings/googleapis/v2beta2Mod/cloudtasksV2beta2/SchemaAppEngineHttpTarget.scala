package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SchemaAppEngineHttpTarget extends StObject {
  
  /**
    * Overrides for the task-level app_engine_routing.  If set,
    * `app_engine_routing_override` is used for all tasks in the queue, no
    * matter what the setting is for the task-level app_engine_routing.
    */
  var appEngineRoutingOverride: js.UndefOr[SchemaAppEngineRouting] = js.undefined
}
object SchemaAppEngineHttpTarget {
  
  @scala.inline
  def apply(): SchemaAppEngineHttpTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppEngineHttpTarget]
  }
  
  @scala.inline
  implicit class SchemaAppEngineHttpTargetMutableBuilder[Self <: SchemaAppEngineHttpTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppEngineRoutingOverride(value: SchemaAppEngineRouting): Self = StObject.set(x, "appEngineRoutingOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppEngineRoutingOverrideUndefined: Self = StObject.set(x, "appEngineRoutingOverride", js.undefined)
  }
}
