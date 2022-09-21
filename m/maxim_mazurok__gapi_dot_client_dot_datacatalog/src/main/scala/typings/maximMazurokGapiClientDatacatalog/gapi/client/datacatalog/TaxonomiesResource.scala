package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.Key
import typings.maximMazurokGapiClientDatacatalog.anon.Oauthtoken
import typings.maximMazurokGapiClientDatacatalog.anon.PageToken
import typings.maximMazurokGapiClientDatacatalog.anon.ParentPrettyPrint
import typings.maximMazurokGapiClientDatacatalog.anon.QuotaUserResource
import typings.maximMazurokGapiClientDatacatalog.anon.ResourceUpdateMask
import typings.maximMazurokGapiClientDatacatalog.anon.ResourceUploadType
import typings.maximMazurokGapiClientDatacatalog.anon.SerializedTaxonomies
import typings.maximMazurokGapiClientDatacatalog.anon.UpdateMask
import typings.maximMazurokGapiClientDatacatalog.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaxonomiesResource extends StObject {
  
  /** Creates a taxonomy in a specified project. The taxonomy is initially empty, that is, it doesn't contain policy tags. */
  def create(request: ParentPrettyPrint): Request[GoogleCloudDatacatalogV1Taxonomy] = js.native
  def create(request: Uploadprotocol, body: GoogleCloudDatacatalogV1Taxonomy): Request[GoogleCloudDatacatalogV1Taxonomy] = js.native
  
  /** Deletes a taxonomy, including all policy tags in this taxonomy, their associated policies, and the policy tags references from BigQuery columns. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /**
    * Exports taxonomies in the requested type and returns them, including their policy tags. The requested taxonomies must belong to the same project. This method generates
    * `SerializedTaxonomy` protocol buffers with nested policy tags that can be used as input for `ImportTaxonomies` calls.
    */
  def `export`(): Request[GoogleCloudDatacatalogV1ExportTaxonomiesResponse] = js.native
  def `export`(request: SerializedTaxonomies): Request[GoogleCloudDatacatalogV1ExportTaxonomiesResponse] = js.native
  
  /** Gets a taxonomy. */
  def get(): Request[GoogleCloudDatacatalogV1Taxonomy] = js.native
  def get(request: Key): Request[GoogleCloudDatacatalogV1Taxonomy] = js.native
  
  /** Gets the IAM policy for a policy tag or a taxonomy. */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Creates new taxonomies (including their policy tags) in a given project by importing from inlined or cross-regional sources. For a cross-regional source, new taxonomies are created
    * by copying from a source in another region. For an inlined source, taxonomies and policy tags are created in bulk using nested protocol buffer structures.
    */
  def `import`(request: QuotaUserResource): Request[GoogleCloudDatacatalogV1ImportTaxonomiesResponse] = js.native
  def `import`(request: Uploadprotocol, body: GoogleCloudDatacatalogV1ImportTaxonomiesRequest): Request[GoogleCloudDatacatalogV1ImportTaxonomiesResponse] = js.native
  
  /** Lists all taxonomies in a project in a particular location that you have a permission to view. */
  def list(): Request[GoogleCloudDatacatalogV1ListTaxonomiesResponse] = js.native
  def list(request: PageToken): Request[GoogleCloudDatacatalogV1ListTaxonomiesResponse] = js.native
  
  /** Updates a taxonomy, including its display name, description, and activated policy types. */
  def patch(request: ResourceUpdateMask): Request[GoogleCloudDatacatalogV1Taxonomy] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDatacatalogV1Taxonomy): Request[GoogleCloudDatacatalogV1Taxonomy] = js.native
  
  var policyTags: PolicyTagsResource = js.native
  
  def replace(request: Key, body: GoogleCloudDatacatalogV1ReplaceTaxonomyRequest): Request[GoogleCloudDatacatalogV1Taxonomy] = js.native
  /**
    * Replaces (updates) a taxonomy and all its policy tags. The taxonomy and its entire hierarchy of policy tags must be represented literally by `SerializedTaxonomy` and the nested
    * `SerializedPolicyTag` messages. This operation automatically does the following: - Deletes the existing policy tags that are missing from the `SerializedPolicyTag`. - Creates policy
    * tags that don't have resource names. They are considered new. - Updates policy tags with valid resources names accordingly.
    */
  def replace(request: ResourceUploadType): Request[GoogleCloudDatacatalogV1Taxonomy] = js.native
  
  /** Sets the IAM policy for a policy tag or a taxonomy. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns your permissions on a specified policy tag or taxonomy. */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
