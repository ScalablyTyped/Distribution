package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The grantable role query request.
  */
trait SchemaQueryGrantableRolesRequest extends StObject {
  
  /**
    * Required. The full resource name to query from the list of grantable
    * roles.  The name follows the Google Cloud Platform resource format. For
    * example, a Cloud Platform project with id `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional limit on the number of roles to include in the response.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional pagination token returned in an earlier
    * QueryGrantableRolesResponse.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
}
object SchemaQueryGrantableRolesRequest {
  
  @scala.inline
  def apply(): SchemaQueryGrantableRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryGrantableRolesRequest]
  }
  
  @scala.inline
  implicit class SchemaQueryGrantableRolesRequestMutableBuilder[Self <: SchemaQueryGrantableRolesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
