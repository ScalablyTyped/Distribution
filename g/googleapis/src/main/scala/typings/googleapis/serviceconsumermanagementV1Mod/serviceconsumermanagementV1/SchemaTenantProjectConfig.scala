package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure defines a tenant project to be added to the specified
  * tenancy unit and its initial configuration and properties. A project lien
  * is created for the tenant project to prevent the tenant project from being
  * deleted accidentally. The lien is deleted as part of tenant project
  * removal.
  */
trait SchemaTenantProjectConfig extends StObject {
  
  /**
    * Billing account properties. The billing account must be specified.
    */
  var billingConfig: js.UndefOr[SchemaBillingConfig] = js.undefined
  
  /**
    * Folder where project in this tenancy unit must be located This folder
    * must have been previously created with the required permissions for the
    * caller to create and configure a project in it. Valid folder resource
    * names have the format `folders/{folder_number}` (for example,
    * `folders/123456`).
    */
  var folder: js.UndefOr[String] = js.undefined
  
  /**
    * Labels that are applied to this project.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Configuration for the IAM service account on the tenant project.
    */
  var serviceAccountConfig: js.UndefOr[SchemaServiceAccountConfig] = js.undefined
  
  /**
    * Google Cloud API names of services that are activated on this project
    * during provisioning.  If any of these services can&#39;t be activated,
    * the request fails. For example:
    * &#39;compute.googleapis.com&#39;,&#39;cloudfunctions.googleapis.com&#39;
    */
  var services: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Describes ownership and policies for the new tenant project. Required.
    */
  var tenantProjectPolicy: js.UndefOr[SchemaTenantProjectPolicy] = js.undefined
}
object SchemaTenantProjectConfig {
  
  @scala.inline
  def apply(): SchemaTenantProjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTenantProjectConfig]
  }
  
  @scala.inline
  implicit class SchemaTenantProjectConfigMutableBuilder[Self <: SchemaTenantProjectConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingConfig(value: SchemaBillingConfig): Self = StObject.set(x, "billingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingConfigUndefined: Self = StObject.set(x, "billingConfig", js.undefined)
    
    @scala.inline
    def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setServiceAccountConfig(value: SchemaServiceAccountConfig): Self = StObject.set(x, "serviceAccountConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountConfigUndefined: Self = StObject.set(x, "serviceAccountConfig", js.undefined)
    
    @scala.inline
    def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
    
    @scala.inline
    def setTenantProjectPolicy(value: SchemaTenantProjectPolicy): Self = StObject.set(x, "tenantProjectPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantProjectPolicyUndefined: Self = StObject.set(x, "tenantProjectPolicy", js.undefined)
  }
}
