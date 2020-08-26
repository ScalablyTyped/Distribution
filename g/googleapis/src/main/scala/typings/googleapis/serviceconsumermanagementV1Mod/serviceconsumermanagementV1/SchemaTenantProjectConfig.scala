package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure defines a tenant project to be added to the specified
  * tenancy unit and its initial configuration and properties. A project lien
  * is created for the tenant project to prevent the tenant project from being
  * deleted accidentally. The lien is deleted as part of tenant project
  * removal.
  */
@js.native
trait SchemaTenantProjectConfig extends js.Object {
  /**
    * Billing account properties. The billing account must be specified.
    */
  var billingConfig: js.UndefOr[SchemaBillingConfig] = js.native
  /**
    * Folder where project in this tenancy unit must be located This folder
    * must have been previously created with the required permissions for the
    * caller to create and configure a project in it. Valid folder resource
    * names have the format `folders/{folder_number}` (for example,
    * `folders/123456`).
    */
  var folder: js.UndefOr[String] = js.native
  /**
    * Labels that are applied to this project.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Configuration for the IAM service account on the tenant project.
    */
  var serviceAccountConfig: js.UndefOr[SchemaServiceAccountConfig] = js.native
  /**
    * Google Cloud API names of services that are activated on this project
    * during provisioning.  If any of these services can&#39;t be activated,
    * the request fails. For example:
    * &#39;compute.googleapis.com&#39;,&#39;cloudfunctions.googleapis.com&#39;
    */
  var services: js.UndefOr[js.Array[String]] = js.native
  /**
    * Describes ownership and policies for the new tenant project. Required.
    */
  var tenantProjectPolicy: js.UndefOr[SchemaTenantProjectPolicy] = js.native
}

object SchemaTenantProjectConfig {
  @scala.inline
  def apply(): SchemaTenantProjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTenantProjectConfig]
  }
  @scala.inline
  implicit class SchemaTenantProjectConfigOps[Self <: SchemaTenantProjectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBillingConfig(value: SchemaBillingConfig): Self = this.set("billingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingConfig: Self = this.set("billingConfig", js.undefined)
    @scala.inline
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setServiceAccountConfig(value: SchemaServiceAccountConfig): Self = this.set("serviceAccountConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccountConfig: Self = this.set("serviceAccountConfig", js.undefined)
    @scala.inline
    def setServicesVarargs(value: String*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[String]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
    @scala.inline
    def setTenantProjectPolicy(value: SchemaTenantProjectPolicy): Self = this.set("tenantProjectPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenantProjectPolicy: Self = this.set("tenantProjectPolicy", js.undefined)
  }
  
}

