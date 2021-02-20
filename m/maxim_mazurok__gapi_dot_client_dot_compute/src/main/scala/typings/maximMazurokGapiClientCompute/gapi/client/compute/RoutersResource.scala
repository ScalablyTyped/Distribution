package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.FieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.PageTokenPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.RegionRouter
import typings.maximMazurokGapiClientCompute.anon.ResourceRouter
import typings.maximMazurokGapiClientCompute.anon.RouterUserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutersResource extends StObject {
  
  /** Retrieves an aggregated list of routers. */
  def aggregatedList(): Request[RouterAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[RouterAggregatedList] = js.native
  
  /** Deletes the specified Router resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.Router): Request[Operation] = js.native
  
  /** Returns the specified Router resource. Gets a list of available routers by making a list() request. */
  def get(): Request[Router] = js.native
  def get(request: RegionRouter): Request[Router] = js.native
  
  /** Retrieves runtime Nat mapping information of VM endpoints. */
  def getNatMappingInfo(): Request[VmEndpointNatMappingsList] = js.native
  def getNatMappingInfo(request: PageTokenPrettyPrint): Request[VmEndpointNatMappingsList] = js.native
  
  /** Retrieves runtime information of the specified router. */
  def getRouterStatus(): Request[RouterStatusResponse] = js.native
  def getRouterStatus(request: RegionRouter): Request[RouterStatusResponse] = js.native
  
  /** Creates a Router resource in the specified project and region using the data included in the request. */
  def insert(request: FieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId): Request[Operation] = js.native
  def insert(request: typings.maximMazurokGapiClientCompute.anon.Project, body: Router): Request[Operation] = js.native
  
  /** Retrieves a list of Router resources available to the specified project. */
  def list(): Request[RouterList] = js.native
  def list(request: Filter): Request[RouterList] = js.native
  
  /** Patches the specified Router resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and processing rules. */
  def patch(request: ResourceRouter): Request[Operation] = js.native
  def patch(request: typings.maximMazurokGapiClientCompute.anon.Router, body: Router): Request[Operation] = js.native
  
  def preview(request: RegionRouter, body: Router): Request[RoutersPreviewResponse] = js.native
  /** Preview fields auto-generated during router create and update operations. Calling this method does NOT create or update the router. */
  def preview(request: RouterUserIp): Request[RoutersPreviewResponse] = js.native
  
  /**
    * Updates the specified Router resource with the data included in the request. This method conforms to PUT semantics, which requests that the state of the target resource be created
    * or replaced with the state defined by the representation enclosed in the request message payload.
    */
  def update(request: ResourceRouter): Request[Operation] = js.native
  def update(request: typings.maximMazurokGapiClientCompute.anon.Router, body: Router): Request[Operation] = js.native
}
