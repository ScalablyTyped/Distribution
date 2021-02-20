package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Permissions extends StObject {
  
  /** A list of permissions. A sample permission string: `compute.disk.get`. */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}
object Permissions {
  
  @scala.inline
  def apply(): Permissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permissions]
  }
  
  @scala.inline
  implicit class PermissionsMutableBuilder[Self <: Permissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
