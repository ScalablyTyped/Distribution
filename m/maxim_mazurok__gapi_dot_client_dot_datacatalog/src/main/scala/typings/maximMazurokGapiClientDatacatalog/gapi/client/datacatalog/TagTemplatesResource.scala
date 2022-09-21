package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.Force
import typings.maximMazurokGapiClientDatacatalog.anon.Key
import typings.maximMazurokGapiClientDatacatalog.anon.KeyOauthtoken
import typings.maximMazurokGapiClientDatacatalog.anon.Oauthtoken
import typings.maximMazurokGapiClientDatacatalog.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientDatacatalog.anon.TagTemplateId
import typings.maximMazurokGapiClientDatacatalog.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagTemplatesResource extends StObject {
  
  def create(request: KeyOauthtoken, body: GoogleCloudDatacatalogV1TagTemplate): Request[GoogleCloudDatacatalogV1TagTemplate] = js.native
  /**
    * Creates a tag template. You must enable the Data Catalog API in the project identified by the `parent` parameter. For more information, see [Data Catalog resource project]
    * (https://cloud.google.com/data-catalog/docs/concepts/resource-project).
    */
  def create(request: TagTemplateId): Request[GoogleCloudDatacatalogV1TagTemplate] = js.native
  
  /**
    * Deletes a tag template and all tags that use it. You must enable the Data Catalog API in the project identified by the `name` parameter. For more information, see [Data Catalog
    * resource project](https://cloud.google.com/data-catalog/docs/concepts/resource-project).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  var fields: FieldsResource = js.native
  
  /** Gets a tag template. */
  def get(): Request[GoogleCloudDatacatalogV1TagTemplate] = js.native
  def get(request: Key): Request[GoogleCloudDatacatalogV1TagTemplate] = js.native
  
  /**
    * Gets the access control policy for a resource. May return: * A`NOT_FOUND` error if the resource doesn't exist or you don't have the permission to view it. * An empty policy if the
    * resource exists but doesn't have a set policy. Supported resources are: - Tag templates - Entry groups Note: This method doesn't get policies from Google Cloud Platform resources
    * ingested into Data Catalog. To call this method, you must have the following Google IAM permissions: - `datacatalog.tagTemplates.getIamPolicy` to get policies on tag templates. -
    * `datacatalog.entryGroups.getIamPolicy` to get policies on entry groups.
    */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Updates a tag template. You can't update template fields with this method. These fields are separate resources with their own create, update, and delete methods. You must enable the
    * Data Catalog API in the project identified by the `tag_template.name` parameter. For more information, see [Data Catalog resource
    * project](https://cloud.google.com/data-catalog/docs/concepts/resource-project).
    */
  def patch(request: OauthtokenPrettyPrint): Request[GoogleCloudDatacatalogV1TagTemplate] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDatacatalogV1TagTemplate): Request[GoogleCloudDatacatalogV1TagTemplate] = js.native
  
  /**
    * Sets an access control policy for a resource. Replaces any existing policy. Supported resources are: - Tag templates - Entry groups Note: This method sets policies only within Data
    * Catalog and can't be used to manage policies in BigQuery, Pub/Sub, Dataproc Metastore, and any external Google Cloud Platform resources synced with the Data Catalog. To call this
    * method, you must have the following Google IAM permissions: - `datacatalog.tagTemplates.setIamPolicy` to set policies on tag templates. - `datacatalog.entryGroups.setIamPolicy` to
    * set policies on entry groups.
    */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Gets your permissions on a resource. Returns an empty set of permissions if the resource doesn't exist. Supported resources are: - Tag templates - Entry groups Note: This method
    * gets policies only within Data Catalog and can't be used to get policies from BigQuery, Pub/Sub, Dataproc Metastore, and any external Google Cloud Platform resources ingested into
    * Data Catalog. No Google IAM permissions are required to call this method.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
