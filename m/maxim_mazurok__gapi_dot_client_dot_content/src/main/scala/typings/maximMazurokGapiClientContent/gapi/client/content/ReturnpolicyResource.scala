package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.FieldsKeyMerchantIdOauthtoken
import typings.maximMazurokGapiClientContent.anon.Key
import typings.maximMazurokGapiClientContent.anon.KeyOauthtokenPrettyPrintQuotaUser
import typings.maximMazurokGapiClientContent.anon.ReturnPolicyId
import typings.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnpolicyResource extends StObject {
  
  /** Batches multiple return policy related calls in a single request. */
  def custombatch(request: KeyOauthtokenPrettyPrintQuotaUser): Request[ReturnpolicyCustomBatchResponse] = js.native
  def custombatch(request: Key, body: ReturnpolicyCustomBatchRequest): Request[ReturnpolicyCustomBatchResponse] = js.native
  
  /** Deletes a return policy for the given Merchant Center account. */
  def delete(): Request[Unit] = js.native
  def delete(request: ReturnPolicyId): Request[Unit] = js.native
  
  /** Gets a return policy of the Merchant Center account. */
  def get(): Request[ReturnPolicy] = js.native
  def get(request: ReturnPolicyId): Request[ReturnPolicy] = js.native
  
  /** Inserts a return policy for the Merchant Center account. */
  def insert(request: FieldsKeyMerchantIdOauthtoken): Request[ReturnPolicy] = js.native
  def insert(request: UploadType, body: ReturnPolicy): Request[ReturnPolicy] = js.native
  
  /** Lists the return policies of the Merchant Center account. */
  def list(): Request[ReturnpolicyListResponse] = js.native
  def list(request: UploadType): Request[ReturnpolicyListResponse] = js.native
}
