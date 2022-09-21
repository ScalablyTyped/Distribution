package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTenantProjectConfig extends StObject {
  
  /**
    * Billing account properties. The billing account must be specified.
    */
  var billingConfig: js.UndefOr[SchemaBillingConfig] = js.undefined
  
  /**
    * Folder where project in this tenancy unit must be located This folder must have been previously created with the required permissions for the caller to create and configure a project in it. Valid folder resource names have the format `folders/{folder_number\}` (for example, `folders/123456`).
    */
  var folder: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels that are applied to this project.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Configuration for the IAM service account on the tenant project.
    */
  var serviceAccountConfig: js.UndefOr[SchemaServiceAccountConfig] = js.undefined
  
  /**
    * Google Cloud API names of services that are activated on this project during provisioning. If any of these services can't be activated, the request fails. For example: 'compute.googleapis.com','cloudfunctions.googleapis.com'
    */
  var services: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Describes ownership and policies for the new tenant project.
    */
  var tenantProjectPolicy: js.UndefOr[SchemaTenantProjectPolicy] = js.undefined
}
object SchemaTenantProjectConfig {
  
  inline def apply(): SchemaTenantProjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTenantProjectConfig]
  }
  
  extension [Self <: SchemaTenantProjectConfig](x: Self) {
    
    inline def setBillingConfig(value: SchemaBillingConfig): Self = StObject.set(x, "billingConfig", value.asInstanceOf[js.Any])
    
    inline def setBillingConfigUndefined: Self = StObject.set(x, "billingConfig", js.undefined)
    
    inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderNull: Self = StObject.set(x, "folder", null)
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setServiceAccountConfig(value: SchemaServiceAccountConfig): Self = StObject.set(x, "serviceAccountConfig", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountConfigUndefined: Self = StObject.set(x, "serviceAccountConfig", js.undefined)
    
    inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesNull: Self = StObject.set(x, "services", null)
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setTenantProjectPolicy(value: SchemaTenantProjectPolicy): Self = StObject.set(x, "tenantProjectPolicy", value.asInstanceOf[js.Any])
    
    inline def setTenantProjectPolicyUndefined: Self = StObject.set(x, "tenantProjectPolicy", js.undefined)
  }
}
