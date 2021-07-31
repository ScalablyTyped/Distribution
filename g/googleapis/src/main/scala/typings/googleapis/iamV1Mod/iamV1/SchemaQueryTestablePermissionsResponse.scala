package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response containing permissions which can be tested on a resource.
  */
trait SchemaQueryTestablePermissionsResponse extends StObject {
  
  /**
    * To retrieve the next page of results, set
    * `QueryTestableRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Permissions testable on the requested resource.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.undefined
}
object SchemaQueryTestablePermissionsResponse {
  
  @scala.inline
  def apply(): SchemaQueryTestablePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryTestablePermissionsResponse]
  }
  
  @scala.inline
  implicit class SchemaQueryTestablePermissionsResponseMutableBuilder[Self <: SchemaQueryTestablePermissionsResponse] (val x: Self) extends AnyVal {
    
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
