package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Accesstoken
import typings.maximMazurokGapiClientCompute.anon.FieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegion
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.Oauthtoken
import typings.maximMazurokGapiClientCompute.anon.UserIpVpnTunnel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnTunnelsResource extends StObject {
  
  /** Retrieves an aggregated list of VPN tunnels. */
  def aggregatedList(): Request[VpnTunnelAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[VpnTunnelAggregatedList] = js.native
  
  /** Deletes the specified VpnTunnel resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.VpnTunnel): Request[Operation] = js.native
  
  /** Returns the specified VpnTunnel resource. Gets a list of available VPN tunnels by making a list() request. */
  def get(): Request[VpnTunnel] = js.native
  def get(request: UserIpVpnTunnel): Request[VpnTunnel] = js.native
  
  /** Creates a VpnTunnel resource in the specified project and region using the data included in the request. */
  def insert(request: FieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegion): Request[Operation] = js.native
  def insert(request: Oauthtoken, body: VpnTunnel): Request[Operation] = js.native
  
  /** Retrieves a list of VpnTunnel resources contained in the specified project and region. */
  def list(): Request[VpnTunnelList] = js.native
  def list(request: Filter): Request[VpnTunnelList] = js.native
}
