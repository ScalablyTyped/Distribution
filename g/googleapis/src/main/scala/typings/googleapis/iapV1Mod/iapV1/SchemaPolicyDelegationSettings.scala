package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyDelegationSettings extends StObject {
  
  /**
    * Permission to check in IAM.
    */
  var iamPermission: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The DNS name of the service (e.g. "resourcemanager.googleapis.com"). This should be the domain name part of the full resource names (see https://aip.dev/122#full-resource-names), which is usually the same as IamServiceSpec.service of the service where the resource type is defined.
    */
  var iamServiceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Policy name to be checked
    */
  var policyName: js.UndefOr[SchemaPolicyName] = js.undefined
  
  /**
    * IAM resource to check permission on
    */
  var resource: js.UndefOr[SchemaResource] = js.undefined
}
object SchemaPolicyDelegationSettings {
  
  inline def apply(): SchemaPolicyDelegationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyDelegationSettings]
  }
  
  extension [Self <: SchemaPolicyDelegationSettings](x: Self) {
    
    inline def setIamPermission(value: String): Self = StObject.set(x, "iamPermission", value.asInstanceOf[js.Any])
    
    inline def setIamPermissionNull: Self = StObject.set(x, "iamPermission", null)
    
    inline def setIamPermissionUndefined: Self = StObject.set(x, "iamPermission", js.undefined)
    
    inline def setIamServiceName(value: String): Self = StObject.set(x, "iamServiceName", value.asInstanceOf[js.Any])
    
    inline def setIamServiceNameNull: Self = StObject.set(x, "iamServiceName", null)
    
    inline def setIamServiceNameUndefined: Self = StObject.set(x, "iamServiceName", js.undefined)
    
    inline def setPolicyName(value: SchemaPolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
    
    inline def setResource(value: SchemaResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
