package typings.maximMazurokGapiClientChat.gapi.client.chat

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientChat.anon.Alt
import typings.maximMazurokGapiClientChat.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpacesResource extends js.Object {
  
  /** Returns a space. */
  def get(): Request[Space] = js.native
  def get(request: Alt): Request[Space] = js.native
  
  /** Lists spaces the caller is a member of. */
  def list(): Request[ListSpacesResponse] = js.native
  def list(request: PageSize): Request[ListSpacesResponse] = js.native
  
  var members: MembersResource = js.native
  
  var messages: MessagesResource = js.native
}
