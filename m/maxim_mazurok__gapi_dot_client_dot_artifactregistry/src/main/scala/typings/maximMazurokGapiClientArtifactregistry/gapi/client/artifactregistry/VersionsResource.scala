package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientArtifactregistry.anon.Force
import typings.maximMazurokGapiClientArtifactregistry.anon.PageSize
import typings.maximMazurokGapiClientArtifactregistry.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionsResource extends StObject {
  
  /** Deletes a version and all of its content. The returned operation will complete once the version has been deleted. */
  def delete(): Request[Operation] = js.native
  def delete(request: Force): Request[Operation] = js.native
  
  /** Gets a version */
  def get(): Request[Version] = js.native
  def get(request: PrettyPrint): Request[Version] = js.native
  
  /** Lists versions. */
  def list(): Request[ListVersionsResponse] = js.native
  def list(request: PageSize): Request[ListVersionsResponse] = js.native
}
