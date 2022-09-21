package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivatePoolV1Config extends StObject {
  
  /** Network configuration for the pool. */
  var networkConfig: js.UndefOr[NetworkConfig] = js.undefined
  
  /** Machine configuration for the workers in the pool. */
  var workerConfig: js.UndefOr[WorkerConfig] = js.undefined
}
object PrivatePoolV1Config {
  
  inline def apply(): PrivatePoolV1Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivatePoolV1Config]
  }
  
  extension [Self <: PrivatePoolV1Config](x: Self) {
    
    inline def setNetworkConfig(value: NetworkConfig): Self = StObject.set(x, "networkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "networkConfig", js.undefined)
    
    inline def setWorkerConfig(value: WorkerConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
  }
}
