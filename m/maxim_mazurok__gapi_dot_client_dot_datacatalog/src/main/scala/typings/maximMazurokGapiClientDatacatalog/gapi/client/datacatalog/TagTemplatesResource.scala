package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.CallbackFields
import typings.maximMazurokGapiClientDatacatalog.anon.FieldsKey
import typings.maximMazurokGapiClientDatacatalog.anon.Force
import typings.maximMazurokGapiClientDatacatalog.anon.Key
import typings.maximMazurokGapiClientDatacatalog.anon.Oauthtoken
import typings.maximMazurokGapiClientDatacatalog.anon.PrettyPrint
import typings.maximMazurokGapiClientDatacatalog.anon.TagTemplateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagTemplatesResource extends js.Object {
  
  def create(request: CallbackFields, body: GoogleCloudDatacatalogV1beta1TagTemplate): Request[GoogleCloudDatacatalogV1beta1TagTemplate] = js.native
  /**
    * Creates a tag template. The user should enable the Data Catalog API in the project identified by the `parent` parameter (see [Data Catalog Resource
    * Project](https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    */
  def create(request: TagTemplateId): Request[GoogleCloudDatacatalogV1beta1TagTemplate] = js.native
  
  /**
    * Deletes a tag template and all tags using the template. Users should enable the Data Catalog API in the project identified by the `name` parameter (see [Data Catalog Resource
    * Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  var fields: FieldsResource = js.native
  
  /** Gets a tag template. */
  def get(): Request[GoogleCloudDatacatalogV1beta1TagTemplate] = js.native
  def get(request: Key): Request[GoogleCloudDatacatalogV1beta1TagTemplate] = js.native
  
  /**
    * Gets the access control policy for a resource. A `NOT_FOUND` error is returned if the resource does not exist. An empty policy is returned if the resource exists but does not have a
    * policy set on it. Supported resources are: - Tag templates. - Entries. - Entry groups. Note, this method cannot be used to manage policies for BigQuery, Pub/Sub and any external
    * Google Cloud Platform resources synced to Data Catalog. Callers must have following Google IAM permission - `datacatalog.tagTemplates.getIamPolicy` to get policies on tag templates.
    * - `datacatalog.entries.getIamPolicy` to get policies on entries. - `datacatalog.entryGroups.getIamPolicy` to get policies on entry groups.
    */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Updates a tag template. This method cannot be used to update the fields of a template. The tag template fields are represented as separate resources and should be updated using
    * their own create/update/delete methods. Users should enable the Data Catalog API in the project identified by the `tag_template.name` parameter (see [Data Catalog Resource Project]
    * (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    */
  def patch(request: FieldsKey): Request[GoogleCloudDatacatalogV1beta1TagTemplate] = js.native
  def patch(request: PrettyPrint, body: GoogleCloudDatacatalogV1beta1TagTemplate): Request[GoogleCloudDatacatalogV1beta1TagTemplate] = js.native
  
  /**
    * Sets the access control policy for a resource. Replaces any existing policy. Supported resources are: - Tag templates. - Entries. - Entry groups. Note, this method cannot be used to
    * manage policies for BigQuery, Pub/Sub and any external Google Cloud Platform resources synced to Data Catalog. Callers must have following Google IAM permission -
    * `datacatalog.tagTemplates.setIamPolicy` to set policies on tag templates. - `datacatalog.entries.setIamPolicy` to set policies on entries. - `datacatalog.entryGroups.setIamPolicy`
    * to set policies on entry groups.
    */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns the caller's permissions on a resource. If the resource does not exist, an empty set of permissions is returned (We don't return a `NOT_FOUND` error). Supported resources
    * are: - Tag templates. - Entries. - Entry groups. Note, this method cannot be used to manage policies for BigQuery, Pub/Sub and any external Google Cloud Platform resources synced to
    * Data Catalog. A caller is not required to have Google IAM permission to make this request.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
