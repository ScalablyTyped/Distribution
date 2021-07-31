package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request used for `GetInstance`.
  */
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetInstanceRequest extends StObject {
  
  /**
    * Name of the instance to retrieve. Format:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetInstanceRequest {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetInstanceRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetInstanceRequestMutableBuilder[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
