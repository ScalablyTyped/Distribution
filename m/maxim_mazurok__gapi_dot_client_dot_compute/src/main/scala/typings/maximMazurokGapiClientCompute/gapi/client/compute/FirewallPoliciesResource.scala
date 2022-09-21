package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.FieldsFirewallPolicy
import typings.maximMazurokGapiClientCompute.anon.FirewallPolicyKey
import typings.maximMazurokGapiClientCompute.anon.Name
import typings.maximMazurokGapiClientCompute.anon.NameOauthtoken
import typings.maximMazurokGapiClientCompute.anon.OauthtokenOptionsRequestedPolicyVersion
import typings.maximMazurokGapiClientCompute.anon.OauthtokenParentId
import typings.maximMazurokGapiClientCompute.anon.OrderBy
import typings.maximMazurokGapiClientCompute.anon.ParentId
import typings.maximMazurokGapiClientCompute.anon.ParentIdPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.PrettyPrintPriority
import typings.maximMazurokGapiClientCompute.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientCompute.anon.Priority
import typings.maximMazurokGapiClientCompute.anon.PriorityQuotaUser
import typings.maximMazurokGapiClientCompute.anon.ReplaceExistingAssociation
import typings.maximMazurokGapiClientCompute.anon.SourceFirewallPolicy
import typings.maximMazurokGapiClientCompute.anon.TargetResource
import typings.maximMazurokGapiClientCompute.anon.UploadprotocolUserIp
import typings.maximMazurokGapiClientCompute.anon.UserIpXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPoliciesResource extends StObject {
  
  /** Inserts an association for the specified firewall policy. */
  def addAssociation(request: typings.maximMazurokGapiClientCompute.anon.FirewallPolicy): Request[Operation] = js.native
  def addAssociation(request: ReplaceExistingAssociation, body: FirewallPolicyAssociation): Request[Operation] = js.native
  
  /** Inserts a rule into a firewall policy. */
  def addRule(request: FieldsFirewallPolicy): Request[Operation] = js.native
  def addRule(request: FirewallPolicyKey, body: FirewallPolicyRule): Request[Operation] = js.native
  
  /** Copies rules to the specified firewall policy. */
  def cloneRules(): Request[Operation] = js.native
  def cloneRules(request: SourceFirewallPolicy): Request[Operation] = js.native
  
  /** Deletes the specified policy. */
  def delete(): Request[Operation] = js.native
  def delete(request: FirewallPolicyKey): Request[Operation] = js.native
  
  /** Returns the specified firewall policy. */
  def get(): Request[FirewallPolicy] = js.native
  def get(request: PrettyPrintQuotaUser): Request[FirewallPolicy] = js.native
  
  /** Gets an association with the specified name. */
  def getAssociation(): Request[FirewallPolicyAssociation] = js.native
  def getAssociation(request: Name): Request[FirewallPolicyAssociation] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OauthtokenOptionsRequestedPolicyVersion): Request[Policy] = js.native
  
  /** Gets a rule of the specified priority. */
  def getRule(): Request[FirewallPolicyRule] = js.native
  def getRule(request: Priority): Request[FirewallPolicyRule] = js.native
  
  def insert(request: OauthtokenParentId, body: FirewallPolicy): Request[Operation] = js.native
  /** Creates a new policy in the specified project using the data included in the request. */
  def insert(request: ParentId): Request[Operation] = js.native
  
  /** Lists all the policies that have been configured for the specified folder or organization. */
  def list(): Request[FirewallPolicyList] = js.native
  def list(request: OrderBy): Request[FirewallPolicyList] = js.native
  
  /** Lists associations of a specified target, i.e., organization or folder. */
  def listAssociations(): Request[FirewallPoliciesListAssociationsResponse] = js.native
  def listAssociations(request: TargetResource): Request[FirewallPoliciesListAssociationsResponse] = js.native
  
  /** Moves the specified firewall policy. */
  def move(): Request[Operation] = js.native
  def move(request: ParentIdPrettyPrint): Request[Operation] = js.native
  
  def patch(request: FirewallPolicyKey, body: FirewallPolicy): Request[Operation] = js.native
  /** Patches the specified policy with the data included in the request. */
  def patch(request: UploadprotocolUserIp): Request[Operation] = js.native
  
  /** Patches a rule of the specified priority. */
  def patchRule(request: PrettyPrintPriority): Request[Operation] = js.native
  def patchRule(request: PriorityQuotaUser, body: FirewallPolicyRule): Request[Operation] = js.native
  
  /** Removes an association for the specified firewall policy. */
  def removeAssociation(): Request[Operation] = js.native
  def removeAssociation(request: NameOauthtoken): Request[Operation] = js.native
  
  /** Deletes a rule of the specified priority. */
  def removeRule(): Request[Operation] = js.native
  def removeRule(request: PriorityQuotaUser): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: UserIpXgafv, body: GlobalOrganizationSetPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: UserIpXgafv, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
