package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.Key
import typings.maximMazurokGapiClientDatacatalog.anon.Oauthtoken
import typings.maximMazurokGapiClientDatacatalog.anon.OauthtokenParent
import typings.maximMazurokGapiClientDatacatalog.anon.PageToken
import typings.maximMazurokGapiClientDatacatalog.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientDatacatalog.anon.UpdateMask
import typings.maximMazurokGapiClientDatacatalog.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyTagsResource extends StObject {
  
  /** Creates a policy tag in a taxonomy. */
  def create(request: OauthtokenParent): Request[GoogleCloudDatacatalogV1PolicyTag] = js.native
  def create(request: Uploadprotocol, body: GoogleCloudDatacatalogV1PolicyTag): Request[GoogleCloudDatacatalogV1PolicyTag] = js.native
  
  /**
    * Deletes a policy tag together with the following: * All of its descendant policy tags, if any * Policies associated with the policy tag and its descendants * References from
    * BigQuery table schema of the policy tag and its descendants
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets a policy tag. */
  def get(): Request[GoogleCloudDatacatalogV1PolicyTag] = js.native
  def get(request: Key): Request[GoogleCloudDatacatalogV1PolicyTag] = js.native
  
  /** Gets the IAM policy for a policy tag or a taxonomy. */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists all policy tags in a taxonomy. */
  def list(): Request[GoogleCloudDatacatalogV1ListPolicyTagsResponse] = js.native
  def list(request: PageToken): Request[GoogleCloudDatacatalogV1ListPolicyTagsResponse] = js.native
  
  /** Updates a policy tag, including its display name, description, and parent policy tag. */
  def patch(request: PrettyPrintQuotaUser): Request[GoogleCloudDatacatalogV1PolicyTag] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDatacatalogV1PolicyTag): Request[GoogleCloudDatacatalogV1PolicyTag] = js.native
  
  /** Sets the IAM policy for a policy tag or a taxonomy. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns your permissions on a specified policy tag or taxonomy. */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
