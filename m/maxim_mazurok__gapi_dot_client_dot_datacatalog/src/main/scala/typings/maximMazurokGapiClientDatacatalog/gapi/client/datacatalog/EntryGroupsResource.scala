package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.EntryGroupId
import typings.maximMazurokGapiClientDatacatalog.anon.Force
import typings.maximMazurokGapiClientDatacatalog.anon.Oauthtoken
import typings.maximMazurokGapiClientDatacatalog.anon.PageToken
import typings.maximMazurokGapiClientDatacatalog.anon.PrettyPrint
import typings.maximMazurokGapiClientDatacatalog.anon.ReadMask
import typings.maximMazurokGapiClientDatacatalog.anon.UpdateMask
import typings.maximMazurokGapiClientDatacatalog.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryGroupsResource extends js.Object {
  
  /**
    * A maximum of 10,000 entry groups may be created per organization across all locations. Users should enable the Data Catalog API in the project identified by the `parent` parameter
    * (see [Data Catalog Resource Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    */
  def create(request: EntryGroupId): Request[GoogleCloudDatacatalogV1beta1EntryGroup] = js.native
  def create(request: UploadType, body: GoogleCloudDatacatalogV1beta1EntryGroup): Request[GoogleCloudDatacatalogV1beta1EntryGroup] = js.native
  
  /**
    * Deletes an EntryGroup. Only entry groups that do not contain entries can be deleted. Users should enable the Data Catalog API in the project identified by the `name` parameter (see
    * [Data Catalog Resource Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  var entries: EntriesResource = js.native
  
  /** Gets an EntryGroup. */
  def get(): Request[GoogleCloudDatacatalogV1beta1EntryGroup] = js.native
  def get(request: ReadMask): Request[GoogleCloudDatacatalogV1beta1EntryGroup] = js.native
  
  /**
    * Gets the access control policy for a resource. A `NOT_FOUND` error is returned if the resource does not exist. An empty policy is returned if the resource exists but does not have a
    * policy set on it. Supported resources are: - Tag templates. - Entries. - Entry groups. Note, this method cannot be used to manage policies for BigQuery, Pub/Sub and any external
    * Google Cloud Platform resources synced to Data Catalog. Callers must have following Google IAM permission - `datacatalog.tagTemplates.getIamPolicy` to get policies on tag templates.
    * - `datacatalog.entries.getIamPolicy` to get policies on entries. - `datacatalog.entryGroups.getIamPolicy` to get policies on entry groups.
    */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists entry groups. */
  def list(): Request[GoogleCloudDatacatalogV1beta1ListEntryGroupsResponse] = js.native
  def list(request: PageToken): Request[GoogleCloudDatacatalogV1beta1ListEntryGroupsResponse] = js.native
  
  def patch(request: PrettyPrint, body: GoogleCloudDatacatalogV1beta1EntryGroup): Request[GoogleCloudDatacatalogV1beta1EntryGroup] = js.native
  /**
    * Updates an EntryGroup. The user should enable the Data Catalog API in the project identified by the `entry_group.name` parameter (see [Data Catalog Resource Project]
    * (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    */
  def patch(request: UpdateMask): Request[GoogleCloudDatacatalogV1beta1EntryGroup] = js.native
  
  /**
    * Sets the access control policy for a resource. Replaces any existing policy. Supported resources are: - Tag templates. - Entries. - Entry groups. Note, this method cannot be used to
    * manage policies for BigQuery, Pub/Sub and any external Google Cloud Platform resources synced to Data Catalog. Callers must have following Google IAM permission -
    * `datacatalog.tagTemplates.setIamPolicy` to set policies on tag templates. - `datacatalog.entries.setIamPolicy` to set policies on entries. - `datacatalog.entryGroups.setIamPolicy`
    * to set policies on entry groups.
    */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  var tags: TagsResource = js.native
  
  /**
    * Returns the caller's permissions on a resource. If the resource does not exist, an empty set of permissions is returned (We don't return a `NOT_FOUND` error). Supported resources
    * are: - Tag templates. - Entries. - Entry groups. Note, this method cannot be used to manage policies for BigQuery, Pub/Sub and any external Google Cloud Platform resources synced to
    * Data Catalog. A caller is not required to have Google IAM permission to make this request.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
