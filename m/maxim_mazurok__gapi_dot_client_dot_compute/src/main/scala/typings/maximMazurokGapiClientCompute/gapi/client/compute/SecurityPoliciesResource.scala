package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestId
import typings.maximMazurokGapiClientCompute.anon.FieldsKey
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.PrettyPrintPriority
import typings.maximMazurokGapiClientCompute.anon.Priority
import typings.maximMazurokGapiClientCompute.anon.QuotaUserSecurityPolicy
import typings.maximMazurokGapiClientCompute.anon.RequestIdSecurityPolicy
import typings.maximMazurokGapiClientCompute.anon.ResourceSecurityPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPoliciesResource extends StObject {
  
  def addRule(request: QuotaUserSecurityPolicy, body: SecurityPolicyRule): Request[Operation] = js.native
  /** Inserts a rule into a security policy. */
  def addRule(request: typings.maximMazurokGapiClientCompute.anon.SecurityPolicy): Request[Operation] = js.native
  
  /** Deletes the specified policy. */
  def delete(): Request[Operation] = js.native
  def delete(request: RequestIdSecurityPolicy): Request[Operation] = js.native
  
  /** List all of the ordered rules present in a single specified policy. */
  def get(): Request[SecurityPolicy] = js.native
  def get(request: QuotaUserSecurityPolicy): Request[SecurityPolicy] = js.native
  
  /** Gets a rule at the specified priority. */
  def getRule(): Request[SecurityPolicyRule] = js.native
  def getRule(request: Priority): Request[SecurityPolicyRule] = js.native
  
  /** Creates a new policy in the specified project using the data included in the request. */
  def insert(request: AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestId): Request[Operation] = js.native
  def insert(request: FieldsKey, body: SecurityPolicy): Request[Operation] = js.native
  
  /** List all the policies that have been configured for the specified project. */
  def list(): Request[SecurityPolicyList] = js.native
  def list(request: MaxResults): Request[SecurityPolicyList] = js.native
  
  /** Gets the current list of preconfigured Web Application Firewall (WAF) expressions. */
  def listPreconfiguredExpressionSets(): Request[SecurityPoliciesListPreconfiguredExpressionSetsResponse] = js.native
  def listPreconfiguredExpressionSets(request: MaxResults): Request[SecurityPoliciesListPreconfiguredExpressionSetsResponse] = js.native
  
  def patch(request: RequestIdSecurityPolicy, body: SecurityPolicy): Request[Operation] = js.native
  /** Patches the specified policy with the data included in the request. */
  def patch(request: ResourceSecurityPolicy): Request[Operation] = js.native
  
  /** Patches a rule at the specified priority. */
  def patchRule(request: PrettyPrintPriority): Request[Operation] = js.native
  def patchRule(request: Priority, body: SecurityPolicyRule): Request[Operation] = js.native
  
  /** Deletes a rule at the specified priority. */
  def removeRule(): Request[Operation] = js.native
  def removeRule(request: Priority): Request[Operation] = js.native
}
