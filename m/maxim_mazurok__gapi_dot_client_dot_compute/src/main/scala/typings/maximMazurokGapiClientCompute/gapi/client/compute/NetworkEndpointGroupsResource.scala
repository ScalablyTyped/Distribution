package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Accesstoken
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.CallbackFieldsKeyNetworkEndpointGroup
import typings.maximMazurokGapiClientCompute.anon.FilterKey
import typings.maximMazurokGapiClientCompute.anon.KeyMaxResults
import typings.maximMazurokGapiClientCompute.anon.KeyNetworkEndpointGroupOauthtoken
import typings.maximMazurokGapiClientCompute.anon.NetworkEndpointGroupOauthtokenPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.ProjectQuotaUserUploadType
import typings.maximMazurokGapiClientCompute.anon.QuotaUser
import typings.maximMazurokGapiClientCompute.anon.QuotaUserResource
import typings.maximMazurokGapiClientCompute.anon.UploadprotocolUserIpXgafvZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkEndpointGroupsResource extends StObject {
  
  /** Retrieves the list of network endpoint groups and sorts them by zone. */
  def aggregatedList(): Request[NetworkEndpointGroupAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[NetworkEndpointGroupAggregatedList] = js.native
  
  /** Attach a list of network endpoints to the specified network endpoint group. */
  def attachNetworkEndpoints(request: KeyNetworkEndpointGroupOauthtoken): Request[Operation] = js.native
  def attachNetworkEndpoints(
    request: NetworkEndpointGroupOauthtokenPrettyPrint,
    body: NetworkEndpointGroupsAttachEndpointsRequest
  ): Request[Operation] = js.native
  
  /**
    * Deletes the specified network endpoint group. The network endpoints in the NEG and the VM instances they belong to are not terminated when the NEG is deleted. Note that the NEG
    * cannot be deleted if there are backend services referencing it.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: NetworkEndpointGroupOauthtokenPrettyPrint): Request[Operation] = js.native
  
  /** Detach a list of network endpoints from the specified network endpoint group. */
  def detachNetworkEndpoints(request: CallbackFieldsKeyNetworkEndpointGroup): Request[Operation] = js.native
  def detachNetworkEndpoints(
    request: NetworkEndpointGroupOauthtokenPrettyPrint,
    body: NetworkEndpointGroupsDetachEndpointsRequest
  ): Request[Operation] = js.native
  
  /** Returns the specified network endpoint group. Gets a list of available network endpoint groups by making a list() request. */
  def get(): Request[NetworkEndpointGroup] = js.native
  def get(request: ProjectQuotaUserUploadType): Request[NetworkEndpointGroup] = js.native
  
  def insert(request: QuotaUser, body: NetworkEndpointGroup): Request[Operation] = js.native
  /** Creates a network endpoint group in the specified project using the parameters that are included in the request. */
  def insert(request: UploadprotocolUserIpXgafvZone): Request[Operation] = js.native
  
  /** Retrieves the list of network endpoint groups that are located in the specified project and zone. */
  def list(): Request[NetworkEndpointGroupList] = js.native
  def list(request: Alt): Request[NetworkEndpointGroupList] = js.native
  
  /** Lists the network endpoints in the specified network endpoint group. */
  def listNetworkEndpoints(request: FilterKey): Request[NetworkEndpointGroupsListNetworkEndpoints] = js.native
  def listNetworkEndpoints(request: KeyMaxResults, body: NetworkEndpointGroupsListEndpointsRequest): Request[NetworkEndpointGroupsListNetworkEndpoints] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: QuotaUserResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
