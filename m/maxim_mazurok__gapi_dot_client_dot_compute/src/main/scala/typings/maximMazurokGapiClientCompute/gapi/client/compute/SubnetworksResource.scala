package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.AltDrainTimeoutSeconds
import typings.maximMazurokGapiClientCompute.anon.DrainTimeoutSeconds
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdResource
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.OptionsRequestedPolicyVersionPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.RegionResource
import typings.maximMazurokGapiClientCompute.anon.RegionSubnetwork
import typings.maximMazurokGapiClientCompute.anon.ResourceSubnetwork
import typings.maximMazurokGapiClientCompute.anon.SubnetworkUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetworksResource extends js.Object {
  
  /** Retrieves an aggregated list of subnetworks. */
  def aggregatedList(): Request[SubnetworkAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[SubnetworkAggregatedList] = js.native
  
  /** Deletes the specified subnetwork. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.Subnetwork): Request[Operation] = js.native
  
  /** Expands the IP CIDR range of the subnetwork to a specified value. */
  def expandIpCidrRange(request: ResourceSubnetwork): Request[Operation] = js.native
  def expandIpCidrRange(
    request: typings.maximMazurokGapiClientCompute.anon.Subnetwork,
    body: SubnetworksExpandIpCidrRangeRequest
  ): Request[Operation] = js.native
  
  /** Returns the specified subnetwork. Gets a list of available subnetworks list() request. */
  def get(): Request[Subnetwork] = js.native
  def get(request: RegionSubnetwork): Request[Subnetwork] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsRequestedPolicyVersionPrettyPrint): Request[Policy] = js.native
  
  /** Creates a subnetwork in the specified project using the data included in the request. */
  def insert(request: KeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdResource): Request[Operation] = js.native
  def insert(request: typings.maximMazurokGapiClientCompute.anon.Project, body: Subnetwork): Request[Operation] = js.native
  
  /** Retrieves a list of subnetworks available to the specified project. */
  def list(): Request[SubnetworkList] = js.native
  def list(request: Filter): Request[SubnetworkList] = js.native
  
  /** Retrieves an aggregated list of all usable subnetworks in the project. */
  def listUsable(): Request[UsableSubnetworksAggregatedList] = js.native
  def listUsable(request: MaxResults): Request[UsableSubnetworksAggregatedList] = js.native
  
  def patch(request: AltDrainTimeoutSeconds, body: Subnetwork): Request[Operation] = js.native
  /**
    * Patches the specified subnetwork with the data included in the request. Only certain fields can be updated with a patch request as indicated in the field descriptions. You must
    * specify the current fingerprint of the subnetwork resource being patched.
    */
  def patch(request: DrainTimeoutSeconds): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: RegionResource, body: RegionSetPolicyRequest): Request[Policy] = js.native
  
  /** Set whether VMs in this subnet can access Google services without assigning external IP addresses through Private Google Access. */
  def setPrivateIpGoogleAccess(request: SubnetworkUserIp): Request[Operation] = js.native
  def setPrivateIpGoogleAccess(
    request: typings.maximMazurokGapiClientCompute.anon.Subnetwork,
    body: SubnetworksSetPrivateIpGoogleAccessRequest
  ): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: RegionResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
