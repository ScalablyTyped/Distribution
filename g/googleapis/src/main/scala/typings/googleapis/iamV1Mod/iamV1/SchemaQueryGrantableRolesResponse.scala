package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The grantable role query response.
  */
trait SchemaQueryGrantableRolesResponse extends StObject {
  
  /**
    * To retrieve the next page of results, set
    * `QueryGrantableRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of matching roles.
    */
  var roles: js.UndefOr[js.Array[SchemaRole]] = js.undefined
}
object SchemaQueryGrantableRolesResponse {
  
  @scala.inline
  def apply(): SchemaQueryGrantableRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryGrantableRolesResponse]
  }
  
  @scala.inline
  implicit class SchemaQueryGrantableRolesResponseMutableBuilder[Self <: SchemaQueryGrantableRolesResponse] (val x: Self) extends AnyVal {
    
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
