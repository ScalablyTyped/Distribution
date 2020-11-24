package typings.maximMazurokGapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAcceleratedmobilepageurl.anon.Accesstoken
import typings.maximMazurokGapiClientAcceleratedmobilepageurl.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmpUrlsResource extends js.Object {
  
  /** Returns AMP URL(s) and equivalent [AMP Cache URL(s)](/amp/cache/overview#amp-cache-url-format). */
  def batchGet(request: Accesstoken): Request[BatchGetAmpUrlsResponse] = js.native
  def batchGet(request: Alt, body: BatchGetAmpUrlsRequest): Request[BatchGetAmpUrlsResponse] = js.native
}
