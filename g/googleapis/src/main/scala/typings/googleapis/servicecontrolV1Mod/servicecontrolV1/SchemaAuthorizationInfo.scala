package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthorizationInfo extends StObject {
  
  /**
    * Whether or not authorization for `resource` and `permission` was granted.
    */
  var granted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The required IAM permission.
    */
  var permission: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource being accessed, as a REST-style or cloud resource string. For example: bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID or projects/PROJECTID/datasets/DATASETID
    */
  var resource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource attributes used in IAM condition evaluation. This field contains resource attributes like resource type and resource name. To get the whole view of the attributes used in IAM condition evaluation, the user must also look into `AuditLog.request_metadata.request_attributes`.
    */
  var resourceAttributes: js.UndefOr[SchemaResource] = js.undefined
}
object SchemaAuthorizationInfo {
  
  inline def apply(): SchemaAuthorizationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizationInfo]
  }
  
  extension [Self <: SchemaAuthorizationInfo](x: Self) {
    
    inline def setGranted(value: Boolean): Self = StObject.set(x, "granted", value.asInstanceOf[js.Any])
    
    inline def setGrantedNull: Self = StObject.set(x, "granted", null)
    
    inline def setGrantedUndefined: Self = StObject.set(x, "granted", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionNull: Self = StObject.set(x, "permission", null)
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceAttributes(value: SchemaResource): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
    
    inline def setResourceAttributesUndefined: Self = StObject.set(x, "resourceAttributes", js.undefined)
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
