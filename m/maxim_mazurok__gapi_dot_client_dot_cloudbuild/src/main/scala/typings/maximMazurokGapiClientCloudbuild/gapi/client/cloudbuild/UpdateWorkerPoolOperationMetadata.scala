package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkerPoolOperationMetadata extends StObject {
  
  /** Time the operation was completed. */
  var completeTime: js.UndefOr[String] = js.undefined
  
  /** Time the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The resource name of the `WorkerPool` being updated. Format: `projects/{project}/locations/{location}/workerPools/{worker_pool}`. */
  var workerPool: js.UndefOr[String] = js.undefined
}
object UpdateWorkerPoolOperationMetadata {
  
  inline def apply(): UpdateWorkerPoolOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorkerPoolOperationMetadata]
  }
  
  extension [Self <: UpdateWorkerPoolOperationMetadata](x: Self) {
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "completeTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setWorkerPool(value: String): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolUndefined: Self = StObject.set(x, "workerPool", js.undefined)
  }
}
