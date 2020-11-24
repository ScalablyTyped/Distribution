package typings.maximMazurokGapiClientBillingbudgets.gapi.client.billingbudgets

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBillingbudgets.anon.Accesstoken
import typings.maximMazurokGapiClientBillingbudgets.anon.Alt
import typings.maximMazurokGapiClientBillingbudgets.anon.Callback
import typings.maximMazurokGapiClientBillingbudgets.anon.Fields
import typings.maximMazurokGapiClientBillingbudgets.anon.Key
import typings.maximMazurokGapiClientBillingbudgets.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BudgetsResource extends js.Object {
  
  /** Creates a new budget. See [Quotas and limits](https://cloud.google.com/billing/quotas) for more information on the limits of the number of budgets you can create. */
  def create(request: Accesstoken): Request[GoogleCloudBillingBudgetsV1Budget] = js.native
  def create(request: Alt, body: GoogleCloudBillingBudgetsV1Budget): Request[GoogleCloudBillingBudgetsV1Budget] = js.native
  
  /** Deletes a budget. Returns successfully if already deleted. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /**
    * Returns a budget. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. When reading from the API, you will not see these fields in
    * the return value, though they may have been set in the Cloud Console.
    */
  def get(): Request[GoogleCloudBillingBudgetsV1Budget] = js.native
  def get(request: Callback): Request[GoogleCloudBillingBudgetsV1Budget] = js.native
  
  /**
    * Returns a list of budgets for a billing account. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. When reading from the API, you
    * will not see these fields in the return value, though they may have been set in the Cloud Console.
    */
  def list(): Request[GoogleCloudBillingBudgetsV1ListBudgetsResponse] = js.native
  def list(request: Fields): Request[GoogleCloudBillingBudgetsV1ListBudgetsResponse] = js.native
  
  /**
    * Updates a budget and returns the updated budget. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. Budget fields that are not
    * exposed in this API will not be changed by this method.
    */
  def patch(request: Key): Request[GoogleCloudBillingBudgetsV1Budget] = js.native
  def patch(request: Name, body: GoogleCloudBillingBudgetsV1Budget): Request[GoogleCloudBillingBudgetsV1Budget] = js.native
}
