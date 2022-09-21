package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientArtifactregistry.anon.Accesstoken
import typings.maximMazurokGapiClientArtifactregistry.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MavenArtifactsResource extends StObject {
  
  /** Gets a maven artifact. */
  def get(): Request[MavenArtifact] = js.native
  def get(request: Accesstoken): Request[MavenArtifact] = js.native
  
  /** Lists maven artifacts. */
  def list(): Request[ListMavenArtifactsResponse] = js.native
  def list(request: Oauthtoken): Request[ListMavenArtifactsResponse] = js.native
}
