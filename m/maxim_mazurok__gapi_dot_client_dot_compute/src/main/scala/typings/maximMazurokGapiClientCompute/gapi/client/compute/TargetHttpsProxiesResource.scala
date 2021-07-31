package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdResourceUserIp
import typings.maximMazurokGapiClientCompute.anon.FieldsKey
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.QuotaUserRequestIdResourceTargetHttpsProxy
import typings.maximMazurokGapiClientCompute.anon.QuotaUserTargetHttpsProxy
import typings.maximMazurokGapiClientCompute.anon.RequestIdResourceTargetHttpsProxy
import typings.maximMazurokGapiClientCompute.anon.RequestIdResourceTargetHttpsProxyUserIp
import typings.maximMazurokGapiClientCompute.anon.RequestIdTargetHttpsProxy
import typings.maximMazurokGapiClientCompute.anon.ResourceTargetHttpsProxyUserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHttpsProxiesResource extends StObject {
  
  /** Retrieves the list of all TargetHttpsProxy resources, regional and global, available to the specified project. */
  def aggregatedList(): Request[TargetHttpsProxyAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[TargetHttpsProxyAggregatedList] = js.native
  
  /** Deletes the specified TargetHttpsProxy resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: RequestIdTargetHttpsProxy): Request[Operation] = js.native
  
  /** Returns the specified TargetHttpsProxy resource. Gets a list of available target HTTPS proxies by making a list() request. */
  def get(): Request[TargetHttpsProxy] = js.native
  def get(request: QuotaUserTargetHttpsProxy): Request[TargetHttpsProxy] = js.native
  
  /** Creates a TargetHttpsProxy resource in the specified project using the data included in the request. */
  def insert(request: AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdResourceUserIp): Request[Operation] = js.native
  def insert(request: FieldsKey, body: TargetHttpsProxy): Request[Operation] = js.native
  
  /** Retrieves the list of TargetHttpsProxy resources available to the specified project. */
  def list(): Request[TargetHttpsProxyList] = js.native
  def list(request: MaxResults): Request[TargetHttpsProxyList] = js.native
  
  /** Sets the QUIC override policy for TargetHttpsProxy. */
  def setQuicOverride(request: RequestIdResourceTargetHttpsProxy): Request[Operation] = js.native
  def setQuicOverride(request: RequestIdTargetHttpsProxy, body: TargetHttpsProxiesSetQuicOverrideRequest): Request[Operation] = js.native
  
  def setSslCertificates(request: RequestIdTargetHttpsProxy, body: TargetHttpsProxiesSetSslCertificatesRequest): Request[Operation] = js.native
  /** Replaces SslCertificates for TargetHttpsProxy. */
  def setSslCertificates(request: ResourceTargetHttpsProxyUserIp): Request[Operation] = js.native
  
  /**
    * Sets the SSL policy for TargetHttpsProxy. The SSL policy specifies the server-side support for SSL features. This affects connections between clients and the HTTPS proxy load
    * balancer. They do not affect the connection between the load balancer and the backends.
    */
  def setSslPolicy(request: QuotaUserRequestIdResourceTargetHttpsProxy): Request[Operation] = js.native
  def setSslPolicy(request: RequestIdTargetHttpsProxy, body: SslPolicyReference): Request[Operation] = js.native
  
  /** Changes the URL map for TargetHttpsProxy. */
  def setUrlMap(request: RequestIdResourceTargetHttpsProxyUserIp): Request[Operation] = js.native
  def setUrlMap(request: RequestIdTargetHttpsProxy, body: UrlMapReference): Request[Operation] = js.native
}
