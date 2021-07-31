package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List user permissions response.
  */
trait SchemaListUserPermissionsResponse extends StObject {
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * All GTM UserPermissions of a GTM Account.
    */
  var userPermission: js.UndefOr[js.Array[SchemaUserPermission]] = js.undefined
}
object SchemaListUserPermissionsResponse {
  
  @scala.inline
  def apply(): SchemaListUserPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUserPermissionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListUserPermissionsResponseMutableBuilder[Self <: SchemaListUserPermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUserPermission(value: js.Array[SchemaUserPermission]): Self = StObject.set(x, "userPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPermissionUndefined: Self = StObject.set(x, "userPermission", js.undefined)
    
    @scala.inline
    def setUserPermissionVarargs(value: SchemaUserPermission*): Self = StObject.set(x, "userPermission", js.Array(value :_*))
  }
}
