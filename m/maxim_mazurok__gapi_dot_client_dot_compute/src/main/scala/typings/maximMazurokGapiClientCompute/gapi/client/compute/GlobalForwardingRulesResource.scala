package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.CallbackFieldsForwardingRule
import typings.maximMazurokGapiClientCompute.anon.CallbackFieldsKey
import typings.maximMazurokGapiClientCompute.anon.FieldsForwardingRuleKey
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.QuotaUserUploadType
import typings.maximMazurokGapiClientCompute.anon.RequestIdUploadType
import typings.maximMazurokGapiClientCompute.anon.UploadTypeUploadprotocol
import typings.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalForwardingRulesResource extends StObject {
  
  /** Deletes the specified GlobalForwardingRule resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: RequestIdUploadType): Request[Operation] = js.native
  
  /** Returns the specified GlobalForwardingRule resource. Gets a list of available forwarding rules by making a list() request. */
  def get(): Request[ForwardingRule] = js.native
  def get(request: QuotaUserUploadType): Request[ForwardingRule] = js.native
  
  /** Creates a GlobalForwardingRule resource in the specified project using the data included in the request. */
  def insert(request: CallbackFieldsKey): Request[Operation] = js.native
  def insert(request: Xgafv, body: ForwardingRule): Request[Operation] = js.native
  
  /** Retrieves a list of GlobalForwardingRule resources available to the specified project. */
  def list(): Request[ForwardingRuleList] = js.native
  def list(request: MaxResults): Request[ForwardingRuleList] = js.native
  
  /**
    * Updates the specified forwarding rule with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules.
    * Currently, you can only patch the network_tier field.
    */
  def patch(request: CallbackFieldsForwardingRule): Request[Operation] = js.native
  def patch(request: RequestIdUploadType, body: ForwardingRule): Request[Operation] = js.native
  
  /** Sets the labels on the specified resource. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: UploadTypeUploadprotocol, body: GlobalSetLabelsRequest): Request[Operation] = js.native
  
  /** Changes target URL for the GlobalForwardingRule resource. The new target should be of the same type as the old target. */
  def setTarget(request: FieldsForwardingRuleKey): Request[Operation] = js.native
  def setTarget(request: RequestIdUploadType, body: TargetReference): Request[Operation] = js.native
}
