package typings.maximMazurokGapiClientCustomsearch.gapi.client.customsearch

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCustomsearch.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiterestrictResource extends js.Object {
  
  /** Returns metadata about the search performed, metadata about the engine used for the search, and the search results. Uses a small set of url patterns. */
  def list(): Request[Search] = js.native
  def list(request: Accesstoken): Request[Search] = js.native
}
