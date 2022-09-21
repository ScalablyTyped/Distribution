package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse extends StObject {
  
  /**
    * The list of worker pools in a given instance.
    */
  var workerPools: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse](x: Self) {
    
    inline def setWorkerPools(value: js.Array[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]): Self = StObject.set(x, "workerPools", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolsUndefined: Self = StObject.set(x, "workerPools", js.undefined)
    
    inline def setWorkerPoolsVarargs(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool*): Self = StObject.set(x, "workerPools", js.Array(value*))
  }
}
