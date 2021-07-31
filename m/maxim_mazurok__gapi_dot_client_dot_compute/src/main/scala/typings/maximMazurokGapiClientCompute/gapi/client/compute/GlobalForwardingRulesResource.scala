package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.AltFieldsForwardingRule
import typings.maximMazurokGapiClientCompute.anon.FieldsForwardingRuleKey
import typings.maximMazurokGapiClientCompute.anon.FieldsKey
import typings.maximMazurokGapiClientCompute.anon.ForwardingRuleKeyOauthtoken
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRequestId
import typings.maximMazurokGapiClientCompute.anon.RequestIdUserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalForwardingRulesResource extends StObject {
  
  /** Deletes the specified GlobalForwardingRule resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: RequestIdUserIp): Request[Operation] = js.native
  
  /** Returns the specified GlobalForwardingRule resource. Gets a list of available forwarding rules by making a list() request. */
  def get(): Request[ForwardingRule] = js.native
  def get(request: AltFieldsForwardingRule): Request[ForwardingRule] = js.native
  
  def insert(request: FieldsKey, body: ForwardingRule): Request[Operation] = js.native
  /** Creates a GlobalForwardingRule resource in the specified project using the data included in the request. */
  def insert(request: ProjectQuotaUserRequestId): Request[Operation] = js.native
  
  /** Retrieves a list of GlobalForwardingRule resources available to the specified project. */
  def list(): Request[ForwardingRuleList] = js.native
  def list(request: MaxResults): Request[ForwardingRuleList] = js.native
  
  /**
    * Updates the specified forwarding rule with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules.
    * Currently, you can only patch the network_tier field.
    */
  def patch(request: FieldsForwardingRuleKey): Request[Operation] = js.native
  def patch(request: RequestIdUserIp, body: ForwardingRule): Request[Operation] = js.native
  
  /** Changes target URL for the GlobalForwardingRule resource. The new target should be of the same type as the old target. */
  def setTarget(request: ForwardingRuleKeyOauthtoken): Request[Operation] = js.native
  def setTarget(request: RequestIdUserIp, body: TargetReference): Request[Operation] = js.native
}
