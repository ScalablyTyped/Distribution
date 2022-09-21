package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhooksApi extends StObject {
  
  /**
    * Add webhook
    *
    * Add a new webhook.
    */
  def add(body: WebhooksAddRequest): js.Promise[WebhookResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Delete webhook
    *
    * Delete an existing webhook.
    */
  def delete(body: WebhooksFindByIdRequest): js.Promise[WebhookResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Get webhook info
    *
    * Given the ID of an existing webhook, return the data about it.
    */
  def info(body: WebhooksFindByIdRequest): js.Promise[WebhookResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List webhooks
    *
    * Get the list of all webhooks defined on the account.
    */
  def list(): js.Promise[js.Array[WebhookResponse] | (AxiosError[Any, Any])] = js.native
  def list(body: WebhooksListRequest): js.Promise[js.Array[WebhookResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Update webhook
    *
    * Update an existing webhook.
    */
  def update(body: WebhooksUpdateRequest): js.Promise[WebhookResponse | (AxiosError[Any, Any])] = js.native
}
