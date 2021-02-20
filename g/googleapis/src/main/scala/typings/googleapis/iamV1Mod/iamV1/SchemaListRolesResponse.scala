package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response containing the roles defined under a resource.
  */
@js.native
trait SchemaListRolesResponse extends StObject {
  
  /**
    * To retrieve the next page of results, set `ListRolesRequest.page_token`
    * to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The Roles defined on this resource.
    */
  var roles: js.UndefOr[js.Array[SchemaRole]] = js.native
}
object SchemaListRolesResponse {
  
  @scala.inline
  def apply(): SchemaListRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRolesResponse]
  }
  
  @scala.inline
  implicit class SchemaListRolesResponseMutableBuilder[Self <: SchemaListRolesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRoles(value: js.Array[SchemaRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: SchemaRole*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
