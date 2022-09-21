package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.AccesstokenAlt
import typings.maximMazurokGapiClientDatacatalog.anon.AltCallback
import typings.maximMazurokGapiClientDatacatalog.anon.EntryGroupId
import typings.maximMazurokGapiClientDatacatalog.anon.Force
import typings.maximMazurokGapiClientDatacatalog.anon.Oauthtoken
import typings.maximMazurokGapiClientDatacatalog.anon.PageToken
import typings.maximMazurokGapiClientDatacatalog.anon.ReadMask
import typings.maximMazurokGapiClientDatacatalog.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryGroupsResource extends StObject {
  
  def create(request: AccesstokenAlt, body: GoogleCloudDatacatalogV1EntryGroup): Request[GoogleCloudDatacatalogV1EntryGroup] = js.native
  /**
    * Creates an entry group. An entry group contains logically related entries together with [Cloud Identity and Access Management](/data-catalog/docs/concepts/iam) policies. These
    * policies specify users who can create, edit, and view entries within entry groups. Data Catalog automatically creates entry groups with names that start with the `@` symbol for the
    * following resources: * BigQuery entries (`@bigquery`) * Pub/Sub topics (`@pubsub`) * Dataproc Metastore services (`@dataproc_metastore_{SERVICE_NAME_HASH}`) You can create your own
    * entry groups for Cloud Storage fileset entries and custom entries together with the corresponding IAM policies. User-created entry groups can't contain the `@` symbol, it is
    * reserved for automatically created groups. Entry groups, like entries, can be searched. A maximum of 10,000 entry groups may be created per organization across all locations. You
    * must enable the Data Catalog API in the project identified by the `parent` parameter. For more information, see [Data Catalog resource
    * project](https://cloud.google.com/data-catalog/docs/concepts/resource-project).
    */
  def create(request: EntryGroupId): Request[GoogleCloudDatacatalogV1EntryGroup] = js.native
  
  /**
    * Deletes an entry group. You must enable the Data Catalog API in the project identified by the `name` parameter. For more information, see [Data Catalog resource
    * project](https://cloud.google.com/data-catalog/docs/concepts/resource-project).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  var entries: EntriesResource = js.native
  
  /** Gets an entry group. */
  def get(): Request[GoogleCloudDatacatalogV1EntryGroup] = js.native
  def get(request: ReadMask): Request[GoogleCloudDatacatalogV1EntryGroup] = js.native
  
  /**
    * Gets the access control policy for a resource. May return: * A`NOT_FOUND` error if the resource doesn't exist or you don't have the permission to view it. * An empty policy if the
    * resource exists but doesn't have a set policy. Supported resources are: - Tag templates - Entry groups Note: This method doesn't get policies from Google Cloud Platform resources
    * ingested into Data Catalog. To call this method, you must have the following Google IAM permissions: - `datacatalog.tagTemplates.getIamPolicy` to get policies on tag templates. -
    * `datacatalog.entryGroups.getIamPolicy` to get policies on entry groups.
    */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists entry groups. */
  def list(): Request[GoogleCloudDatacatalogV1ListEntryGroupsResponse] = js.native
  def list(request: PageToken): Request[GoogleCloudDatacatalogV1ListEntryGroupsResponse] = js.native
  
  /**
    * Updates an entry group. You must enable the Data Catalog API in the project identified by the `entry_group.name` parameter. For more information, see [Data Catalog resource
    * project](https://cloud.google.com/data-catalog/docs/concepts/resource-project).
    */
  def patch(request: AltCallback): Request[GoogleCloudDatacatalogV1EntryGroup] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDatacatalogV1EntryGroup): Request[GoogleCloudDatacatalogV1EntryGroup] = js.native
  
  /**
    * Sets an access control policy for a resource. Replaces any existing policy. Supported resources are: - Tag templates - Entry groups Note: This method sets policies only within Data
    * Catalog and can't be used to manage policies in BigQuery, Pub/Sub, Dataproc Metastore, and any external Google Cloud Platform resources synced with the Data Catalog. To call this
    * method, you must have the following Google IAM permissions: - `datacatalog.tagTemplates.setIamPolicy` to set policies on tag templates. - `datacatalog.entryGroups.setIamPolicy` to
    * set policies on entry groups.
    */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  var tags: TagsResource = js.native
  
  /**
    * Gets your permissions on a resource. Returns an empty set of permissions if the resource doesn't exist. Supported resources are: - Tag templates - Entry groups Note: This method
    * gets policies only within Data Catalog and can't be used to get policies from BigQuery, Pub/Sub, Dataproc Metastore, and any external Google Cloud Platform resources ingested into
    * Data Catalog. No Google IAM permissions are required to call this method.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
