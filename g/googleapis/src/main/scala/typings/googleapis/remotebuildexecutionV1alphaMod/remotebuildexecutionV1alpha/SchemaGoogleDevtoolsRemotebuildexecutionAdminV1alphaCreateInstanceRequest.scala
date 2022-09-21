package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest extends StObject {
  
  /**
    * Specifies the instance to create. The name in the instance, if specified in the instance, is ignored.
    */
  var instance: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = js.undefined
  
  /**
    * ID of the created instance. A valid `instance_id` must: be 6-50 characters long, contain only lowercase letters, digits, hyphens and underscores, start with a lowercase letter, and end with a lowercase letter or a digit.
    */
  var instanceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of the project containing the instance. Format: `projects/[PROJECT_ID]`.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest](x: Self) {
    
    inline def setInstance(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
