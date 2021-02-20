package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientArtifactregistry.anon.Accesstoken
import typings.maximMazurokGapiClientArtifactregistry.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesResource extends StObject {
  
  /** Gets a file. */
  def get(): Request[File] = js.native
  def get(request: Accesstoken): Request[File] = js.native
  
  /** Lists files. */
  def list(): Request[ListFilesResponse] = js.native
  def list(request: Callback): Request[ListFilesResponse] = js.native
}
