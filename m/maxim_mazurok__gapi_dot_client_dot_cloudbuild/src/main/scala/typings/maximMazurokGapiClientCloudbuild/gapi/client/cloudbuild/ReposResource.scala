package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudbuild.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposResource extends StObject {
  
  /** List all repositories for a given `BitbucketServerConfig`. This API is experimental. */
  def list(): Request[ListBitbucketServerRepositoriesResponse] = js.native
  def list(request: PageToken): Request[ListBitbucketServerRepositoriesResponse] = js.native
}
