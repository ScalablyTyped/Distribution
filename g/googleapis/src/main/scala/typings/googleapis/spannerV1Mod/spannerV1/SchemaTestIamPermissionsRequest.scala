package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for `TestIamPermissions` method.
  */
@js.native
trait SchemaTestIamPermissionsRequest extends StObject {
  
  /**
    * REQUIRED: The set of permissions to check for &#39;resource&#39;.
    * Permissions with wildcards (such as &#39;*&#39;, &#39;spanner.*&#39;,
    * &#39;spanner.instances.*&#39;) are not allowed.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}
object SchemaTestIamPermissionsRequest {
  
  @scala.inline
  def apply(): SchemaTestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestIamPermissionsRequest]
  }
  
  @scala.inline
  implicit class SchemaTestIamPermissionsRequestMutableBuilder[Self <: SchemaTestIamPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
