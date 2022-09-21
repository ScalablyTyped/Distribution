package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientArtifactregistry.anon.Accesstoken
import typings.maximMazurokGapiClientArtifactregistry.anon.Name
import typings.maximMazurokGapiClientArtifactregistry.anon.PageSize
import typings.maximMazurokGapiClientArtifactregistry.anon.Parent
import typings.maximMazurokGapiClientArtifactregistry.anon.PrettyPrint
import typings.maximMazurokGapiClientArtifactregistry.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsResource extends StObject {
  
  /** Creates a tag. */
  def create(request: Parent): Request[Tag] = js.native
  def create(request: PrettyPrint, body: Tag): Request[Tag] = js.native
  
  /** Deletes a tag. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Gets a tag. */
  def get(): Request[Tag] = js.native
  def get(request: Accesstoken): Request[Tag] = js.native
  
  /** Lists tags. */
  def list(): Request[ListTagsResponse] = js.native
  def list(request: PageSize): Request[ListTagsResponse] = js.native
  
  /** Updates a tag. */
  def patch(request: Name): Request[Tag] = js.native
  def patch(request: QuotaUser, body: Tag): Request[Tag] = js.native
}
