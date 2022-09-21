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
import typings.maximMazurokGapiClientDatacatalog.anon.QuotaUser
import typings.maximMazurokGapiClientDatacatalog.anon.Resource
import typings.maximMazurokGapiClientDatacatalog.anon.UpdateMask
import typings.maximMazurokGapiClientDatacatalog.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntriesResource extends StObject {
  
  /**
    * Creates an entry. You can create entries only with 'FILESET', 'CLUSTER', 'DATA_STREAM', or custom types. Data Catalog automatically creates entries with other types during metadata
    * ingestion from integrated systems. You must enable the Data Catalog API in the project identified by the `parent` parameter. For more information, see [Data Catalog resource
    * project](https://cloud.google.com/data-catalog/docs/concepts/resource-project). An entry group can have a maximum of 100,000 entries.
    */
  def create(request: EntryId): Request[GoogleCloudDatacatalogV1Entry] = js.native
  def create(request: Fields, body: GoogleCloudDatacatalogV1Entry): Request[GoogleCloudDatacatalogV1Entry] = js.native
  
  /**
    * Deletes an existing entry. You can delete only the entries created by the CreateEntry method. You must enable the Data Catalog API in the project identified by the `name` parameter.
    * For more information, see [Data Catalog resource project](https://cloud.google.com/data-catalog/docs/concepts/resource-project).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets an entry. */
  def get(): Request[GoogleCloudDatacatalogV1Entry] = js.native
  def get(request: Key): Request[GoogleCloudDatacatalogV1Entry] = js.native
  
  /**
    * Gets the access control policy for a resource. May return: * A`NOT_FOUND` error if the resource doesn't exist or you don't have the permission to view it. * An empty policy if the
    * resource exists but doesn't have a set policy. Supported resources are: - Tag templates - Entry groups Note: This method doesn't get policies from Google Cloud Platform resources
    * ingested into Data Catalog. To call this method, you must have the following Google IAM permissions: - `datacatalog.tagTemplates.getIamPolicy` to get policies on tag templates. -
    * `datacatalog.entryGroups.getIamPolicy` to get policies on entry groups.
    */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists entries. Note: Currently, this method can list only custom entries. To get a list of both custom and automatically created entries, use SearchCatalog. */
  def list(): Request[GoogleCloudDatacatalogV1ListEntriesResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudDatacatalogV1ListEntriesResponse] = js.native
  
  /** Gets an entry by its target resource name. The resource name comes from the source Google Cloud Platform service. */
  def lookup(): Request[GoogleCloudDatacatalogV1Entry] = js.native
  def lookup(request: Callback): Request[GoogleCloudDatacatalogV1Entry] = js.native
  
  def modifyEntryContacts(request: Key, body: GoogleCloudDatacatalogV1ModifyEntryContactsRequest): Request[GoogleCloudDatacatalogV1Contacts] = js.native
  /** Modifies contacts, part of the business context of an Entry. To call this method, you must have the `datacatalog.entries.updateContacts` IAM permission on the corresponding project. */
  def modifyEntryContacts(request: Name): Request[GoogleCloudDatacatalogV1Contacts] = js.native
  
  def modifyEntryOverview(request: Key, body: GoogleCloudDatacatalogV1ModifyEntryOverviewRequest): Request[GoogleCloudDatacatalogV1EntryOverview] = js.native
  /**
    * Modifies entry overview, part of the business context of an Entry. To call this method, you must have the `datacatalog.entries.updateOverview` IAM permission on the corresponding
    * project.
    */
  def modifyEntryOverview(request: PrettyPrint): Request[GoogleCloudDatacatalogV1EntryOverview] = js.native
  
  /**
    * Updates an existing entry. You must enable the Data Catalog API in the project identified by the `entry.name` parameter. For more information, see [Data Catalog resource
    * project](https://cloud.google.com/data-catalog/docs/concepts/resource-project).
    */
  def patch(request: QuotaUser): Request[GoogleCloudDatacatalogV1Entry] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDatacatalogV1Entry): Request[GoogleCloudDatacatalogV1Entry] = js.native
  
  def star(request: Key, body: GoogleCloudDatacatalogV1StarEntryRequest): Request[js.Object] = js.native
  /** Marks an Entry as starred by the current user. Starring information is private to each user. */
  def star(request: Resource): Request[js.Object] = js.native
  
  var tags: TagsResource = js.native
  
  /**
    * Gets your permissions on a resource. Returns an empty set of permissions if the resource doesn't exist. Supported resources are: - Tag templates - Entry groups Note: This method
    * gets policies only within Data Catalog and can't be used to get policies from BigQuery, Pub/Sub, Dataproc Metastore, and any external Google Cloud Platform resources ingested into
    * Data Catalog. No Google IAM permissions are required to call this method.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def unstar(request: Key, body: GoogleCloudDatacatalogV1UnstarEntryRequest): Request[js.Object] = js.native
  /** Marks an Entry as NOT starred by the current user. Starring information is private to each user. */
  def unstar(request: UploadType): Request[js.Object] = js.native
}
