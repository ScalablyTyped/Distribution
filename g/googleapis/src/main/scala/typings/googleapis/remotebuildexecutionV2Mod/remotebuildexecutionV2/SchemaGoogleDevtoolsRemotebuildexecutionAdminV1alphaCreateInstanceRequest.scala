package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request used for `CreateInstance`.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest extends StObject {
  
  /**
    * Specifies the instance to create. The name in the instance, if specified
    * in the instance, is ignored.
    */
  var instance: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = js.native
  
  /**
    * ID of the created instance. A valid `instance_id` must: be 6-50
    * characters long, contain only lowercase letters, digits, hyphens and
    * underscores, start with a lowercase letter, and end with a lowercase
    * letter or a digit.
    */
  var instanceId: js.UndefOr[String] = js.native
  
  /**
    * Resource name of the project containing the instance. Format:
    * `projects/[PROJECT_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequestMutableBuilder[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
