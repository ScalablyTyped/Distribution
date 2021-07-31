package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permissions extends StObject {
  
  var excluded_permissions: js.Array[String]
  
  var interactions: FollowingBoolean
  
  var permissions: js.Array[String]
}
object Permissions {
  
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: FollowingBoolean,
    permissions: js.Array[String]
  ): Permissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permissions]
  }
  
  @scala.inline
  implicit class PermissionsMutableBuilder[Self <: Permissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcluded_permissions(value: js.Array[String]): Self = StObject.set(x, "excluded_permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcluded_permissionsVarargs(value: String*): Self = StObject.set(x, "excluded_permissions", js.Array(value :_*))
    
    @scala.inline
    def setInteractions(value: FollowingBoolean): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
