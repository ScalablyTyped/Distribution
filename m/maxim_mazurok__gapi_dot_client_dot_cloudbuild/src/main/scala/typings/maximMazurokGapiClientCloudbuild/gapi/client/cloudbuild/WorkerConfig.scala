package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerConfig extends StObject {
  
  /**
    * Size of the disk attached to the worker, in GB. See [Worker pool config file](https://cloud.google.com/build/docs/private-pools/worker-pool-config-file-schema). Specify a value of
    * up to 1000. If `0` is specified, Cloud Build will use a standard disk size.
    */
  var diskSizeGb: js.UndefOr[String] = js.undefined
  
  /**
    * Machine type of a worker, such as `e2-medium`. See [Worker pool config file](https://cloud.google.com/build/docs/private-pools/worker-pool-config-file-schema). If left blank, Cloud
    * Build will use a sensible default.
    */
  var machineType: js.UndefOr[String] = js.undefined
}
object WorkerConfig {
  
  inline def apply(): WorkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerConfig]
  }
  
  extension [Self <: WorkerConfig](x: Self) {
    
    inline def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
  }
}
