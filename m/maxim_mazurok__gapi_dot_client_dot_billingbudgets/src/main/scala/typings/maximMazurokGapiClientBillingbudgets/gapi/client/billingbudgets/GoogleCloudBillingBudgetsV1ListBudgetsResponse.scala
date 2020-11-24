package typings.maximMazurokGapiClientBillingbudgets.gapi.client.billingbudgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudBillingBudgetsV1ListBudgetsResponse extends js.Object {
  
  /** List of the budgets owned by the requested billing account. */
  var budgets: js.UndefOr[js.Array[GoogleCloudBillingBudgetsV1Budget]] = js.native
  
  /** If not empty, indicates that there may be more budgets that match the request; this value should be passed in a new `ListBudgetsRequest`. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudBillingBudgetsV1ListBudgetsResponse {
  
  @scala.inline
  def apply(): GoogleCloudBillingBudgetsV1ListBudgetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudBillingBudgetsV1ListBudgetsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudBillingBudgetsV1ListBudgetsResponseOps[Self <: GoogleCloudBillingBudgetsV1ListBudgetsResponse] (val x: Self) extends AnyVal {
    
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
    def setBudgetsVarargs(value: GoogleCloudBillingBudgetsV1Budget*): Self = this.set("budgets", js.Array(value :_*))
    
    @scala.inline
    def setBudgets(value: js.Array[GoogleCloudBillingBudgetsV1Budget]): Self = this.set("budgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudgets: Self = this.set("budgets", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
