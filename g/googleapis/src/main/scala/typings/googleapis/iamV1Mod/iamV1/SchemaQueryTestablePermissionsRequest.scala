package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to get permissions which can be tested on a resource.
  */
trait SchemaQueryTestablePermissionsRequest extends StObject {
  
  /**
    * Required. The full resource name to query from the list of testable
    * permissions.  The name follows the Google Cloud Platform resource format.
    * For example, a Cloud Platform project with id `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional limit on the number of permissions to include in the response.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional pagination token returned in an earlier
    * QueryTestablePermissionsRequest.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object SchemaQueryTestablePermissionsRequest {
  
  inline def apply(): SchemaQueryTestablePermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryTestablePermissionsRequest]
  }
  
  extension [Self <: SchemaQueryTestablePermissionsRequest](x: Self) {
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
