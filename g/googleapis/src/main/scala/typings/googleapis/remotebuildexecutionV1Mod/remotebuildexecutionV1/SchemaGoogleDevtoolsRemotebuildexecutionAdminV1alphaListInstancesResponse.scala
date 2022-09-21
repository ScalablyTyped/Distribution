package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse extends StObject {
  
  /**
    * The list of instances in a given project.
    */
  var instances: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse](x: Self) {
    
    inline def setInstances(value: js.Array[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
