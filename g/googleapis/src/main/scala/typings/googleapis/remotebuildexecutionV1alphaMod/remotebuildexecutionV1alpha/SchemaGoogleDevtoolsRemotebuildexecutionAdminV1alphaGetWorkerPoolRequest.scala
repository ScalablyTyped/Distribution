package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request used for GetWorkerPool.
  */
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest extends StObject {
  
  /**
    * Name of the worker pool to retrieve. Format:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequestMutableBuilder[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
