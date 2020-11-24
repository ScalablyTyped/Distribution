package typings.maximMazurokGapiClientBillingbudgets.gapi.client.billingbudgets

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudBillingBudgetsV1Filter extends js.Object {
  
  /**
    * Optional. If Filter.credit_types_treatment is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be subtracted from gross cost to determine the spend for threshold
    * calculations. If Filter.credit_types_treatment is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty. See [a list of acceptable credit type
    * values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type).
    */
  var creditTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`. */
  var creditTypesTreatment: js.UndefOr[String] = js.native
  
  /**
    * Optional. A single label and value pair specifying that usage from only this set of labeled resources should be included in the budget. Currently, multiple entries or multiple
    * values per entry are not allowed. If omitted, the report will include all labeled and unlabeled usage.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: std.Array<any>}
    */ typings.maximMazurokGapiClientBillingbudgets.maximMazurokGapiClientBillingbudgetsStrings.GoogleCloudBillingBudgetsV1Filter with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Optional. A set of projects of the form `projects/{project}`, specifying that usage from only this set of projects should be included in the budget. If omitted, the report will
    * include all usage for the billing account, regardless of which project the usage occurred on. Only zero or one project can be specified currently.
    */
  var projects: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. A set of services of the form `services/{service_id}`, specifying that usage from only this set of services should be included in the budget. If omitted, the report will
    * include usage for all the services. The service names are available through the Catalog API: https://cloud.google.com/billing/v1/how-tos/catalog-api.
    */
  var services: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. A set of subaccounts of the form `billingAccounts/{account_id}`, specifying that usage from only this set of subaccounts should be included in the budget. If a subaccount
    * is set to the name of the parent account, usage from the parent account will be included. If the field is omitted, the report will include usage from the parent account and all
    * subaccounts, if they exist.
    */
  var subaccounts: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudBillingBudgetsV1Filter {
  
  @scala.inline
  def apply(): GoogleCloudBillingBudgetsV1Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudBillingBudgetsV1Filter]
  }
  
  @scala.inline
  implicit class GoogleCloudBillingBudgetsV1FilterOps[Self <: GoogleCloudBillingBudgetsV1Filter] (val x: Self) extends AnyVal {
    
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
    def setCreditTypesVarargs(value: String*): Self = this.set("creditTypes", js.Array(value :_*))
    
    @scala.inline
    def setCreditTypes(value: js.Array[String]): Self = this.set("creditTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreditTypes: Self = this.set("creditTypes", js.undefined)
    
    @scala.inline
    def setCreditTypesTreatment(value: String): Self = this.set("creditTypesTreatment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreditTypesTreatment: Self = this.set("creditTypesTreatment", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: std.Array<any>}
      */ typings.maximMazurokGapiClientBillingbudgets.maximMazurokGapiClientBillingbudgetsStrings.GoogleCloudBillingBudgetsV1Filter with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setProjectsVarargs(value: String*): Self = this.set("projects", js.Array(value :_*))
    
    @scala.inline
    def setProjects(value: js.Array[String]): Self = this.set("projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjects: Self = this.set("projects", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: String*): Self = this.set("services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[String]): Self = this.set("services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
    
    @scala.inline
    def setSubaccountsVarargs(value: String*): Self = this.set("subaccounts", js.Array(value :_*))
    
    @scala.inline
    def setSubaccounts(value: js.Array[String]): Self = this.set("subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccounts: Self = this.set("subaccounts", js.undefined)
  }
}
