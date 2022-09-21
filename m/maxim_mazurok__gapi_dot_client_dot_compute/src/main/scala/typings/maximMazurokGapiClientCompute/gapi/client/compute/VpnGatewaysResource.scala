package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Accesstoken
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.Oauthtoken
import typings.maximMazurokGapiClientCompute.anon.QuotaUserRegionResource
import typings.maximMazurokGapiClientCompute.anon.RegionRequestId
import typings.maximMazurokGapiClientCompute.anon.RegionRequestIdResourceUploadTypeUploadprotocolUserIp
import typings.maximMazurokGapiClientCompute.anon.UserIpVpnGateway
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnGatewaysResource extends StObject {
  
  /** Retrieves an aggregated list of VPN gateways. */
  def aggregatedList(): Request[VpnGatewayAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[VpnGatewayAggregatedList] = js.native
  
  /** Deletes the specified VPN gateway. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.VpnGateway): Request[Operation] = js.native
  
  /** Returns the specified VPN gateway. Gets a list of available VPN gateways by making a list() request. */
  def get(): Request[VpnGateway] = js.native
  def get(request: UserIpVpnGateway): Request[VpnGateway] = js.native
  
  /** Returns the status for the specified VPN gateway. */
  def getStatus(): Request[VpnGatewaysGetStatusResponse] = js.native
  def getStatus(request: UserIpVpnGateway): Request[VpnGatewaysGetStatusResponse] = js.native
  
  def insert(request: Oauthtoken, body: VpnGateway): Request[Operation] = js.native
  /** Creates a VPN gateway in the specified project and region using the data included in the request. */
  def insert(request: RegionRequestIdResourceUploadTypeUploadprotocolUserIp): Request[Operation] = js.native
  
  /** Retrieves a list of VPN gateways available to the specified project and region. */
  def list(): Request[VpnGatewayList] = js.native
  def list(request: Filter): Request[VpnGatewayList] = js.native
  
  /** Sets the labels on a VpnGateway. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: RegionRequestId, body: RegionSetLabelsRequest): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: QuotaUserRegionResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
