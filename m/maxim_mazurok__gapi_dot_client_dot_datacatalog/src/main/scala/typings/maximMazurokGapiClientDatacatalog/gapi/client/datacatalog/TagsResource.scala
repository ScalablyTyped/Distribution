package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.Key
import typings.maximMazurokGapiClientDatacatalog.anon.PageToken
import typings.maximMazurokGapiClientDatacatalog.anon.Parent
import typings.maximMazurokGapiClientDatacatalog.anon.UpdateMask
import typings.maximMazurokGapiClientDatacatalog.anon.Uploadprotocol
import typings.maximMazurokGapiClientDatacatalog.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsResource extends StObject {
  
  /**
    * Creates a tag and assigns it to: * An Entry if the method name is `projects.locations.entryGroups.entries.tags.create`. * Or EntryGroupif the method name is
    * `projects.locations.entryGroups.tags.create`. Note: The project identified by the `parent` parameter for the [tag]
    * (https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.entries.tags/create#path-parameters) and the [tag template]
    * (https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.tagTemplates/create#path-parameters) used to create the tag must be in the same organization.
    */
  def create(request: Parent): Request[GoogleCloudDatacatalogV1Tag] = js.native
  def create(request: Uploadprotocol, body: GoogleCloudDatacatalogV1Tag): Request[GoogleCloudDatacatalogV1Tag] = js.native
  
  /** Deletes a tag. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Lists tags assigned to an Entry. The columns in the response are lowercased. */
  def list(): Request[GoogleCloudDatacatalogV1ListTagsResponse] = js.native
  def list(request: PageToken): Request[GoogleCloudDatacatalogV1ListTagsResponse] = js.native
  
  def patch(request: UpdateMask, body: GoogleCloudDatacatalogV1Tag): Request[GoogleCloudDatacatalogV1Tag] = js.native
  /** Updates an existing tag. */
  def patch(request: Xgafv): Request[GoogleCloudDatacatalogV1Tag] = js.native
}
