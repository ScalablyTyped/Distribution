package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Authorization information for the operation.
  */
@js.native
trait SchemaAuthorizationInfo extends StObject {
  
  /**
    * Whether or not authorization for `resource` and `permission` was granted.
    */
  var granted: js.UndefOr[Boolean] = js.native
  
  /**
    * The required IAM permission.
    */
  var permission: js.UndefOr[String] = js.native
  
  /**
    * The resource being accessed, as a REST-style string. For example:
    * bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID
    */
  var resource: js.UndefOr[String] = js.native
  
  /**
    * Resource attributes used in IAM condition evaluation. This field contains
    * resource attributes like resource type and resource name.  To get the
    * whole view of the attributes used in IAM condition evaluation, the user
    * must also look into `AuditLog.request_metadata.request_attributes`.
    */
  var resourceAttributes: js.UndefOr[SchemaResource] = js.native
}
object SchemaAuthorizationInfo {
  
  @scala.inline
  def apply(): SchemaAuthorizationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizationInfo]
  }
  
  @scala.inline
  implicit class SchemaAuthorizationInfoMutableBuilder[Self <: SchemaAuthorizationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGranted(value: Boolean): Self = StObject.set(x, "granted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantedUndefined: Self = StObject.set(x, "granted", js.undefined)
    
    @scala.inline
    def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAttributes(value: SchemaResource): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAttributesUndefined: Self = StObject.set(x, "resourceAttributes", js.undefined)
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
