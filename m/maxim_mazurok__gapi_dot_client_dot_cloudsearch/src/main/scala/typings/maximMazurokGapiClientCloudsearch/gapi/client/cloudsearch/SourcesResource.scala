package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudsearch.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourcesResource extends StObject {
  
  /**
    * Returns list of sources that user can use for Search and Suggest APIs. **Note:** This API requires a standard end user account to execute. A service account can't perform Query API
    * requests directly; to use a service account to perform queries, set up [G Suite domain-wide delegation of
    * authority](https://developers.google.com/cloud-search/docs/guides/delegation/).
    */
  def list(): Request[ListQuerySourcesResponse] = js.native
  def list(request: PageToken): Request[ListQuerySourcesResponse] = js.native
}
