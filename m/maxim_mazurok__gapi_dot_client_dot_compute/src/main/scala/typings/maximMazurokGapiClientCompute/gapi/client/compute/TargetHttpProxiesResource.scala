package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Accesstoken
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.QuotaUserTargetHttpProxy
import typings.maximMazurokGapiClientCompute.anon.RequestIdResourceTargetHttpProxy
import typings.maximMazurokGapiClientCompute.anon.RequestIdResourceUploadTypeUploadprotocolUserIpXgafv
import typings.maximMazurokGapiClientCompute.anon.RequestIdTargetHttpProxy
import typings.maximMazurokGapiClientCompute.anon.TargetHttpProxyUploadType
import typings.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHttpProxiesResource extends StObject {
  
  /** Retrieves the list of all TargetHttpProxy resources, regional and global, available to the specified project. */
  def aggregatedList(): Request[TargetHttpProxyAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[TargetHttpProxyAggregatedList] = js.native
  
  /** Deletes the specified TargetHttpProxy resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: RequestIdTargetHttpProxy): Request[Operation] = js.native
  
  /** Returns the specified TargetHttpProxy resource. Gets a list of available target HTTP proxies by making a list() request. */
  def get(): Request[TargetHttpProxy] = js.native
  def get(request: QuotaUserTargetHttpProxy): Request[TargetHttpProxy] = js.native
  
  /** Creates a TargetHttpProxy resource in the specified project using the data included in the request. */
  def insert(request: RequestIdResourceUploadTypeUploadprotocolUserIpXgafv): Request[Operation] = js.native
  def insert(request: Xgafv, body: TargetHttpProxy): Request[Operation] = js.native
  
  /** Retrieves the list of TargetHttpProxy resources available to the specified project. */
  def list(): Request[TargetHttpProxyList] = js.native
  def list(request: MaxResults): Request[TargetHttpProxyList] = js.native
  
  def patch(request: RequestIdTargetHttpProxy, body: TargetHttpProxy): Request[Operation] = js.native
  /** Patches the specified TargetHttpProxy resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and processing rules. */
  def patch(request: TargetHttpProxyUploadType): Request[Operation] = js.native
  
  /** Changes the URL map for TargetHttpProxy. */
  def setUrlMap(request: RequestIdResourceTargetHttpProxy): Request[Operation] = js.native
  def setUrlMap(request: RequestIdTargetHttpProxy, body: UrlMapReference): Request[Operation] = js.native
}
