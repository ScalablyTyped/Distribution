package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryTestablePermissionsRequest extends StObject {
  
  /**
    * Required. The full resource name to query from the list of testable permissions. The name follows the Google Cloud Platform resource format. For example, a Cloud Platform project with id `my-project` will be named `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional limit on the number of permissions to include in the response. The default is 100, and the maximum is 1,000.
    */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional pagination token returned in an earlier QueryTestablePermissionsRequest.
    */
  var pageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueryTestablePermissionsRequest {
  
  inline def apply(): SchemaQueryTestablePermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryTestablePermissionsRequest]
  }
  
  extension [Self <: SchemaQueryTestablePermissionsRequest](x: Self) {
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameNull: Self = StObject.set(x, "fullResourceName", null)
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
