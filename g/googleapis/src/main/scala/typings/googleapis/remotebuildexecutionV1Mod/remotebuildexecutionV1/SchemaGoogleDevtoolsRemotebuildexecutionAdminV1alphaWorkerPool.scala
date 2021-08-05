package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A worker pool resource in the Remote Build Execution API.
  */
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool extends StObject {
  
  /**
    * WorkerPool resource name formatted as:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`.
    * name should not be populated when creating a worker pool since it is
    * provided in the `poolId` field.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. State of the worker pool.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the properties, such as machine type and disk size, used for
    * creating workers in a worker pool.
    */
  var workerConfig: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig] = js.undefined
  
  /**
    * The desired number of workers in the worker pool. Must be a value between
    * 0 and 1000.
    */
  var workerCount: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setWorkerConfig(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
    
    inline def setWorkerCount(value: String): Self = StObject.set(x, "workerCount", value.asInstanceOf[js.Any])
    
    inline def setWorkerCountUndefined: Self = StObject.set(x, "workerCount", js.undefined)
  }
}
