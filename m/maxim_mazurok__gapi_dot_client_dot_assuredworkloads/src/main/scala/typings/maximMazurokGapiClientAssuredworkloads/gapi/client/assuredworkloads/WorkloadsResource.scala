package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAssuredworkloads.anon.Accesstoken
import typings.maximMazurokGapiClientAssuredworkloads.anon.Callback
import typings.maximMazurokGapiClientAssuredworkloads.anon.Etag
import typings.maximMazurokGapiClientAssuredworkloads.anon.ExternalId
import typings.maximMazurokGapiClientAssuredworkloads.anon.Fields
import typings.maximMazurokGapiClientAssuredworkloads.anon.Key
import typings.maximMazurokGapiClientAssuredworkloads.anon.Name
import typings.maximMazurokGapiClientAssuredworkloads.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkloadsResource extends StObject {
  
  /** Creates Assured Workload. */
  def create(request: Callback): Request[GoogleLongrunningOperation] = js.native
  def create(request: ExternalId, body: GoogleCloudAssuredworkloadsV1Workload): Request[GoogleLongrunningOperation] = js.native
  
  /** Deletes the workload. Make sure that workload's direct children are already in a deleted state, otherwise the request will fail with a FAILED_PRECONDITION error. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Etag): Request[js.Object] = js.native
  
  /** Gets Assured Workload associated with a CRM Node */
  def get(): Request[GoogleCloudAssuredworkloadsV1Workload] = js.native
  def get(request: Accesstoken): Request[GoogleCloudAssuredworkloadsV1Workload] = js.native
  
  /** Lists Assured Workloads under a CRM Node. */
  def list(): Request[GoogleCloudAssuredworkloadsV1ListWorkloadsResponse] = js.native
  def list(request: Fields): Request[GoogleCloudAssuredworkloadsV1ListWorkloadsResponse] = js.native
  
  /**
    * Updates an existing workload. Currently allows updating of workload display_name and labels. For force updates don't set etag field in the Workload. Only one update operation per
    * workload can be in progress.
    */
  def patch(request: Key): Request[GoogleCloudAssuredworkloadsV1Workload] = js.native
  def patch(request: Name, body: GoogleCloudAssuredworkloadsV1Workload): Request[GoogleCloudAssuredworkloadsV1Workload] = js.native
  
  def restrictAllowedResources(request: Accesstoken, body: GoogleCloudAssuredworkloadsV1RestrictAllowedResourcesRequest): Request[js.Object] = js.native
  /**
    * Restrict the list of resources allowed in the Workload environment. The current list of allowed products can be found at
    * https://cloud.google.com/assured-workloads/docs/supported-products In addition to assuredworkloads.workload.update permission, the user should also have orgpolicy.policy.set
    * permission on the folder resource to use this functionality.
    */
  def restrictAllowedResources(request: Oauthtoken): Request[js.Object] = js.native
}
