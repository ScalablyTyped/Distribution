package typings.maximMazurokGapiClientBillingbudgets.gapi.client.billingbudgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudBillingBudgetsV1BudgetAmount extends js.Object {
  
  /** Use the last period's actual spend as the budget for the present period. */
  var lastPeriodAmount: js.UndefOr[js.Any] = js.native
  
  /** A specified amount to use as the budget. `currency_code` is optional. If specified, it must match the currency of the billing account. The `currency_code` is provided on output. */
  var specifiedAmount: js.UndefOr[GoogleTypeMoney] = js.native
}
object GoogleCloudBillingBudgetsV1BudgetAmount {
  
  @scala.inline
  def apply(): GoogleCloudBillingBudgetsV1BudgetAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudBillingBudgetsV1BudgetAmount]
  }
  
  @scala.inline
  implicit class GoogleCloudBillingBudgetsV1BudgetAmountOps[Self <: GoogleCloudBillingBudgetsV1BudgetAmount] (val x: Self) extends AnyVal {
    
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
    def setLastPeriodAmount(value: js.Any): Self = this.set("lastPeriodAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastPeriodAmount: Self = this.set("lastPeriodAmount", js.undefined)
    
    @scala.inline
    def setSpecifiedAmount(value: GoogleTypeMoney): Self = this.set("specifiedAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecifiedAmount: Self = this.set("specifiedAmount", js.undefined)
  }
}
