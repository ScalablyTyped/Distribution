package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudsearch.anon.Accesstoken
import typings.maximMazurokGapiClientCloudsearch.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmappedidsResource extends StObject {
  
  /** List all unmapped identities for a specific item. **Note:** This API requires an admin account to execute. */
  def list(): Request[ListUnmappedIdentitiesResponse] = js.native
  def list(request: Accesstoken): Request[ListUnmappedIdentitiesResponse] = js.native
  def list(request: Alt): Request[ListUnmappedIdentitiesResponse] = js.native
}
