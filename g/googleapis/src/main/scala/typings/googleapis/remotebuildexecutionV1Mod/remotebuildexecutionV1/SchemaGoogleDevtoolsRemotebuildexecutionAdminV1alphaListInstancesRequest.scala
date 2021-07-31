package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest extends StObject {
  
  /**
    * Resource name of the project. Format: `projects/[PROJECT_ID]`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequestMutableBuilder[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
