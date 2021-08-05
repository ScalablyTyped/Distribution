package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest extends StObject {
  
  /**
    * Resource name of the instance. Format:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
