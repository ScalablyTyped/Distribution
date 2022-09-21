package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientArtifactregistry.anon.Accesstoken
import typings.maximMazurokGapiClientArtifactregistry.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DockerImagesResource extends StObject {
  
  /** Gets a docker image. */
  def get(): Request[DockerImage] = js.native
  def get(request: Accesstoken): Request[DockerImage] = js.native
  
  /** Lists docker images. */
  def list(): Request[ListDockerImagesResponse] = js.native
  def list(request: Key): Request[ListDockerImagesResponse] = js.native
}
