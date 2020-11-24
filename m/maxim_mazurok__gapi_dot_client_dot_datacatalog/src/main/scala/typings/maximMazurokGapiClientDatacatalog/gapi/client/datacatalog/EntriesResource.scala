package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.Callback
import typings.maximMazurokGapiClientDatacatalog.anon.EntryId
import typings.maximMazurokGapiClientDatacatalog.anon.Fields
import typings.maximMazurokGapiClientDatacatalog.anon.Key
import typings.maximMazurokGapiClientDatacatalog.anon.Name
import typings.maximMazurokGapiClientDatacatalog.anon.Oauthtoken
import typings.maximMazurokGapiClientDatacatalog.anon.PageSize
import typings.maximMazurokGapiClientDatacatalog.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntriesResource extends js.Object {
  
  /**
    * Creates an entry. Only entries of 'FILESET' type or user-specified type can be created. Users should enable the Data Catalog API in the project identified by the `parent` parameter
    * (see [Data Catalog Resource Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information). A maximum of 100,000 entries may be created per
    * entry group.
    */
  def create(request: EntryId): Request[GoogleCloudDatacatalogV1beta1Entry] = js.native
  def create(request: Fields, body: GoogleCloudDatacatalogV1beta1Entry): Request[GoogleCloudDatacatalogV1beta1Entry] = js.native
  
  /**
    * Deletes an existing entry. Only entries created through CreateEntry method can be deleted. Users should enable the Data Catalog API in the project identified by the `name` parameter
    * (see [Data Catalog Resource Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets an entry. */
  def get(): Request[GoogleCloudDatacatalogV1beta1Entry] = js.native
  def get(request: Key): Request[GoogleCloudDatacatalogV1beta1Entry] = js.native
  
  /**
    * Gets the access control policy for a resource. A `NOT_FOUND` error is returned if the resource does not exist. An empty policy is returned if the resource exists but does not have a
    * policy set on it. Supported resources are: - Tag templates. - Entries. - Entry groups. Note, this method cannot be used to manage policies for BigQuery, Pub/Sub and any external
    * Google Cloud Platform resources synced to Data Catalog. Callers must have following Google IAM permission - `datacatalog.tagTemplates.getIamPolicy` to get policies on tag templates.
    * - `datacatalog.entries.getIamPolicy` to get policies on entries. - `datacatalog.entryGroups.getIamPolicy` to get policies on entry groups.
    */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists entries. */
  def list(): Request[GoogleCloudDatacatalogV1beta1ListEntriesResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudDatacatalogV1beta1ListEntriesResponse] = js.native
  
  /** Get an entry by target resource name. This method allows clients to use the resource name from the source Google Cloud Platform service to get the Data Catalog Entry. */
  def lookup(): Request[GoogleCloudDatacatalogV1beta1Entry] = js.native
  def lookup(request: Callback): Request[GoogleCloudDatacatalogV1beta1Entry] = js.native
  
  /**
    * Updates an existing entry. Users should enable the Data Catalog API in the project identified by the `entry.name` parameter (see [Data Catalog Resource Project]
    * (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    */
  def patch(request: Name): Request[GoogleCloudDatacatalogV1beta1Entry] = js.native
  def patch(request: PrettyPrint, body: GoogleCloudDatacatalogV1beta1Entry): Request[GoogleCloudDatacatalogV1beta1Entry] = js.native
  
  var tags: TagsResource = js.native
  
  /**
    * Returns the caller's permissions on a resource. If the resource does not exist, an empty set of permissions is returned (We don't return a `NOT_FOUND` error). Supported resources
    * are: - Tag templates. - Entries. - Entry groups. Note, this method cannot be used to manage policies for BigQuery, Pub/Sub and any external Google Cloud Platform resources synced to
    * Data Catalog. A caller is not required to have Google IAM permission to make this request.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
