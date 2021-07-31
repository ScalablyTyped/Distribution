package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.Key
import typings.maximMazurokGapiClientDatacatalog.anon.PageToken
import typings.maximMazurokGapiClientDatacatalog.anon.Parent
import typings.maximMazurokGapiClientDatacatalog.anon.PrettyPrint
import typings.maximMazurokGapiClientDatacatalog.anon.QuotaUser
import typings.maximMazurokGapiClientDatacatalog.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsResource extends StObject {
  
  /**
    * Creates a tag on an Entry. Note: The project identified by the `parent` parameter for the
    * [tag](https://cloud.google.com/data-catalog/docs/reference/rest/v1beta1/projects.locations.entryGroups.entries.tags/create#path-parameters) and the [tag
    * template](https://cloud.google.com/data-catalog/docs/reference/rest/v1beta1/projects.locations.tagTemplates/create#path-parameters) used to create the tag must be from the same
    * organization.
    */
  def create(request: Parent): Request[GoogleCloudDatacatalogV1beta1Tag] = js.native
  def create(request: QuotaUser, body: GoogleCloudDatacatalogV1beta1Tag): Request[GoogleCloudDatacatalogV1beta1Tag] = js.native
  
  /** Deletes a tag. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Lists the tags on an Entry. */
  def list(): Request[GoogleCloudDatacatalogV1beta1ListTagsResponse] = js.native
  def list(request: PageToken): Request[GoogleCloudDatacatalogV1beta1ListTagsResponse] = js.native
  
  def patch(request: PrettyPrint, body: GoogleCloudDatacatalogV1beta1Tag): Request[GoogleCloudDatacatalogV1beta1Tag] = js.native
  /** Updates an existing tag. */
  def patch(request: Resource): Request[GoogleCloudDatacatalogV1beta1Tag] = js.native
}
