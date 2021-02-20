package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of permissions for a file.
  */
@js.native
trait SchemaPermissionList extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#permissionList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The page token for the next page of permissions. This field will be
    * absent if the end of the permissions list has been reached. If the token
    * is rejected for any reason, it should be discarded, and pagination should
    * be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of permissions. If nextPageToken is populated, then this list
    * may be incomplete and an additional page of results should be fetched.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
}
object SchemaPermissionList {
  
  @scala.inline
  def apply(): SchemaPermissionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionList]
  }
  
  @scala.inline
  implicit class SchemaPermissionListMutableBuilder[Self <: SchemaPermissionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
