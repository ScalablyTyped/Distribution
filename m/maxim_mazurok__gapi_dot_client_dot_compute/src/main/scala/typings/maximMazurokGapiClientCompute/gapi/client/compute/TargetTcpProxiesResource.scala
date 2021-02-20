package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.FieldsKey
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.QuotaUserTargetTcpProxy
import typings.maximMazurokGapiClientCompute.anon.RequestIdResourceTargetTcpProxy
import typings.maximMazurokGapiClientCompute.anon.ResourceTargetTcpProxy
import typings.maximMazurokGapiClientCompute.anon.TargetTcpProxyUserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetTcpProxiesResource extends StObject {
  
  /** Deletes the specified TargetTcpProxy resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.TargetTcpProxy): Request[Operation] = js.native
  
  /** Returns the specified TargetTcpProxy resource. Gets a list of available target TCP proxies by making a list() request. */
  def get(): Request[TargetTcpProxy] = js.native
  def get(request: QuotaUserTargetTcpProxy): Request[TargetTcpProxy] = js.native
  
  def insert(request: FieldsKey, body: TargetTcpProxy): Request[Operation] = js.native
  /** Creates a TargetTcpProxy resource in the specified project using the data included in the request. */
  def insert(request: ResourceTargetTcpProxy): Request[Operation] = js.native
  
  /** Retrieves the list of TargetTcpProxy resources available to the specified project. */
  def list(): Request[TargetTcpProxyList] = js.native
  def list(request: MaxResults): Request[TargetTcpProxyList] = js.native
  
  /** Changes the BackendService for TargetTcpProxy. */
  def setBackendService(request: TargetTcpProxyUserIp): Request[Operation] = js.native
  def setBackendService(
    request: typings.maximMazurokGapiClientCompute.anon.TargetTcpProxy,
    body: TargetTcpProxiesSetBackendServiceRequest
  ): Request[Operation] = js.native
  
  /** Changes the ProxyHeaderType for TargetTcpProxy. */
  def setProxyHeader(request: RequestIdResourceTargetTcpProxy): Request[Operation] = js.native
  def setProxyHeader(
    request: typings.maximMazurokGapiClientCompute.anon.TargetTcpProxy,
    body: TargetTcpProxiesSetProxyHeaderRequest
  ): Request[Operation] = js.native
}
