package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientArtifactregistry.anon.Accesstoken
import typings.maximMazurokGapiClientArtifactregistry.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackagesResource extends StObject {
  
  /** Deletes a package and all of its versions and tags. The returned operation will complete once the package has been deleted. */
  def delete(): Request[Operation] = js.native
  def delete(request: Accesstoken): Request[Operation] = js.native
  
  /** Gets a package. */
  def get(): Request[Package] = js.native
  def get(request: Accesstoken): Request[Package] = js.native
  
  /** Lists packages. */
  def list(): Request[ListPackagesResponse] = js.native
  def list(request: Oauthtoken): Request[ListPackagesResponse] = js.native
  
  var tags: TagsResource = js.native
  
  var versions: VersionsResource = js.native
}
