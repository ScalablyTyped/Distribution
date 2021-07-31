package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestPermissionsRequest extends StObject {
  
  /**
    * The set of permissions to check for the &#39;resource&#39;. Permissions
    * with wildcards (such as &#39;*&#39; or &#39;storage.*&#39;) are not
    * allowed.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaTestPermissionsRequest {
  
  @scala.inline
  def apply(): SchemaTestPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestPermissionsRequest]
  }
  
  @scala.inline
  implicit class SchemaTestPermissionsRequestMutableBuilder[Self <: SchemaTestPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
