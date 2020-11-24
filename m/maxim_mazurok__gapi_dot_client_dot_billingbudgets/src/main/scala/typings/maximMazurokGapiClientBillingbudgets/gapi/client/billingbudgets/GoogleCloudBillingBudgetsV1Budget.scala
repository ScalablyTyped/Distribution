package typings.maximMazurokGapiClientBillingbudgets.gapi.client.billingbudgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudBillingBudgetsV1Budget extends js.Object {
  
  /** Required. Budgeted amount. */
  var amount: js.UndefOr[GoogleCloudBillingBudgetsV1BudgetAmount] = js.native
  
  /** Optional. Filters that define which resources are used to compute the actual spend against the budget. */
  var budgetFilter: js.UndefOr[GoogleCloudBillingBudgetsV1Filter] = js.native
  
  /** User data for display name in UI. The name must be less than or equal to 60 characters. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An empty etag will cause an update to overwrite other changes. */
  var etag: js.UndefOr[String] = js.native
  
  /** Output only. Resource name of the budget. The resource name implies the scope of a budget. Values are of the form `billingAccounts/{billingAccountId}/budgets/{budgetId}`. */
  var name: js.UndefOr[String] = js.native
  
  /** Optional. Rules to apply to notifications sent based on budget spend and thresholds. */
  var notificationsRule: js.UndefOr[GoogleCloudBillingBudgetsV1NotificationsRule] = js.native
  
  /** Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. */
  var thresholdRules: js.UndefOr[js.Array[GoogleCloudBillingBudgetsV1ThresholdRule]] = js.native
}
object GoogleCloudBillingBudgetsV1Budget {
  
  @scala.inline
  def apply(): GoogleCloudBillingBudgetsV1Budget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudBillingBudgetsV1Budget]
  }
  
  @scala.inline
  implicit class GoogleCloudBillingBudgetsV1BudgetOps[Self <: GoogleCloudBillingBudgetsV1Budget] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: GoogleCloudBillingBudgetsV1BudgetAmount): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setBudgetFilter(value: GoogleCloudBillingBudgetsV1Filter): Self = this.set("budgetFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudgetFilter: Self = this.set("budgetFilter", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotificationsRule(value: GoogleCloudBillingBudgetsV1NotificationsRule): Self = this.set("notificationsRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationsRule: Self = this.set("notificationsRule", js.undefined)
    
    @scala.inline
    def setThresholdRulesVarargs(value: GoogleCloudBillingBudgetsV1ThresholdRule*): Self = this.set("thresholdRules", js.Array(value :_*))
    
    @scala.inline
    def setThresholdRules(value: js.Array[GoogleCloudBillingBudgetsV1ThresholdRule]): Self = this.set("thresholdRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholdRules: Self = this.set("thresholdRules", js.undefined)
  }
}
