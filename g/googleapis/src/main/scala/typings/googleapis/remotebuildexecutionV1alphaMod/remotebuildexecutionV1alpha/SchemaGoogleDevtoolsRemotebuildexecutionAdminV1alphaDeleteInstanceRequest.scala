package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request used for `DeleteInstance`.
  */
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteInstanceRequest extends StObject {
  
  /**
    * Name of the instance to delete. Format:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteInstanceRequest {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteInstanceRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteInstanceRequestMutableBuilder[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
