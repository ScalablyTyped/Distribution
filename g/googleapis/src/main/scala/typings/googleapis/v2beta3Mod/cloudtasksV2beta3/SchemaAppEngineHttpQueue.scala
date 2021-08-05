package typings.googleapis.v2beta3Mod.cloudtasksV2beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SchemaAppEngineHttpQueue extends StObject {
  
  /**
    * Overrides for the task-level app_engine_routing.  If set,
    * `app_engine_routing_override` is used for all tasks in the queue, no
    * matter what the setting is for the task-level app_engine_routing.
    */
  var appEngineRoutingOverride: js.UndefOr[SchemaAppEngineRouting] = js.undefined
}
object SchemaAppEngineHttpQueue {
  
  inline def apply(): SchemaAppEngineHttpQueue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppEngineHttpQueue]
  }
  
  extension [Self <: SchemaAppEngineHttpQueue](x: Self) {
    
    inline def setAppEngineRoutingOverride(value: SchemaAppEngineRouting): Self = StObject.set(x, "appEngineRoutingOverride", value.asInstanceOf[js.Any])
    
    inline def setAppEngineRoutingOverrideUndefined: Self = StObject.set(x, "appEngineRoutingOverride", js.undefined)
  }
}
