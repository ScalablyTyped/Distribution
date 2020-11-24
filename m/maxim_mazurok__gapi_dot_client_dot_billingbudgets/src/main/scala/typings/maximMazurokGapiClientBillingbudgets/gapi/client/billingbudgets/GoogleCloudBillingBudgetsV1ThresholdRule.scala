package typings.maximMazurokGapiClientBillingbudgets.gapi.client.billingbudgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudBillingBudgetsV1ThresholdRule extends js.Object {
  
  /** Optional. The type of basis used to determine if spend has passed the threshold. Behavior defaults to CURRENT_SPEND if not set. */
  var spendBasis: js.UndefOr[String] = js.native
  
  /** Required. Send an alert when this threshold is exceeded. This is a 1.0-based percentage, so 0.5 = 50%. Validation: non-negative number. */
  var thresholdPercent: js.UndefOr[Double] = js.native
}
object GoogleCloudBillingBudgetsV1ThresholdRule {
  
  @scala.inline
  def apply(): GoogleCloudBillingBudgetsV1ThresholdRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudBillingBudgetsV1ThresholdRule]
  }
  
  @scala.inline
  implicit class GoogleCloudBillingBudgetsV1ThresholdRuleOps[Self <: GoogleCloudBillingBudgetsV1ThresholdRule] (val x: Self) extends AnyVal {
    
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
    def setSpendBasis(value: String): Self = this.set("spendBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpendBasis: Self = this.set("spendBasis", js.undefined)
    
    @scala.inline
    def setThresholdPercent(value: Double): Self = this.set("thresholdPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholdPercent: Self = this.set("thresholdPercent", js.undefined)
  }
}
