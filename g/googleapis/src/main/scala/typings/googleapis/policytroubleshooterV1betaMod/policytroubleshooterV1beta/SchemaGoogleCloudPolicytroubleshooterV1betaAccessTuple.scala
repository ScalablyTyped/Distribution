package typings.googleapis.policytroubleshooterV1betaMod.policytroubleshooterV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicytroubleshooterV1betaAccessTuple extends StObject {
  
  /**
    * Required. The full resource name that identifies the resource. For example, `//compute.googleapis.com/projects/my-project/zones/us-central1-a/instances/my-instance`. For examples of full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
    */
  var fullResourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The IAM permission to check for the specified member and resource. For a complete list of IAM permissions, see https://cloud.google.com/iam/help/permissions/reference. For a complete list of predefined IAM roles and the permissions in each role, see https://cloud.google.com/iam/help/roles/reference.
    */
  var permission: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The member, or principal, whose access you want to check, in the form of the email address that represents that member. For example, `alice@example.com` or `my-service-account@my-project.iam.gserviceaccount.com`. The member must be a Google Account or a service account. Other types of members are not supported.
    */
  var principal: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPolicytroubleshooterV1betaAccessTuple {
  
  inline def apply(): SchemaGoogleCloudPolicytroubleshooterV1betaAccessTuple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicytroubleshooterV1betaAccessTuple]
  }
  
  extension [Self <: SchemaGoogleCloudPolicytroubleshooterV1betaAccessTuple](x: Self) {
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameNull: Self = StObject.set(x, "fullResourceName", null)
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionNull: Self = StObject.set(x, "permission", null)
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalNull: Self = StObject.set(x, "principal", null)
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
  }
}
