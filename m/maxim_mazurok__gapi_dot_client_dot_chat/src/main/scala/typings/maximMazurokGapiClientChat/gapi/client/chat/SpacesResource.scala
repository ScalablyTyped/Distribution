package typings.maximMazurokGapiClientChat.gapi.client.chat

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientChat.anon.Accesstoken
import typings.maximMazurokGapiClientChat.anon.Alt
import typings.maximMazurokGapiClientChat.anon.Fields
import typings.maximMazurokGapiClientChat.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpacesResource extends StObject {
  
  /** Returns a space. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts). */
  def get(): Request[Space] = js.native
  def get(request: Fields): Request[Space] = js.native
  
  /** Lists spaces the caller is a member of. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts). */
  def list(): Request[ListSpacesResponse] = js.native
  def list(request: PageSize): Request[ListSpacesResponse] = js.native
  
  var members: MembersResource = js.native
  
  var messages: MessagesResource = js.native
  
  /** Legacy path for creating message. Calling these will result in a BadRequest response. */
  def webhooks(request: Accesstoken): Request[Message] = js.native
  def webhooks(request: Alt, body: Message): Request[Message] = js.native
}
