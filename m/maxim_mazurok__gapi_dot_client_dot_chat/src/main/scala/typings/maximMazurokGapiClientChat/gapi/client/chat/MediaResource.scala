package typings.maximMazurokGapiClientChat.gapi.client.chat

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientChat.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaResource extends js.Object {
  
  /** Downloads media. Download is supported on the URI `/v1/media/{+name}?alt=media`. */
  def download(): Request[Media] = js.native
  def download(request: Accesstoken): Request[Media] = js.native
}
