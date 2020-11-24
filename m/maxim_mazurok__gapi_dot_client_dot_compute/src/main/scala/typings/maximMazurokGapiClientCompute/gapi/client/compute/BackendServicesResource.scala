package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.AltBackendService
import typings.maximMazurokGapiClientCompute.anon.BackendServiceFields
import typings.maximMazurokGapiClientCompute.anon.FieldsKey
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.PrettyPrintProject
import typings.maximMazurokGapiClientCompute.anon.ProjectQuotaUser
import typings.maximMazurokGapiClientCompute.anon.QuotaUserRequestId
import typings.maximMazurokGapiClientCompute.anon.RequestIdResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendServicesResource extends js.Object {
  
  def addSignedUrlKey(request: AltBackendService, body: SignedUrlKey): Request[Operation] = js.native
  /** Adds a key for validating requests with signed URLs for this backend service. */
  def addSignedUrlKey(request: typings.maximMazurokGapiClientCompute.anon.BackendService): Request[Operation] = js.native
  
  /** Retrieves the list of all BackendService resources, regional and global, available to the specified project. */
  def aggregatedList(): Request[BackendServiceAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[BackendServiceAggregatedList] = js.native
  
  /** Deletes the specified BackendService resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: AltBackendService): Request[Operation] = js.native
  
  /** Deletes a key for validating requests with signed URLs for this backend service. */
  def deleteSignedUrlKey(): Request[Operation] = js.native
  def deleteSignedUrlKey(request: BackendServiceFields): Request[Operation] = js.native
  
  /** Returns the specified BackendService resource. Gets a list of available backend services. */
  def get(): Request[BackendService] = js.native
  def get(request: OauthtokenPrettyPrint): Request[BackendService] = js.native
  
  def getHealth(request: OauthtokenPrettyPrint, body: ResourceGroupReference): Request[BackendServiceGroupHealth] = js.native
  /**
    * Gets the most recent health check results for this BackendService.
    *
    * Example request body:
    *
    * { "group": "/zones/us-east1-b/instanceGroups/lb-backend-example" }
    */
  def getHealth(request: PrettyPrintProject): Request[BackendServiceGroupHealth] = js.native
  
  def insert(request: FieldsKey, body: BackendService): Request[Operation] = js.native
  /** Creates a BackendService resource in the specified project using the data included in the request. For more information, see  Backend services overview. */
  def insert(request: ProjectQuotaUser): Request[Operation] = js.native
  
  /** Retrieves the list of BackendService resources available to the specified project. */
  def list(): Request[BackendServiceList] = js.native
  def list(request: MaxResults): Request[BackendServiceList] = js.native
  
  def patch(request: AltBackendService, body: BackendService): Request[Operation] = js.native
  /**
    * Patches the specified BackendService resource with the data included in the request. For more information, see  Backend services overview. This method supports PATCH semantics and
    * uses the JSON merge patch format and processing rules.
    */
  def patch(request: QuotaUserRequestId): Request[Operation] = js.native
  
  def setSecurityPolicy(request: AltBackendService, body: SecurityPolicyReference): Request[Operation] = js.native
  /** Sets the security policy for the specified backend service. */
  def setSecurityPolicy(request: RequestIdResource): Request[Operation] = js.native
  
  def update(request: AltBackendService, body: BackendService): Request[Operation] = js.native
  /** Updates the specified BackendService resource with the data included in the request. For more information, see Backend services overview. */
  def update(request: QuotaUserRequestId): Request[Operation] = js.native
}
