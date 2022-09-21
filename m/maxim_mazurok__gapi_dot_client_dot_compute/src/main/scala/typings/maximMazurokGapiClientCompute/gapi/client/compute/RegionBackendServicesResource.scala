package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.AccesstokenAltBackendService
import typings.maximMazurokGapiClientCompute.anon.AccesstokenAltBackendServiceCallback
import typings.maximMazurokGapiClientCompute.anon.AltBackendServiceCallback
import typings.maximMazurokGapiClientCompute.anon.BackendServiceCallbackFields
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.Oauthtoken
import typings.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRegionRequestId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionBackendServicesResource extends StObject {
  
  /** Deletes the specified regional BackendService resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: AccesstokenAltBackendService): Request[Operation] = js.native
  
  /** Returns the specified regional BackendService resource. */
  def get(): Request[BackendService] = js.native
  def get(request: AltBackendServiceCallback): Request[BackendService] = js.native
  
  def getHealth(request: AltBackendServiceCallback, body: ResourceGroupReference): Request[BackendServiceGroupHealth] = js.native
  /** Gets the most recent health check results for this regional BackendService. */
  def getHealth(request: BackendServiceCallbackFields): Request[BackendServiceGroupHealth] = js.native
  
  def insert(request: Oauthtoken, body: BackendService): Request[Operation] = js.native
  /** Creates a regional BackendService resource in the specified project using the data included in the request. For more information, see Backend services overview. */
  def insert(request: ProjectQuotaUserRegionRequestId): Request[Operation] = js.native
  
  /** Retrieves the list of regional BackendService resources available to the specified project in the given region. */
  def list(): Request[BackendServiceList] = js.native
  def list(request: Filter): Request[BackendServiceList] = js.native
  
  /**
    * Updates the specified regional BackendService resource with the data included in the request. For more information, see Understanding backend services This method supports PATCH
    * semantics and uses the JSON merge patch format and processing rules.
    */
  def patch(request: AccesstokenAltBackendServiceCallback): Request[Operation] = js.native
  def patch(request: AccesstokenAltBackendService, body: BackendService): Request[Operation] = js.native
  
  /** Updates the specified regional BackendService resource with the data included in the request. For more information, see Backend services overview . */
  def update(request: AccesstokenAltBackendServiceCallback): Request[Operation] = js.native
  def update(request: AccesstokenAltBackendService, body: BackendService): Request[Operation] = js.native
}
