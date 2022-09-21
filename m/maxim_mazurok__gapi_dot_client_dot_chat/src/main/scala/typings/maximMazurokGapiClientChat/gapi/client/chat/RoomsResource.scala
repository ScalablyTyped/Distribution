package typings.maximMazurokGapiClientChat.gapi.client.chat

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientChat.anon.Accesstoken
import typings.maximMazurokGapiClientChat.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomsResource extends StObject {
  
  var conversations: ConversationsResource = js.native
  
  /** Legacy path for creating message. Calling these will result in a BadRequest response. */
  def messages(request: Accesstoken): Request[Message] = js.native
  def messages(request: Alt, body: Message): Request[Message] = js.native
  
  /** Legacy path for creating message. Calling these will result in a BadRequest response. */
  def webhooks(request: Accesstoken): Request[Message] = js.native
  def webhooks(request: Alt, body: Message): Request[Message] = js.native
}
