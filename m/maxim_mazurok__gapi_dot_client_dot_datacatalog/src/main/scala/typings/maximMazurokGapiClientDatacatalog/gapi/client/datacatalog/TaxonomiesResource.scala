package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.Key
import typings.maximMazurokGapiClientDatacatalog.anon.NameOauthtoken
import typings.maximMazurokGapiClientDatacatalog.anon.Oauthtoken
import typings.maximMazurokGapiClientDatacatalog.anon.OauthtokenParent
import typings.maximMazurokGapiClientDatacatalog.anon.PageToken
import typings.maximMazurokGapiClientDatacatalog.anon.ParentPrettyPrint
import typings.maximMazurokGapiClientDatacatalog.anon.PrettyPrint
import typings.maximMazurokGapiClientDatacatalog.anon.QuotaUser
import typings.maximMazurokGapiClientDatacatalog.anon.SerializedTaxonomies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaxonomiesResource extends js.Object {
  
  /** Creates a taxonomy in the specified project. */
  def create(request: OauthtokenParent): Request[GoogleCloudDatacatalogV1beta1Taxonomy] = js.native
  def create(request: QuotaUser, body: GoogleCloudDatacatalogV1beta1Taxonomy): Request[GoogleCloudDatacatalogV1beta1Taxonomy] = js.native
  
  /** Deletes a taxonomy. This operation will also delete all policy tags in this taxonomy along with their associated policies. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /**
    * Exports all taxonomies and their policy tags in a project. This method generates SerializedTaxonomy protos with nested policy tags that can be used as an input for future
    * ImportTaxonomies calls.
    */
  def export(): Request[GoogleCloudDatacatalogV1beta1ExportTaxonomiesResponse] = js.native
  def export(request: SerializedTaxonomies): Request[GoogleCloudDatacatalogV1beta1ExportTaxonomiesResponse] = js.native
  
  /** Gets a taxonomy. */
  def get(): Request[GoogleCloudDatacatalogV1beta1Taxonomy] = js.native
  def get(request: Key): Request[GoogleCloudDatacatalogV1beta1Taxonomy] = js.native
  
  /** Gets the IAM policy for a taxonomy or a policy tag. */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Imports all taxonomies and their policy tags to a project as new taxonomies. This method provides a bulk taxonomy / policy tag creation using nested proto structure. */
  def `import`(request: ParentPrettyPrint): Request[GoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse] = js.native
  def `import`(request: QuotaUser, body: GoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest): Request[GoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse] = js.native
  
  /** Lists all taxonomies in a project in a particular location that the caller has permission to view. */
  def list(): Request[GoogleCloudDatacatalogV1beta1ListTaxonomiesResponse] = js.native
  def list(request: PageToken): Request[GoogleCloudDatacatalogV1beta1ListTaxonomiesResponse] = js.native
  
  /** Updates a taxonomy. */
  def patch(request: NameOauthtoken): Request[GoogleCloudDatacatalogV1beta1Taxonomy] = js.native
  def patch(request: PrettyPrint, body: GoogleCloudDatacatalogV1beta1Taxonomy): Request[GoogleCloudDatacatalogV1beta1Taxonomy] = js.native
  
  var policyTags: PolicyTagsResource = js.native
  
  /** Sets the IAM policy for a taxonomy or a policy tag. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns the permissions that a caller has on the specified taxonomy or policy tag. */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
