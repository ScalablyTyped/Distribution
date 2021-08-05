package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

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
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetInstanceRequest]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaGetInstanceRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
