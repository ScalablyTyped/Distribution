package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAppengine.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizedDomainsResource extends js.Object {
  
  /** Lists all domains the user is authorized to administer. */
  def list(): Request[ListAuthorizedDomainsResponse] = js.native
  def list(request: Oauthtoken): Request[ListAuthorizedDomainsResponse] = js.native
}
