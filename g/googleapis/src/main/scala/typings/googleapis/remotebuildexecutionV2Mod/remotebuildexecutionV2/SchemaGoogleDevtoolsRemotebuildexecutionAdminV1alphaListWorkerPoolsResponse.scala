package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse extends StObject {
  
  /**
    * The list of worker pools in a given instance.
    */
  var workerPools: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]] = js.native
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponseMutableBuilder[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkerPools(value: js.Array[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]): Self = StObject.set(x, "workerPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerPoolsUndefined: Self = StObject.set(x, "workerPools", js.undefined)
    
    @scala.inline
    def setWorkerPoolsVarargs(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool*): Self = StObject.set(x, "workerPools", js.Array(value :_*))
  }
}
