package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request used for `CreateWorkerPool`.
  */
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest extends StObject {
  
  /**
    * Resource name of the instance in which to create the new worker pool.
    * Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the created worker pool. A valid pool ID must: be 6-50 characters
    * long, contain only lowercase letters, digits, hyphens and underscores,
    * start with a lowercase letter, and end with a lowercase letter or a
    * digit.
    */
  var poolId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the worker pool to create. The name in the worker pool, if
    * specified, is ignored.
    */
  var workerPool: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPoolId(value: String): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "poolId", js.undefined)
    
    inline def setWorkerPool(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolUndefined: Self = StObject.set(x, "workerPool", js.undefined)
  }
}
