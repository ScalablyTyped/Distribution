package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBlogger.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageViewsResource extends js.Object {
  
  /** Gets page views by blog id. */
  def get(): Request[Pageviews] = js.native
  def get(request: QuotaUser): Request[Pageviews] = js.native
}
