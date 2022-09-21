package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typings.maximMazurokGapiClientContent.anon.CallbackFieldsKeyMerchantIdOauthtoken
import typings.maximMazurokGapiClientContent.anon.ResourceReturnPolicyId
import typings.maximMazurokGapiClientContent.anon.ReturnPolicyId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnpolicyonlineResource extends StObject {
  
  def create(request: AccesstokenAlt, body: ReturnPolicyOnline): Request[ReturnPolicyOnline] = js.native
  /** Creates a new return policy. */
  def create(request: CallbackFieldsKeyMerchantIdOauthtoken): Request[ReturnPolicyOnline] = js.native
  
  /** Deletes an existing return policy. */
  def delete(): Request[Unit] = js.native
  def delete(request: ReturnPolicyId): Request[Unit] = js.native
  
  /** Gets an existing return policy. */
  def get(): Request[ReturnPolicyOnline] = js.native
  def get(request: ReturnPolicyId): Request[ReturnPolicyOnline] = js.native
  
  /** Lists all existing return policies. */
  def list(): Request[ListReturnPolicyOnlineResponse] = js.native
  def list(request: AccesstokenAlt): Request[ListReturnPolicyOnlineResponse] = js.native
  
  /** Updates an existing return policy. */
  def patch(request: ResourceReturnPolicyId): Request[ReturnPolicyOnline] = js.native
  def patch(request: ReturnPolicyId, body: ReturnPolicyOnline): Request[ReturnPolicyOnline] = js.native
}
