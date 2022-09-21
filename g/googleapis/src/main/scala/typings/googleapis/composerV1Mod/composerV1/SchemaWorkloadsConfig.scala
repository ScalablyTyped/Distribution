package typings.googleapis.composerV1Mod.composerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkloadsConfig extends StObject {
  
  /**
    * Optional. Resources used by Airflow schedulers.
    */
  var scheduler: js.UndefOr[SchemaSchedulerResource] = js.undefined
  
  /**
    * Optional. Resources used by Airflow web server.
    */
  var webServer: js.UndefOr[SchemaWebServerResource] = js.undefined
  
  /**
    * Optional. Resources used by Airflow workers.
    */
  var worker: js.UndefOr[SchemaWorkerResource] = js.undefined
}
object SchemaWorkloadsConfig {
  
  inline def apply(): SchemaWorkloadsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkloadsConfig]
  }
  
  extension [Self <: SchemaWorkloadsConfig](x: Self) {
    
    inline def setScheduler(value: SchemaSchedulerResource): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
    
    inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
    
    inline def setWebServer(value: SchemaWebServerResource): Self = StObject.set(x, "webServer", value.asInstanceOf[js.Any])
    
    inline def setWebServerUndefined: Self = StObject.set(x, "webServer", js.undefined)
    
    inline def setWorker(value: SchemaWorkerResource): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
