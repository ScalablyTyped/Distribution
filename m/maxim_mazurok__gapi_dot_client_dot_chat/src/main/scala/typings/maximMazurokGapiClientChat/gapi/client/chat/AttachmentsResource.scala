package typings.maximMazurokGapiClientChat.gapi.client.chat

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientChat.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsResource extends StObject {
  
  /**
    * Gets the metadata of a message attachment. The attachment data is fetched using the media API. Requires [service account
    * authentication](https://developers.google.com/chat/api/guides/auth/service-accounts).
    */
  def get(): Request[Attachment] = js.native
  def get(request: Fields): Request[Attachment] = js.native
}
