package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkloadsConfig extends StObject {
  
  /** Optional. Resources used by Airflow schedulers. */
  var scheduler: js.UndefOr[SchedulerResource] = js.undefined
  
  /** Optional. Resources used by Airflow web server. */
  var webServer: js.UndefOr[WebServerResource] = js.undefined
  
  /** Optional. Resources used by Airflow workers. */
  var worker: js.UndefOr[WorkerResource] = js.undefined
}
object WorkloadsConfig {
  
  inline def apply(): WorkloadsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkloadsConfig]
  }
  
  extension [Self <: WorkloadsConfig](x: Self) {
    
    inline def setScheduler(value: SchedulerResource): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
    
    inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
    
    inline def setWebServer(value: WebServerResource): Self = StObject.set(x, "webServer", value.asInstanceOf[js.Any])
    
    inline def setWebServerUndefined: Self = StObject.set(x, "webServer", js.undefined)
    
    inline def setWorker(value: WorkerResource): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
