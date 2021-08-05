package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to get the list of auditable services for a resource.
  */
trait SchemaQueryAuditableServicesRequest extends StObject {
  
  /**
    * Required. The full resource name to query from the list of auditable
    * services.  The name follows the Google Cloud Platform resource format.
    * For example, a Cloud Platform project with id `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String] = js.undefined
}
object SchemaQueryAuditableServicesRequest {
  
  inline def apply(): SchemaQueryAuditableServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryAuditableServicesRequest]
  }
  
  extension [Self <: SchemaQueryAuditableServicesRequest](x: Self) {
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
  }
}
